package Task14;

import java.util.Objects;

/** Class that represents a Triangle object
 */
public class Triangle implements ITriangle{

    /** getter for field a;
     * @return a value of private field a
     */
    @Override
    public double getA() {
        return this.a;
    }

    /** setter for field a
     * @param value a value for private field a;
     * @throws IllegalArgumentException when value isn't correct
     */
    @Override
    public void setA(double value) {
        if (value < 0)
            throw new IllegalArgumentException();
        this.a = value;
    }

    /** getter for field b;
     * @return a value of private field b
     */
    @Override
    public double getB() {
        return this.b;
    }

    /** setter for field b
     * @param value a value for private field b;
     * @throws IllegalArgumentException when value isn't correct
     */
    @Override
    public void setB(double value) {
        if (value < 0)
            throw new IllegalArgumentException();
        this.b = value;
    }

    /** getter for field c;
     * @return a value of private field c
     */
    @Override
    public double getC() {
       return this.c;
    }

    /** setter for field c
     * @param value a value for private field c;
     * @throws IllegalArgumentException when value isn't correct
     */
    @Override
    public void setC(double value) {
        if ((b + a) < value || value < 0)
            throw new IllegalArgumentException();
        this.c = value;
    }

    /** first side of triangle
     */
    private double a;
    /** second side of triangle
     */
    private double b;
    /** third side of triangle
     */
    private double c;

    /** a method that calculates triangle perimeter
     * @return a perimeter of triangle
     */
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    /** a method that calculates triangle area
     * @return a area of triangle
     */
    @Override
    public double calculateArea() {
        var p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
