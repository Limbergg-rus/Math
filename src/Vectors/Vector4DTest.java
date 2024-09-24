package Vectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector4DTest {
    Vector4D a = new Vector4D(5,1,9,6);
    Vector4D b = new Vector4D(4,5,8,4);
    @Test
    void sum() {
        ;
        assertEquals(a.sum(b).toString(), new Vector4D(9,6,17,10).toString());
    }

    @Test
    void subtract() {
        assertEquals(a.subtract(b).toString(), new Vector4D(1,-4,1,2).toString());
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
        assertEquals(new Vector4D(10,2, 18, 12).toString(), a.scalarProduct(2).toString());
    }

    @Test
    void normalization() {
        assertEquals(a.normalization().toString(), new Vector4D(5/11.9582607431014,1/11.9582607431014,9/11.9582607431014,6/11.9582607431014));
    }
}