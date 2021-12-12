package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SizesEventListener implements ActionListener {

    Font font;
    StartFrame frame;

    public SizesEventListener(Font font, StartFrame frame) {
        this.font = font;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var style = frame.textArea.getFont().getStyle();
        frame.textArea.setFont(new Font(null, style, font.getSize()));
    }
}
