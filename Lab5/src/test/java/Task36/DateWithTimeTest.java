package Task36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateWithTimeTest {

    @Test
    void getHours_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var date = new DateWithTime();
        assertThrows(IndexOutOfBoundsException.class, () -> date.setHours(300));
    }

    @Test
    void setMinutes_WhenArgumentIsIllegal_ThrowsIndexOutOfBoundsException() {
        var date = new DateWithTime();
        assertThrows(IndexOutOfBoundsException.class, () -> date.setMinutes(300));
    }
}