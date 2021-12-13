package task20;

import java.awt.*;

/**
 * Class for triangle drawing
 */
public class Triangle extends Component{

    /**
     * Field for triangle color
     */
    Color color;
    /**
     * Field for set of x coordinates
     */
    int[] x = {};
    /**
     * Field for set of y coordinates
     */
    int[] y = {};

    /**
     * Constructor
     * @param x - set of x coordintes
     * @param y - set of y coordinates
     * @param color - a new triangle color
     */
    Triangle(int[] x, int[] y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    /**
     * Ovverided method for triangle painting
     * @param graphics - object of graphics from base class
     */
    public  void paint(Graphics graphics) {
        var graphics2D = (Graphics2D)graphics;
        graphics2D.drawPolygon(x, y, 3);
        graphics2D.setColor(color);
        graphics2D.fillPolygon(x,y,3);
        graphics2D.dispose();
    }

}
