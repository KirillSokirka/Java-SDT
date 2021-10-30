import java.util.HashSet;
import java.util.Set;

public class QueuePerson {
    private Integer _id;
    private String _name;
    private String _surname;
    private String _byFather;
    private int _priority;
    private AdressValue _adressValue;
    private final Set<Integer> set_of_Id = new HashSet<>();

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public void set_byFather(String _byFather) {
        this._byFather = _byFather;
    }

    public void set_adressValue(AdressValue _adressValue) {
        this._adressValue = _adressValue;
    }

    public void set_priority(int _priority) {
        if (_priority <= 0) {
            throw new IllegalArgumentException();
        }
        this._priority = _priority;
    }

    public String get_surname() {
        return _surname;
    }

    public String get_name() {
        return _name;
    }

    public String get_byFather() {
        return _byFather;
    }

    public int get_priority() {
        return _priority;
    }

    public AdressValue get_adressValue() {
        return _adressValue;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        if (set_of_Id.contains(_id)) {
            throw new IllegalArgumentException();
        }
        set_of_Id.add(_id);
        this._id = _id;
    }

    QueuePerson(Integer id, String name, String surname, String byFather, Integer priority, AdressValue adressValue) {
        set_id(id);
        set_name(name);
        set_surname(surname);
        set_byFather(byFather);
        set_priority(priority);
        set_adressValue(adressValue);
    }

    @Override
    public String toString() {
        return "QueuePerson{" +
                "\n\tid=" + _id +
                "\n\tname='" + _name + '\'' +
                "\n\tsurname='" + _surname + '\'' +
                "\n\tbyFather='" + _byFather + '\'' +
                "\n\tpriority=" + _priority +
                "\n\tadressValue=" + _adressValue +
                '}';
    }
}
