import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    Date date = new Date();
    Video video = new Video("movie",3,300, date);
    Rental rental = new Rental(video);

    @Test
    void setVideo() {
        assertEquals(video ,rental.getVideo());
    }

    @Test
    void returnVideo() {
        assertEquals(0,rental.getStatus());
    }

    @Test
    void setRentDate() {
        assertEquals(date, rental.getRentDate());
    }

    @Test
    void setReturnDate() {
        rental.setReturnDate(date);
        assertEquals(date, rental.getReturnDate());
    }
}