import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void calculateAreaOnPositiveWidthAndHeight() {

        int width = 5;
        int height = 10;

        Rectangle rectangle = new Rectangle(width, height);

        int realArea = width * height;
        int calculatedArea = rectangle.computeArea();

        assertEquals(realArea, calculatedArea);
    }

    @Test
    public void calculateAreaOnZeroWidthAndNotZeroHeight() {

        int width = 0;
        int height = 10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void calculateAreaOnNotZeroWidthAndZeroHeight() {

        int width = 10;
        int height = 0;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }


    @Test
    public void calculateAreaOnNegativeWidthAndPositiveHeight() {

        int width = -3;
        int height = 10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void calculateAreaOnPositiveWidthAndNegativeHeight() {

        int width = 10;
        int height = -4;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }

    @Test
    public void calculateAreaOnNegativeWidthAndNegativeHeight() {

        int width = -3;
        int height = -10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void setAndGetPositiveWidth() {
        Rectangle rectangle = new Rectangle(3, 8);
        int width = 4;
        rectangle.setWidth(width);
        assertEquals(rectangle.getWidth(), width);
    }

    @Test
    public void setAndGetPositiveHeight() {
        Rectangle rectangle = new Rectangle(3, 8);
        int h = 4;
        rectangle.setHeight(h);
        assertEquals(rectangle.getHeight(), h);
    }


    @Test
    public void setNegativeWidth() {
        Rectangle rectangle = new Rectangle(3, 8);
        int width = -3;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setWidth(width);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }

    @Test
    public void setNegativeHeight() {
        Rectangle rectangle = new Rectangle(3, 8);
        int h = -4;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setHeight(h);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void setZeroWidth() {
        Rectangle rectangle = new Rectangle(3, 8);
        int width = 0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setWidth(width);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }

    @Test
    public void setZeroHeight() {
        Rectangle rectangle = new Rectangle(3, 8);
        int h = 0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setHeight(h);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }
    @Test
    public void getWidthAfterConstruct() {
        int width = 3;
        int height = 5;
        Rectangle rectangle = new Rectangle(width, height);
        assertEquals(width, rectangle.getWidth());
    }
    @Test
    public void getHeightAfterConstruct() {
        int width = 3;
        int height = 5;
        Rectangle rectangle = new Rectangle(width, height);
        assertEquals(height, rectangle.getHeight());
    }


}
