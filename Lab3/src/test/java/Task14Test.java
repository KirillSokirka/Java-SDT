import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void  canGenerateGamma() {
        var random = new Random(123);
        var text = "Some";

        var result = Task14.GenerateGamma(text, random);

        assertEquals("Cy4d", result.toString());
    }

    @Test
    void canEncryptText() {
        var text = "Some";
        var key = "Cy4d";

        var result = Task14.EncryptText(text, key);

        assertEquals("Uei9", result);
    }

    @Test
    void canDecryptText() {
        var key = "Cy4d";
        var text = "Uei9";

        var result = Task14.DecryptText(text, key);

        assertEquals("Some", result);
    }
}