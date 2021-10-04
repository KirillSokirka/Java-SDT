import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    void testAbilityToTransForm() {
        //Arrange
        int[] rightVersion = {4,1,2,3};
        int[] testArray = {1,2,3,4};

        //Act
        testArray = Task1.Transform(1,testArray);

        //Assert
        assertArrayEquals(rightVersion, testArray);
    }
}
