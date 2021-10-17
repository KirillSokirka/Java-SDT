import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class Task2Test {

    @Test
    void testAbilityToFilterArray() {
        var expected = new HashMap<Integer, Integer>();
        expected.put(0, 3);
        expected.put(2, 8);
        expected.put(4, 10);
        int[] testArray = {3,4,8,6,10, 5};

        var result = Task2.FilterArray(4,6, testArray);

        assertEquals(expected.toString(), result.toString());
    }
}
