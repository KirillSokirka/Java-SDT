import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task3Test {

    @Test
    void testAbilityToFindUnique() {
        int[] firstArr = {1, 3, 4};
        int[] secondArr = {1, 3, 8};
        Integer[] expected = {4, 8};

        var result = Task3.FindOnlyUnique(firstArr, secondArr);

        assertArrayEquals(expected, result);
    }
}
