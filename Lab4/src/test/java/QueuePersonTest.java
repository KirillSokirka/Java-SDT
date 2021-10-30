import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuePersonTest {

    private static QueuePerson person;

    @BeforeEach
    void setUp() {
        var adress = new AdressValue("Vasylkiv", "Dekabtysiv", 14, 3);
        person = new QueuePerson(1,"Petya", "Pupkin", "Petich", 1, adress);
    }

    @Test
    void set_name() {
        person.set_name("name");
        assertEquals("name", person.get_name());
    }

    @Test
    void set_surname() {
        person.set_surname("surname");
        assertEquals("surname", person.get_surname());
    }

    @Test
    void set_byFather() {
        person.set_byFather("father");
        assertEquals("father", person.get_byFather());
    }

    @Test
    void set_adressValue() {
        person.set_adressValue(new AdressValue("Vasylkiv", "Dekabtysiv", 14, 3));
        assertEquals("Vasylkiv", person.get_adressValue().get_city());
    }

    @Test
    void set_priority() {
        person.set_priority(1);
        assertEquals(1, person.get_priority());
    }

    @Test
    void set_id() {
        person.set_id(2);
        assertEquals(2, person.get_id());
    }

    @Test
    void get_surname() {
        assertEquals("Pupkin", person.get_surname());
    }

    @Test
    void get_name() {
        assertEquals("Petya", person.get_name());
    }

    @Test
    void get_byFather() {
        assertEquals("Petich", person.get_byFather());
    }

    @Test
    void get_priority() {
        assertEquals(1, person.get_priority());
    }

    @Test
    void get_adressValue() {
        assertEquals("Vasylkiv", person.get_adressValue().get_city());
    }

    @Test
    void get_id() {
        assertEquals(1, person.get_id());
    }


    @Test
    void testToString() {
        assertEquals("QueuePerson{" +
            "\n\tid=" + 1 +
                    "\n\tname='" + "Petya" + '\'' +
                    "\n\tsurname='" + "Pupkin" + '\'' +
                    "\n\tbyFather='" + "Petich" + '\'' +
                    "\n\tpriority=" + 1 +
                    "\n\tadressValue=" + "AdressValue {" +
                "\n\tcity='" + "Vasylkiv" + '\'' +
                "\n\tstreet='" + "Dekabtysiv" + '\'' +
                "\n\thouse=" + 14 +
                "\n\tflat=" + 3 +
                '}' +
                    '}', person.toString());
    }
}