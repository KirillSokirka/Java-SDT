package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StylesEventListener implements ActionListener {
    int style;
    StartFrame frame;

    StylesEventListener(int style, StartFrame frame) {
        this.style = style;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int size = frame.textArea.getFont().getSize();
        frame.textArea.setFont(new Font(null, style, size));
    }
}
