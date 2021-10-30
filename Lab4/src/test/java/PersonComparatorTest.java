import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonComparatorTest {

    @Test
    void compare() {
        var adressValue = new AdressValue("City", "Street", 4, 1);
        var vasya = new QueuePerson(2,"Vasya", "Pupkin", "Petich", 3, adressValue);
        var lena = new QueuePerson(2,"Vasya", "Pupkin", "Petich", 4, adressValue);
        var testComparator = new PersonComparator();
        assertEquals(-1, testComparator.compare(vasya, lena));
    }
}