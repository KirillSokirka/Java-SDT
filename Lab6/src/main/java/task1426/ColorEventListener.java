package task1426;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Event handler for color changing
 */
public class ColorEventListener implements ActionListener {
    /**
     * a new color for text Area
     */
    Color color;
    /**
     * Object of start frame
     */
    StartFrame frame;

    /**
     * Constructor
     * @param color a new data for field Color
     * @param frame a new object for field StartFrame
     */
    ColorEventListener(Color color, StartFrame frame) {
        this.color = color;
        this.frame = frame;
    }

    /**
     * Overridden method for action handling
     * @param e action
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.textArea.setForeground(color);
    }
}
