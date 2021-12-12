package Task36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void setDay_WhenArgumentIsIllegal_ThrowsIndexOutOfBoundsException() {
        var date = new Date();
        assertThrows(IndexOutOfBoundsException.class, () -> date.setDay(300));
    }

    @Test
    void setMonth_WhenArgumentIsIllegal_ThrowsIndexOutOfBoundsException() {
        var date = new Date();
        assertThrows(IndexOutOfBoundsException.class, () -> date.setMonth(300));
    }

    @Test
    void setYear_WhenArgumentIsIllegal_ThrowsIndexOutOfBoundsException() {
        var date = new Date();
        assertThrows(IndexOutOfBoundsException.class, () -> date.setYear(300));
    }
}