import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void canGetTextFromUser() {
        var scanner = new Scanner("Hello world");
        String expected = "Hello world";

        var result = Task10.GetTextFromUser(scanner);

        assertEquals(expected, result);
    }

    @Test
    void canGetCharacterFromUser() {
        var scanner = new Scanner("H");
        String expected = "H";

        var result = Task10.GetCharacterFromUser(scanner);

        assertEquals(expected, result);
    }

    @Test
    void canCountNumberOfMatches() {
        var text = "Hello World";
        var character = "l";
        var expected = 3;

        var result = Task10.CountNumberOfMatches(text, character);

        assertEquals(expected, result);
    }
}