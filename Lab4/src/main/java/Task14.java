import java.util.HashMap;

public class Task14 {
    public  static void Execute() {
        var Abonent1 = new Abonent("Vasya", "Pupkin", "Vasya", "Test");
        var Abonent2 = new Abonent("Petya", "Cat", "Vasya", "Test");
        var Abonent3 = new Abonent("Dima", "Dog", "Vasya", "Test");
        var map = new HashMap<String, Abonent>();
        map.put("+380(66)-523-39-27", Abonent1);
        map.put("+380(66)-523-33-33", Abonent2);
        map.put("+380(66)-523-33-07", Abonent3);
        var phoneBook = new PhoneBook(map);
        var persons = phoneBook.sortByValues();
        for (var person: persons.entrySet()) {
            System.out.println(person.getValue().get_surname());
        }
        System.out.println(phoneBook.getAbonent("+380(66)-523-33-07").get_surname());
    }
}
