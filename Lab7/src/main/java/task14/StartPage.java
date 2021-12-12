package task14;

import javax.swing.*;
import java.awt.*;

public class StartPage {
    JFrame frame = new JFrame("Task14");
    JLabel inputLabel = new JLabel("Enter a text:");
    JTextField textField = new JTextField();
    JButton black = new JButton("Black");
    JButton red = new JButton("Red");
    JButton green = new JButton("Green");
    JButton blue = new JButton("Blue");
    JButton smallSize = new JButton("12pt");
    JButton mediumSize = new JButton("14pt");
    JButton largeSize = new JButton("16pt");
    JToolBar toolBar = new JToolBar("Tools");

    StartPage() {
        red.setForeground(Color.red);
        green.setForeground(Color.green);
        blue.setForeground(Color.blue);
        toolBar.setRollover(true);
        toolBar.add(black);
        toolBar.add(red);
        toolBar.add(green);
        toolBar.add(blue);

        frame.add(toolBar, BorderLayout.NORTH);
        frame.setSize(420, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

