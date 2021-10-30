import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdressValueTest {

    static AdressValue adressValue;

    @BeforeEach
    void setUp() {
        adressValue = new AdressValue("City", "Street", 4, 1);
    }

    @Test
    void set_city() {
        adressValue.set_city("City");
        assertEquals("City", adressValue.get_city());
    }
    @Test
    void set_street() {
        adressValue.set_street("street");
        assertEquals("street", adressValue.get_street());
    }

    @Test
    void set_flat() {
        try {
            adressValue.set_flat(-5);
        } catch (IllegalArgumentException ex) {
            assertTrue(true);
        }
    }

    @Test
    void set_house() {
        try {
            adressValue.set_house(-5);
        } catch (IllegalArgumentException ex) {
            assertTrue(true);
        }
    }

    @Test
    void get_flat() {
        assertEquals(1, adressValue.get_flat());
    }

    @Test
    void get_city() {
        assertEquals("City", adressValue.get_city());
    }

    @Test
    void get_street() {
        assertEquals("Street", adressValue.get_street());
    }

    @Test
    void get_house() {
        assertEquals(4, adressValue.get_house());
    }

    @Test
    void testToString() {
        assertEquals("AdressValue {" +
                "\n\tcity='" + "City" + '\'' +
                "\n\tstreet='" + "Street" + '\'' +
                "\n\thouse=" + 4 +
                "\n\tflat=" + 1 +
                '}', adressValue.toString());
    }
}