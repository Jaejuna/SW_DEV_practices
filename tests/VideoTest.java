import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {
    Date date = new Date();
    Video video = new Video("movie",3,300, date);
    @Test
    void getLateReturnPointPenalty() {
    }

    @Test
    void getPriceCode() {
    }

    @Test
    void setPriceCode() {

        assertEquals(300,video.getPriceCode());
    }

    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
        assertEquals("movie",video.getTitle());
    }

    @Test
    void isRented() {
    }

    @Test
    void setRented() {
    }

    @Test
    void getRegisteredDate() {
    }

    @Test
    void setRegisteredDate() {
    }

    @Test
    void getVideoType() {
        assertEquals(date,video.getRegisteredDate());
    }

    @Test
    void setVideoType() {
        assertEquals(3,video.getVideoType());
    }
}