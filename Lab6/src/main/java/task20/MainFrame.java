package task20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

/*
Изменение фигуры в графическом окне.
В центре верхней панели (JPanel) "Вывод треугольника" в графическом
контексте рисуется (с помощью метода drawPolygon()) треугольник.
В нижней панели (JPanel) "Параметры треугольника" задаются следующие
компоненты: надпись (JLabel) "Цвет:", вращающийся список (JSpinner)
со значениями: "Черный" (цвет по умолчанию),  "Красный", "Зеленый" и "Синий",
надпись (JLabel) "Номер вершины:", вращающийся список (JSpinner) со значениями "1", "2" и "3",
надпись (JLabel)   "Координата X:", текстовое поле (JTextField), надпись (JLabel)
"Координата Y:", текстовое поле (JTextField) и кнопка (JButton) "Изменить треугольник".
При наборе данных во вращающихся списках (в пикселях),
вводе данных в текстовых полях (в пикселях) и при нажатии кнопки "Изменить треугольник"
треугольник перерисовывается заданным цветом и с заданным новым положением одной из вершин.
Перед выводом фигуры выполняется проверка, введены ли в текстовых полях все данные и являются ли они целыми числами.
*/

/**
 * Class for main frame
 */
public class MainFrame extends Frame implements ActionListener {

    /**
     * Choices for colors
     */
    Choice colors = new Choice(), angles;
    /**
     * Labels for error and input fields for new coordinates
     */
        Label error, labelForX, labelForY;
    /**
     * Button for submitting a new coordinates
     */
    Button submit;
    /**
     * Text fields for new coordinates input
     */
        TextField textFieldX, textFieldY;
    /**
     * Set of initial values of x
     */
    int[] x = {30, 100, 100};
    /**
     * Set of initial values of y
     */
        int[] y = {100, 100, 100};
    /**
     * Object for drawing a triangle
     */
    Triangle triangle;
    /**
     * Map for choice of color
     */
    Map<String, Color> stringColorDictionary = new HashMap<>();

    /**
     * Constructor
     */
    MainFrame() {

            angles = new Choice();
            error = new Label();
            labelForX = new Label("X coordinate");
            labelForY = new Label("Y coordinate");
            submit = new Button("Change triangle");
            textFieldX = new TextField();
            textFieldY = new TextField();
            triangle = new Triangle(x, y, Color.black);

            stringColorDictionary.put("Black", Color.black);
            stringColorDictionary.put("Red", Color.red);
            stringColorDictionary.put("Green", Color.green);
            stringColorDictionary.put("Blue", Color.blue);

            colors.setBounds(20, 220, 100, 30);
            colors.add("Black");
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");

            angles.setBounds(130, 220, 50, 30);
            angles.add("1");
            angles.add("2");
            angles.add("3");

            labelForX.setBounds(130, 240, 100, 20);
            textFieldX.setBounds(130, 260, 100, 20);

            labelForY.setBounds(130, 280, 100, 20);
            textFieldY.setBounds(130, 300, 100, 20);

            submit.setBounds(130, 330, 100, 20);

            error.setVisible(false);
            error.setBounds(50, 370, 200, 30);

            triangle.setBounds(0, 0, 400, 200);
            triangle.setBackground(Color.white);
            triangle.setVisible(true);

            add(triangle);
            add(angles);
            add(colors);
            add(labelForX);
            add(textFieldX);
            add(labelForY);
            add(textFieldY);
            add(submit);
            add(error);

            submit.addActionListener(this);
            addWindowListener (new WindowAdapter() {
                    public void windowClosing (WindowEvent e) {
                        System.exit(0);
                    }
                });

            setSize(400, 450);
            setLayout(null);
            setVisible(true);
        }

    /**
     * Action handler
     * @param e event
     */
    @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() != submit) {
                return;
            }
            var color = stringColorDictionary.get(
                    colors.getSelectedItem()
            );
            var choosedangle = Integer.parseInt(angles.getSelectedItem());
            var message = ValidateAngle(choosedangle);
            if (!message.isEmpty()) {
                error.setText(message);
                error.setVisible(true);
                return;
            }
            remove(triangle);
            triangle = new Triangle(x, y, color);
            add(triangle);
            triangle.setBounds(0, 0, 400, 200);
        }

    /**
     * Method for validating inputed data for angle
     * @param angle - angle
     * @return errorMes or empty string
     */
        private String ValidateAngle(int angle) {
            var errorMes = ValidateTextFields(textFieldX.getText());
            if (!errorMes.isEmpty()) {
                return errorMes;
            }
            errorMes = ValidateTextFields(textFieldY.getText());
            if (!errorMes.isEmpty()) {
                return errorMes;
            }
            x[angle-1] = Integer.parseInt(textFieldX.getText());
            y[angle-1] = Integer.parseInt(textFieldY.getText());
            return "";
        }

    /**
     * Additional function for data validation from textFeilds
     * @param text data from textFields
     * @return error
     */
    private String ValidateTextFields(String text) {
            if (text.isEmpty()) {
                return "Field cannot be empty";
            }
            try {
                Integer.parseInt(text);
            } catch (NumberFormatException ex) {
                return "Invalid format";
            }
            if (Integer.parseInt(text) < 0 || Integer.parseInt(text) > 300)
                return "Invalid data";
            return "";
        }

    public static void main(String[] args) {
        new MainFrame();
    }

}
