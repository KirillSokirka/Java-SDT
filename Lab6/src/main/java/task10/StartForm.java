package task10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
Изменение размера изображения в графическом окне.
В панели окна (JPanel) окна "Вывод изображения" в компоненте (JLabel) задается произвольное изображение.
В панели инструментов  окна задаются две кнопки (JButton): "Увеличить" и "Уменьшить".
При нажатии первой кнопки изображение увеличивается на 10 пикселей по ширине и высоте,
при нажатии второй кнопки – уменьшается на то же количество пикселей.
*/

/**
 * Main form
 */
public class StartForm extends Frame {

    /**
     * Field for image path
     */
    TextField imageTextField;
    /**
     * Label for error output
     */
    Label errorValidation;
    /**
     * Button for image uploading
     */
    Button upload;

    /**
     * Constructor of this class
     */
    StartForm() {
        imageTextField = new TextField();
        upload = new Button("Upload image");
        errorValidation = new Label("", Label.CENTER);

        imageTextField.setBounds(10, 40, 300, 30);
        upload.setBounds(320, 40, 100, 30);
        errorValidation.setBounds(50, 100, 250, 20);

        add(imageTextField);
        add(upload);
        add(errorValidation);

        upload.addActionListener(new TextFieldValidator(this));

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(440, 200);
        setTitle("Task 10");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StartForm();
    }
}

