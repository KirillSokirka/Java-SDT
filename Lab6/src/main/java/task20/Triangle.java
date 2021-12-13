package task20;

import java.awt.*;

public class Triangle extends Component{

    Color color;
    int[] x = {};
    int[] y = {};

    Triangle(int[] x, int[] y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public  void paint(Graphics graphics) {
        var graphics2D = (Graphics2D)graphics;
        graphics2D.drawPolygon(x, y, 3);
        graphics2D.setColor(color);
        graphics2D.fillPolygon(x,y,3);
        graphics2D.dispose();
    }

}
