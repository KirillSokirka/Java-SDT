import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task20Test {

    @Test
    void canAnalyseArguments() {
        String[] args = new String[] {"0x34", "12", "test"};
        String[] expected = new String[] {"Hexadecimal 0x34", "String 12", "String test" } ;

        var result = Task20.AnalyseArguments(args);

        assertArrayEquals(expected, result);
    }
}