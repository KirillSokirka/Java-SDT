package Task10;

import java.util.Objects;

public class Rectangle implements IRectangle {
    /** Private field for rectangle width
     */
    private double width = 0;

    /** Method for setting rectangle width
     * @param width - the value for rectangle's width
     * @throws IllegalArgumentException - when param less than zero
     */
    public void setWidth(double width) {
        if (width <= 0 )
            throw new IllegalArgumentException();
        this.width = width;
    }

    /** Getter for rectangle width
     * @return rectangle width
     */
    public double getWidth() {
        return this.width;
    }

    /** Private field for rectangle height
     */
    private double height = 0;

    /** Method for setting rectangle height
     * @param height - the value for rectangle's height
     * @throws IllegalArgumentException - when param less than zero
     */
    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException();
        this.height = height;
    }

    /** Getter for rectangle height
     * @return rectangle height
     */
    public double getHeight() {
        return this.height;
    }

    /** Method for calculating rectangle's area
     * @return rectangle area
     */
    public double calculateArea() {
        return height * width;
    }

    /** Method for calculating rectangle's perimeter
     * @return rectangle perimeter
     */
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public String toString() {
        return "Task10.Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    public int hashCode() {
        return Objects.hash(width, height);
    }
}
