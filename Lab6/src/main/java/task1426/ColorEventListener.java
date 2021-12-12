package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorEventListener implements ActionListener {
    Color color;
    StartFrame frame;

    ColorEventListener(Color color, StartFrame frame) {
        this.color = color;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.textArea.setForeground(color);
    }
}
