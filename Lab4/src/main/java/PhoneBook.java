import java.util.*;

public class PhoneBook {
    private Map<String, Abonent> _phoneBook;
    private final TreeMap<String, Abonent> abonentTreeMap = new TreeMap<String, Abonent>();

    PhoneBook (Map<String, Abonent> phoneBook) {
        if (ValidatePhoneNumbers(phoneBook.keySet())) {
            _phoneBook = phoneBook;
            abonentTreeMap.putAll(_phoneBook);
        }
    }

    public static boolean ValidatePhoneNumbers(Set<String> phones) {
        for (var number: phones) {
            if (!number.matches("\\+[0-9]{3}\\([0-9]{2}\\)-[0-9]{3}-[0-9]{2}-[0-9]{2}"))
                return false;
        }
        return true;
    }

    public void addAbonent(String phone, Abonent abonent) {
        if (phone.matches("\\+[0-9]{3}\\([0-9]{2}\\)-[0-9]{3}-[0-9]{2}-[0-9]{2}")) {
            _phoneBook.put(phone, abonent);
            abonentTreeMap.put(phone, abonent);
        }
    }

    public Abonent getAbonent(String phone) {
        return _phoneBook.get(phone);
    }

    public void deleteAbonent(String phone) {
        _phoneBook.remove(phone);
        abonentTreeMap.remove(phone);
    }

    public Map<String, Abonent> get_phoneBook() {
        return _phoneBook;
    }

    public static <String, Abonent extends Comparable<Abonent>>
    Map<String, Abonent> valueSort(final TreeMap<String, Abonent> map) {

        var valueComparator = new Comparator<String>() {
            public int compare(String k1, String k2) {
                return map.get(k1).compareTo(map.get(k2));
            }
        };
        var sorted = new TreeMap<String, Abonent>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

    public Map<String, Abonent> sortByValues() {
        return valueSort(abonentTreeMap);
    }
}
