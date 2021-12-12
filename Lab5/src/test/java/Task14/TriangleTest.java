package Task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void setA_IllegalArguments_ThrowsIllegalArgumentsExc() {
        var triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> triangle.setA(-1));
    }

    @Test
    void setA_NormalArguments_SetsValue() {
        var triangle = new Triangle();
        triangle.setA(1);
        assertEquals(1, triangle.getA());
    }

    @Test
    void setB_IllegalArguments_ThrowsIllegalArgumentsExc() {
        var triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> triangle.setB(-1));
    }

    @Test
    void setB_NormalArguments_SetsValue() {
        var triangle = new Triangle();
        triangle.setB(1);
        assertEquals(1, triangle.getB());
    }

    @Test
    void setC_IllegalArguments_ThrowsIllegalArgumentsExc() {
        var triangle = new Triangle();
        triangle.setA(1);
        triangle.setB(2);
        assertThrows(IllegalArgumentException.class, () -> triangle.setC(10));
    }

    @Test
    void setC_NormalArguments_SetsValue() {
        var triangle = new Triangle();
        triangle.setA(1);
        triangle.setB(2);
        triangle.setC(3);
        assertEquals(3, triangle.getC());
    }

    @Test
    void calculatePerimeter() {
        var triangle = new Triangle();
        triangle.setA(1);
        triangle.setB(2);
        triangle.setC(3);
        assertEquals(6, triangle.calculatePerimeter());
    }

    @Test
    void calculateArea() {
        var triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        triangle.setC(5);
        assertEquals(6, triangle.calculateArea());
    }

    @Test
    void equals_ObjectTheSame_ReturnsTrue() {
        var triangle = new Triangle();
        assertTrue(triangle.equals(triangle));
    }

    @Test
    void equals_ObjectHasDifferentType_ReturnFalse() {
        var triangle = new Triangle();
        assertFalse(triangle.equals("1"));
    }

    @Test
    void equals_ObjectsAreDifferentTriangle_ReturnResultOfComparesing(){
        var first = new Triangle();
        first.setA(1);
        first.setB(2);
        first.setC(3);
        var second = new Triangle();
        second.setA(1);
        second.setB(3);
        second.setC(4);
        assertFalse(first.equals(second));
    }
}