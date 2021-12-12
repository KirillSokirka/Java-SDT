package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Pattern;

public class SizeDialog implements ActionListener {

    TextField sizeField;
    Button confirm;
    Label errorLabel, sizeFieldLabel;
    Dialog sizeDialog;
    StartFrame frame;

    SizeDialog(StartFrame frame) {
        this.frame = frame;
        sizeDialog = new Dialog(this.frame, "Size choosing",true);

        errorLabel = new Label("", Label.CENTER);
        sizeFieldLabel = new Label("Enter a size:");
        sizeField = new TextField();
        confirm = new Button("Confirm");

        sizeFieldLabel.setBounds(10, 25, 100, 30);
        sizeField.setBounds(10, 60, 100, 30);
        confirm.setBounds(110, 60, 50, 30);
        errorLabel.setBounds(10, 70, 200, 30);

        confirm.addActionListener(this);

        sizeDialog.addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                sizeDialog.dispose();
            }
        });

        sizeDialog.add(sizeFieldLabel);
        sizeDialog.add(sizeField);
        sizeDialog.add(confirm);
        sizeDialog.add(errorLabel);
        sizeDialog.setSize(300, 250);
        sizeDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirm) {
            if (sizeField.getText().isEmpty()) {
                errorLabel.setText("Field can't be empty");
                return;
            }
            if (!Pattern.matches("^[0-9]{1,2}$", sizeField.getText())) {
                errorLabel.setText("Size should a one-two digit number ");
                return;
            }
            frame.textArea.setFont(new Font(null,
                    frame.textArea.getFont().getStyle(),
                    Integer.parseInt(sizeField.getText())));
            sizeDialog.setVisible(false);
        }
    }
}
