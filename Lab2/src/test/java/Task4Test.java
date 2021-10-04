import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Task4Test {
    static int[] array;
    static int expectedAverage;
    static int expectedMore;
    static int expectedLess;

    @BeforeAll
    static void setUp() {
        array = new int[] {1,2,3,4,5};
        expectedAverage = 3;
        expectedLess = expectedMore = 40;
    }

    @Test
    void canCalculateAverage() {
        var result = Task4.FindAverage(array);
        assertEquals(expectedAverage, result);
    }

    @Test
    void canCalculatePercentageOfBigger() {
        var result = Task4.FindPercantage(array, expectedAverage, "more");
        assertEquals(expectedMore, result);
    }

    @Test
    void canCalculatePercentageOfLess() {
        var result = Task4.FindPercantage(array, expectedAverage, "less");
        assertEquals(expectedLess, result);
    }
}
