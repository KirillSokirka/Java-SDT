import java.util.LinkedList;

public class Task20 {
    public static void Execute() {
        var adress = new AdressValue("Vasylkiv", "Dekabtysiv", 14, 3);
        var petya = new QueuePerson(1,"Petya", "Pupkin", "Petich", 1, adress);
        var vasya = new QueuePerson(2,"Vasya", "Pupkin", "Petich", 3, adress);
        var lena = new QueuePerson(3, "Lena", "Pupkin", "Petich", 2, adress);
        var listOfPeople = new LinkedList<QueuePerson>();
        listOfPeople.add(petya);
        listOfPeople.add(vasya);
        var queueForFlat = new PeopleQueue(listOfPeople);
        queueForFlat.addToQueue(lena);
        var waiters = queueForFlat.get_listOfPerson();
        for (var p: waiters) {
            System.out.println(p.get_name());
        }
        System.out.println(queueForFlat.getByid(2));
    }
}

