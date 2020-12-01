import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {
    Date date = new Date();
    Video video = new Video("movie",3,300, date);

    @Test
    void setPriceCode() {
        assertEquals(300,video.getPriceCode());
    }

    @Test
    void setTitle() {
        assertEquals("movie",video.getTitle());
    }

    @Test
    void setRegisteredDate() {
        assertEquals(date ,video.getRegisteredDate());
    }

    @Test
    void setVideoType() {
        assertEquals(3,video.getVideoType());
    }
}