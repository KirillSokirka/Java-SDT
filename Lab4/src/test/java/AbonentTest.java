import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbonentTest {

    static Abonent abonent;

    @BeforeAll
    static void setUp() {
        abonent = new Abonent("Name", "Surname", "ByFather", "Adress");
    }

    @Test
    void get_name() {
        assertEquals("Name", abonent.get_name());
    }

    @Test
    void get_surname() {
        assertEquals("Surname", abonent.get_surname());
    }

    @Test
    void get_byFather() {
        assertEquals("ByFather", abonent.get_byFather());
    }

    @Test
    void get_adress() {
        assertEquals("Adress", abonent.get_adress());
    }

    @Test
    void compare() {
        assertEquals(0, abonent.compareTo(abonent));
    }
}