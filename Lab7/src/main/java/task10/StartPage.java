package task10;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class StartPage implements ActionListener {
    JFrame frame = new JFrame("Test frame");
    JLabel inputLabel = new JLabel("Input a image filepath (.jpg)");
    JLabel messageLabel = new JLabel();
    JTextField filePathField = new JTextField();
    JButton submit = new JButton("Submit");

    StartPage() {

        messageLabel.setBounds(50,120,250,35);
        messageLabel.setFont(new Font(null,Font.PLAIN,20));

        inputLabel.setBounds(20, 30, 200, 25);
        filePathField.setBounds(20, 60, 300, 25);
        submit.setBounds(20, 90, 100, 25);
        submit.addActionListener(this);

        frame.add(inputLabel);
        frame.add(messageLabel);
        frame.add(filePathField);
        frame.add(submit);
        frame.setSize(420, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            var errorMes = ValidateFile(filePathField.getText().trim());
            if (errorMes.isEmpty()) {
                messageLabel.setText("");
                var image = new ImagePage(new File(filePathField.getText().trim()));
                frame.setVisible(false);
            }
            else {
                messageLabel.setText(errorMes);
                messageLabel.setForeground(Color.red);
                filePathField.setText("");
            }
        }
    }

    private String ValidateFile(String filepath) {
        var file = new File(filepath);
        if (!file.exists())
            return "Incorrect file path";
        var fileExtensionIndex= file.toString().lastIndexOf('.');
        if (fileExtensionIndex > 0)
        {
            var extension = file.toString().substring(fileExtensionIndex+1);
            if (!extension.equals("jpg"))
                return "Incorrect file extension";
        }
        return "";
    }
}
