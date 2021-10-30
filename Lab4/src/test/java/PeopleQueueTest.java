import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleQueueTest {

    private final AdressValue adress = new AdressValue("Vasylkiv", "Dekabtysiv", 14, 3);
    QueuePerson petya = new QueuePerson(1,"Petya", "Pupkin", "Petich", 6, adress);
    QueuePerson vasya = new QueuePerson(2,"Vasya", "Pupkin", "Petich", 3, adress);
    QueuePerson lena = new QueuePerson(3,"Vasya", "Pupkin", "Petich", 2, adress);
    @Test
    void get_listOfPerson() {

        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        listOfPeople.add(vasya);
        var peopleQueue = new PeopleQueue(listOfPeople);

        List<QueuePerson> list = new LinkedList<QueuePerson>();
        list.add(vasya);
        list.add(petya);

        assertEquals(list.size(), peopleQueue.get_listOfPerson().size());
        assertEquals(list, peopleQueue.get_listOfPerson());
    }

    @Test
    void addToQueue() {
        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        listOfPeople.add(vasya);
        listOfPeople.add(lena);
        var peopleQueue = new PeopleQueue(listOfPeople);


        assertEquals(3, peopleQueue.get_listOfPerson().size());
        assertEquals(lena, peopleQueue.get_listOfPerson().stream().findFirst().get());
    }

    @Test
    void removeFromQueue() {
        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        var peopleQueue = new PeopleQueue(listOfPeople);
        peopleQueue.removeFromQueue(1);

        assertEquals(0, peopleQueue.get_listOfPerson().size());
    }

    @Test
    void getByid() {
        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        var peopleQueue = new PeopleQueue(listOfPeople);

        assertEquals(petya, peopleQueue.getByid(1));
    }

    @Test
    void checkIfInQueue() {
        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        var peopleQueue = new PeopleQueue(listOfPeople);

        assertTrue(peopleQueue.checkIfInQueue(1));
    }
}