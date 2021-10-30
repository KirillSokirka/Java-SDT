import java.util.Comparator;

public class PersonComparator implements Comparator<QueuePerson> {

    @Override
    public int compare(QueuePerson o1, QueuePerson o2) {
        return Integer.compare(o1.get_priority(), o2.get_priority());
    }
}
