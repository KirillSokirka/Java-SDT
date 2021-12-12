package task1426;

/*
Ввод текста в графическое окно приложения.
В панели инструментов окна (JToolBar) определены следующие компоненты (JButton) с надписями:
"Черный" (цвет по умолчанию),  "Красный", "Зеленый" и "Синий",  "12pt" (размер по умолчанию),  "14pt" и "16pt".
В текстовой панели (JTextPane) "Ввод текста" окна приложения вводится текст, набираемый на клавиатуре.
Надписи в кнопках должны быть выполнены соответствующим цветом и шрифтом.
При выборе на панели инструментов цвета и/или размера текст
в панели выводится соответствующим цветом и/или соответствующего размера.
В верхней панели окна  (JPanel) "Параметры шрифта" заданы следующие компоненты:
надпись (JLabel)   "Стиль:", раскрывающееся меню  (JComboBox) с пунктами:
"Простой" (стиль по умолчанию),  "Жирный" и "Курсив",
надпись (JLabel)   "Размер:" и раскрывающееся меню
(JComboBox) с пунктами: "10pt" (стиль по умолчанию), "12pt" (размер по умолчанию) и "14pt".
В текстовой панели (JTextPane) "Ввод текста" окна приложения вводится текст, набираемый на клавиатуре.
При выборе одного из пунктов раскрывающегося меню стиля и ввода в текстовом поле целого числа –
размера текста содержимое текстовой панели выводится соответствующим цветом и/или соответствующего размера.
При вводе значения в текстовое поле проверяется, является ли это значение целым числом, содержащим одну или две цифры.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class StartFrame extends Frame {

    MenuBar menu;
    TextArea textArea;

    StartFrame() {
        menu = new MenuBar();
        textArea = new TextArea();

        InitializeColorsMenuBar();
        InitializeStylesMenuBar();
        InitializeSizesMenuBar();

        setMenuBar(menu);
        textArea.setBounds(10, 50, 300, 300);
        textArea.setFont(new Font(null, Font.PLAIN, 10));

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });
        Choice c = new Choice();


        add(textArea);
        setSize(330, 400);
        setTitle("Task 10");
        setLayout(null);
        setVisible(true);
     }

     private void InitializeColorsMenuBar() {
         var colors = new Menu("Colors");
         var black = new MenuItem("black");
         var red = new MenuItem("red");
         var blue = new MenuItem("blue");
         var green = new MenuItem("green");

         black.addActionListener(new ColorEventListener(Color.black, this));
         red.addActionListener(new ColorEventListener(Color.red, this));
         green.addActionListener(new ColorEventListener(Color.green, this));
         blue.addActionListener(new ColorEventListener(Color.blue, this));

         colors.add(black);
         colors.add(red);
         colors.add(blue);
         colors.add(green);
         menu.add(colors);
     }

     private void InitializeStylesMenuBar() {
        var styles = new Menu("Styles");
        var bold = new MenuItem("bold");
        var italic = new MenuItem("italic");

        var simple = new MenuItem("standard");

        simple.setFont(new Font(null, Font.PLAIN, 12));
        bold.setFont(new Font(null, Font.BOLD, 12));
        italic.setFont(new Font(null, Font.ITALIC, 12));

        simple.addActionListener(new StylesEventListener(Font.PLAIN, this));
        bold.addActionListener(new StylesEventListener(Font.BOLD, this));
        italic.addActionListener(new StylesEventListener(Font.ITALIC, this));

        styles.add(simple);
        styles.add(bold);
        styles.add(italic);

        menu.add(styles);
     }

     public void InitializeSizesMenuBar() {
         var sizes = new Menu("Sizes");
         var standard = new MenuItem("10px");
         var custom = new MenuItem("custom");
         var bigger = new MenuItem("12px");
         var theBiggest = new MenuItem("14px");

         standard.setFont(new Font(null, Font.PLAIN, 10));
         bigger.setFont(new Font(null, Font.PLAIN, 12));
         theBiggest.setFont(new Font(null, Font.PLAIN, 14));
         custom.setFont(new Font(null, Font.PLAIN, 10));
         var frame = this;

         standard.addActionListener(new SizesEventListener(standard.getFont(), this));
         bigger.addActionListener(new SizesEventListener(bigger.getFont(), this));
         theBiggest.addActionListener(new SizesEventListener(theBiggest.getFont(), this));
         custom.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                new SizeDialog(frame);
             }
         });

         sizes.add(standard);
         sizes.add(bigger);
         sizes.add(theBiggest);
         sizes.add(custom);
         menu.add(sizes);
     }

     public static void main(String[] args) {
        new StartFrame();
    }
}
