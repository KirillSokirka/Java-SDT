import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, Abonent> _phoneBook;
    private final SortedMap<String, Abonent> _surnames = new TreeMap<String, Abonent>();

    PhoneBook (Map<String, Abonent> phoneBook) {
        _phoneBook = phoneBook;
        for (var user: _phoneBook.entrySet()) {
            _surnames.put(user.getValue().get_name(), user.getValue());
        }
    }
}
