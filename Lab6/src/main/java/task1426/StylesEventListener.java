package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class for styles action listener
 */
public class StylesEventListener implements ActionListener {
    /**
     * Style of text
     */
    int style;
    /**
     * Object for main page
     */
    StartFrame frame;

    /**
     * Constructor
     * @param style - a new style for text
     * @param frame - a object of main form
     */
    StylesEventListener(int style, StartFrame frame) {
        this.style = style;
        this.frame = frame;
    }

    /**
     * Overridden method form interface
     * @param e action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int size = frame.textArea.getFont().getSize();
        frame.textArea.setFont(new Font(null, style, size));
    }
}
