package task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextFieldValidatorTest {

    @org.junit.jupiter.api.Test
    void validateFile_WhenFileDoesntExists() {
        var fileName = "abc";
        var validator = new TextFieldValidator(new StartForm());
        assertEquals(validator.ValidateFile(fileName), "Incorrect file path");
    }

    @Test
    void validateFile_WhenFileExtensionIsntSuitable() {
        var fileName = "C:\\Users\\Kirill\\Desktop\\lab6.sql";
        var validator = new TextFieldValidator(new StartForm());
        assertEquals(validator.ValidateFile(fileName), "Sorry but this format isn't suitable");
    }

    @Test
    void ValidateFile_WhenFileSuitable() {
        var fileName = "C:\\Users\\Kirill\\Desktop\\2.jpg";
        var validator = new TextFieldValidator(new StartForm());
        assertEquals(validator.ValidateFile(fileName), "");
    }
}