import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer("Scott");

    Date date = new Date();
    Video video = new Video("movie",3,300, date);
    Rental rental = new Rental(video);

    @Test
    void setName() {
        assertEquals("Scott", customer.getName());
    }

    @Test
    void setRentals() {

    }

    @Test
    void addRental() {
        assertEquals(1, customer.getRentals());
    }
}