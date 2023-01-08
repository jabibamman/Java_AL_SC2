import com.poo.model.alsc2.model.PolygonRegular;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PolygonRegularTest {
    @Test
    void toStringTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertEquals("<3 côtés, 10.0 cm>", polygonRegular.toString());
    }

    @Test
    void perimeterWithValidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertEquals(30.0, polygonRegular.perimeter());
    }

    @Test
    void perimeterWithInvalidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(0, 10);
        assertThrows(IllegalArgumentException.class, polygonRegular::perimeter);
    }

    @Test
    void setNumberOfSidesWithValidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        polygonRegular.setNumberOfSides(4);
        assertEquals(4, polygonRegular.getNumberOfSides());
    }

    @Test
    void setNumberOfSidesWithInvalidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertThrows(IllegalArgumentException.class, () -> polygonRegular.setNumberOfSides(0));
    }

    @Test
    void setSideLengthWithValidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        polygonRegular.setSideLength(20);
        assertEquals(20, polygonRegular.getSideLength());
    }

    @Test
    void setSideLengthWithInvalidValuesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertThrows(IllegalArgumentException.class, () -> polygonRegular.setSideLength(0));
    }

    @Test
    void getNumberOfSidesTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertEquals(3, polygonRegular.getNumberOfSides());
    }

    @Test
    void getSideLengthTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertEquals(10, polygonRegular.getSideLength());
    }

    @Test
    void equalsWithSameObjectTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertEquals(polygonRegular, polygonRegular);
    }

    @Test
    void equalsWithDifferentObjectTest() {
        PolygonRegular polygonRegular = new PolygonRegular(3, 10);
        assertNotEquals(polygonRegular, new PolygonRegular(4, 10));
    }
}
