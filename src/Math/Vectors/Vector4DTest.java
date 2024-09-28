package Math.Vectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector4DTest {
    Vector4D a = new Vector4D(5,1,9,6);
    Vector4D b = new Vector4D(4,5,8,4);
    @Test
    void sum() {
        ;
        assertEquals(a.sum(b), new Vector4D(9,6,17,10));
    }

    @Test
    void subtract() {
        assertEquals(a.subtract(b), new Vector4D(1,-4,1,2));
    }

    @Test
    void getLength() {
        assertEquals(a.getLength(), 11.9582607431014, 0.000001);
    }

    @Test
    void getAngle() {
        assertEquals(23.093469269798423 ,a.getAngle(b), 0.000001);
    }

    @Test
    void scalarProduct() {
        assertEquals(a.scalarProduct(b), 121);
    }

    @Test
    void testScalarProduct() {
        assertEquals(new Vector4D(10,2, 18, 12), a.scalarProduct(2));
    }

    @Test
    void normalization() {
        assertEquals(new Vector4D(5/a.getLength(),1/a.getLength(),9/a.getLength(),6/a.getLength()), a.normalization());
    }
}