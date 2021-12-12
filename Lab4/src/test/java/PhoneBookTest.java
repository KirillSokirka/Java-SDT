import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    HashMap<String, Abonent> map;
    TreeMap<String, Abonent> treeMap = new TreeMap<String, Abonent>();
    Abonent Abonent1 = new Abonent("Vasya", "Pupkin", "Vasya", "Test");
    Abonent Abonent2 = new Abonent("Petya", "Cat", "Vasya", "Test");
    Abonent Abonent3 = new Abonent("Dima", "Dog", "Vasya", "Test");

    @BeforeEach
    void setUp() {
        map = new HashMap<String, Abonent>();
        map.put("+380(66)-523-39-27", Abonent1);
        map.put("+380(66)-523-33-33", Abonent2);
        treeMap.putAll(map);
    }

    @Test
    void validatePhoneNumbers() {
        var set = new HashSet<String>();
        set.add("+380(66)-523-39-27");
        assertTrue(PhoneBook.ValidatePhoneNumbers(set));
    }

    @Test
    void addAbonent() {
        var phoneBook = new PhoneBook(map);
        phoneBook.addAbonent("+380(66)-523-39-00", Abonent3);

        assertEquals(3, phoneBook.get_phoneBook().size());
        assertEquals(Abonent3, phoneBook.getAbonent("+380(66)-523-39-00"));
    }

    @Test
    void getAbonent() {
        var phoneBook = new PhoneBook(map);
        assertEquals(Abonent2.get_surname(), phoneBook.getAbonent("+380(66)-523-33-33").get_surname());
    }

    @Test
    void deleteAbonent() {
        var phoneBook = new PhoneBook(map);
        phoneBook.deleteAbonent("+380(66)-523-39-27");
        assertEquals(1, phoneBook.get_phoneBook().size());
        assertNull(phoneBook.getAbonent("+380(66)-523-39-27"));
    }

    @Test
    void sortByValues() {
        var collection = new ArrayList<Abonent>();
        collection.add(Abonent2);
        collection.add(Abonent3);
        collection.add(Abonent1);

        var phoneBook = new PhoneBook(map);
        phoneBook.addAbonent("+380(66)-523-39-00", Abonent3);
        assertIterableEquals(collection, phoneBook.sortByValues().values());
    }
}