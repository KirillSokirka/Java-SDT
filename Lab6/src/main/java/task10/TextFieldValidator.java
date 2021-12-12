package task10;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class TextFieldValidator implements ActionListener {
    StartForm form;

    TextFieldValidator(StartForm form) {
        this.form = form;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (form.imageTextField.getText().isEmpty()) {
            form.errorValidation.setText("Field cannot be empty");
            return;
        }
        var message = ValidateFile(form.imageTextField.getText());
        if (!message.isEmpty()) {
            form.errorValidation.setText(message);
            return;
        }
        form.errorValidation.setText("");
        form.setVisible(false);
        new ImageForm(form);
    }

    private String ValidateFile(String filepath) {
        var file = new File(filepath);
        if (!file.exists())
            return "Incorrect file path";
        var fileExtensionIndex= file.toString().lastIndexOf('.');
        var extension = file.toString().substring(fileExtensionIndex+1);
        var availableFormats = ImageIO.getReaderFormatNames();
        for (var format : availableFormats) {
            if (format.equals(extension))
                return "";
        }
        return "Sorry but this format isn't suitable";
    }
}
