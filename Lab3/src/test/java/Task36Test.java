import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @Test
    void filterArguments() {
        var arguments = new String[] {"ab", "cd", "ab"};
        var expected = new String[] {"ab", "cd"};

        var result = Task36.FilterArguments(arguments);

        assertArrayEquals(expected, result);
    }
}