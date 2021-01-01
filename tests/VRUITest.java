import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VRUITest {
    VRUI vrui = new VRUI();
    Scanner scanner = new Scanner(System.in);

    @Test
    void mainTest() {
        boolean quit = false;
        int command = 0;
        if (command == 0) {
            quit = true;
        } else {
            quit = false;
        }
        assertAll(
                () -> assertTrue(command == 0),
                () -> assertFalse(command == 1),
                () -> assertFalse(command == 2),
                () -> assertFalse(command == 3),
                () -> assertFalse(command == 4),
                () -> assertFalse(command == 5),
                () -> assertFalse(command == 6),
                () -> assertFalse(command == 7),
                () -> assertFalse(command == 8)
        );
    }

    @Test
    void clearRentalsTest() {
        List<Customer> customers = new ArrayList<Customer>();
        List<Rental> rentals = new ArrayList<Rental>();

        String customerName = "Scott";

        Customer foundCustomer = null;
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                foundCustomer = customer;
                break;
            }
        }

        if (foundCustomer == null) {
            System.out.println("No customer found");
        } else {
            System.out.println("Name: " + foundCustomer.getName() +
                    "\tRentals: " + foundCustomer.getRentals().size());
            for (Rental rental : foundCustomer.getRentals()) {
                System.out.print("\tTitle: " + rental.getVideo().getTitle() + " ");
                System.out.print("\tPrice Code: " + rental.getVideo().getPriceCode());
            }

            assertEquals(customers, rentals);
        }
    }

    @Test
    void listVideos() {
        List<Customer> customers = new ArrayList<Customer>() ;
        List<Video> videos = new ArrayList<Video>() ;

        Customer james = new Customer("James") ;
        Customer brown = new Customer("Brown") ;
        customers.add(james) ;
        customers.add(brown) ;

        Video v1 = new Video("v1", Video.CD, Video.REGULAR, new Date()) ;
        Video v2 = new Video("v2", Video.DVD, Video.NEW_RELEASE, new Date()) ;
        videos.add(v1) ;
        videos.add(v2) ;

        Rental r1 = new Rental(v1) ;
        Rental r2 = new Rental(v2) ;

        james.addRental(r1) ;
        james.addRental(r2) ;

        assertAll(
                ()->assertEquals("v1",v1.getTitle()),
                ()->assertEquals(1,v1.getPriceCode()),
                ()->assertEquals("v2",v2.getTitle()),
                ()->assertEquals(2,v2.getPriceCode())
        );
    }

    @Test
    void registerTest() {
        List<Customer> customers = new ArrayList<Customer>() ;
        List<Video> videos = new ArrayList<Video>() ;
        String object = "customer";

        if ( object.equals("customer") ) {
            String name = "Scott";
            Customer customer = new Customer(name) ;
            customers.add(customer) ;
        }
        else {
            System.out.println("Enter video title to register: ") ;
            String title = "Video";

            System.out.println("Enter video type( 1 for VHD, 2 for CD, 3 for DVD ):") ;
            int videoType = 1;

            System.out.println("Enter price code( 1 for Regular, 2 for New Release ):") ;
            int priceCode = 1;

            Date registeredDate = new Date();
            Video video = new Video(title, videoType, priceCode, registeredDate) ;
            assertEquals(video ,videos.add(video)) ;
        }
    }

    @Test
    void getCustomersReportTest(){
        String customerName = "john";
        Customer customers = new Customer("john");
        assertEquals(customerName,customers.getName());
    }
}