import java.util.List;
import java.util.Objects;

public class PeopleQueue {

    private List<QueuePerson> _listOfPerson = null;
    private final PersonComparator _personComparator = new PersonComparator();

    public List<QueuePerson> get_listOfPerson() {
        return _listOfPerson;
    }

    PeopleQueue(List<QueuePerson> listOfPerson) {
        _listOfPerson = listOfPerson;
        _listOfPerson.sort(_personComparator);
    }

    public void addToQueue(QueuePerson newPerson) {
        _listOfPerson.add(newPerson);
        _listOfPerson.sort(_personComparator);
    }

    public void removeFromQueue(Integer id) {
        _listOfPerson.removeIf(p -> Objects.equals(p.get_id(), id));
    }

    public QueuePerson getByid(Integer id) {
        for (var p: _listOfPerson) {
            if (p.get_id().equals(id))
                return p;
        }
        return null;
    }

    public boolean checkIfInQueue(Integer id) {
        for (var p: _listOfPerson) {
            if (p.get_id().equals(id))
                return true;
        }
        return false;
    }
}
