package Task10;

/**
 * Interface that represent rectangle entity
 *
 */
public interface IRectangle {
    void setWidth(double width);
    double getWidth();
    void setHeight(double height);
    double getHeight();
    double calculateArea();
    double calculatePerimeter();
}
