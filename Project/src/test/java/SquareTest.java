import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class SquareTest {

    @Test
    public void calculateAreaOnPositiveEdge() {

        int e = 4;

        Square sq = new Square(e);

        int realArea = e * e;
        int calculatedArea = sq.computeArea();

        assertEquals(realArea, calculatedArea);
    }

    @Test
    public void calculateAreaOnZeroEdge() {

        int e = 0;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Square(e);
        });

        String realMessage = "Edge should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void calculateAreaOnNegativeEdge() {

        int e = -3;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Square(e);
        });

        String realMessage = "Edge should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void setAndGetPositiveEdge() {
        Square sq = new Square(3);
        int e = 4;
        sq.setEdge(e);
        assertEquals(sq.getEdge(), e);
    }


    @Test
    public void setNegativeEdge() {
        Square square = new Square(4);
        int e = -3;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setEdge(e);
        });
        String realMessage = "Edge should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }


    @Test
    public void setZeroEdge() {
        Square square = new Square(4);
        int e = 0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setEdge(e);
        });
        String realMessage = "Edge should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }

    @Test
    public void getEdgeAfterConstruct() {
        int e = 4;
        Square sq = new Square(e);
        assertEquals(e, sq.getEdge());
    }
}
