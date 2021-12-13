package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Event handler for size changing
 */
public class SizesEventListener implements ActionListener {

    /**
     * A new font of text
     */
    Font font;
    /**
     * Start frame object
     */
    StartFrame frame;

    /**
     * Constructor
     * @param font  - a new font
     * @param frame - a main frame object
     */
    public SizesEventListener(Font font, StartFrame frame) {
        this.font = font;
        this.frame = frame;
    }

    /**
     * Action handler for setting a new color
     * @param e - actionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        var style = frame.textArea.getFont().getStyle();
        frame.textArea.setFont(new Font(null, style, font.getSize()));
    }
}
