import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    void canReverseArray() {
        int[] expected = {6,5,4};
        int[] init = {4,5,6};

        init = Task5.Reverse(init);

        assertArrayEquals(expected, init);
    }
}
