package Math.Vectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    Vector2D a = new Vector2D(3, 4);
    Vector2D b = new Vector2D(4, 3);

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(new Vector2D(7, 7), a.sum(b));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(new Vector2D( -1 , 1), a.subtract(b));
    }

    @org.junit.jupiter.api.Test
    void getLength() {
        assertEquals(5, a.getLength());
    }


    @org.junit.jupiter.api.Test
    void testScalarProduct() {
        assertEquals(new Vector2D(15,20), a.scalarProduct(5));
    }

    @org.junit.jupiter.api.Test
    void testScalarProductVector() {
        assertEquals(24, a.scalarProduct(b));
    }

    @org.junit.jupiter.api.Test
    void normalization() {
        assertEquals(new Vector2D(0.2 * 3, 0.2*4), a.normalization());
    }

    @Test
    void getAngel() {
        Vector2D v1 = new Vector2D(1, 2);
        Vector2D v2 = new Vector2D(4, 5);

        assertEquals(12.094757077012119, v1.getAngle(v2), 0.0001); // 1*4 + 2*5 + 3*6
    }
}