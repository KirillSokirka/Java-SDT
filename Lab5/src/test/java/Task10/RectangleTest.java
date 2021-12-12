package Task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void setWidth_WithIllegalArgument_ThrowsIlArgumentExc() {
        var rect = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rect.setWidth(-2));
    }

    @Test
    void setWidth_WithNormalArguments_SetWidth() {
        var rect = new Rectangle();
        rect.setWidth(1);
        assertEquals(1, rect.getWidth());
    }

    @Test
    void setHeight_WithIllegalArgument_ThrowsIlArgumentExc() {
        var rect = new Rectangle();
        assertThrows(IllegalArgumentException.class, () -> rect.setHeight(-5));
    }

    @Test
    void setHeight_WithNormalArgument_SetsHeight() {
        var rect = new Rectangle();
        rect.setHeight(5);
        assertEquals(5, rect.getHeight());
    }

    @Test
    void calculateArea_WhenCalled_ReturnsAreaOfRect() {
        var rect = new Rectangle();
        rect.setHeight(2);
        rect.setWidth(2);
        assertEquals(4, rect.calculateArea());
    }

    @Test
    void calculatePerimeter_WhenCalled_ReturnsCalculatedPerimeter() {
        var rect = new Rectangle();
        rect.setHeight(2);
        rect.setWidth(2);
        assertEquals(8, rect.calculatePerimeter());
    }

    @Test
    void equals_ObjectTheSame_ReturnsTrue() {
        var rectangle = new Rectangle();
        assertTrue(rectangle.equals(rectangle));
    }

    @Test
    void equals_ObjectHasDifferentType_ReturnFalse() {
        var rectangle = new Rectangle();
        assertFalse(rectangle.equals("1"));
    }

    @Test
    void equals_ObjectsAreDifferentTriangle_ReturnResultOfComparesing(){
        var first = new Rectangle();
        first.setWidth(1);
        first.setHeight(2);
        var second = new Rectangle();
        second.setWidth(3);
        second.setHeight(5);
        assertFalse(first.equals(second));
    }
}