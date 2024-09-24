package Vectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {


    @Test
    void sum() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);
        assertEquals(new Vector3D(5, 7, 9).toString(), v1.sum(v2).toString());
    }

    @Test
    void subtract() {
        Vector3D v1 = new Vector3D(4, 5, 6);
        Vector3D v2 = new Vector3D(1, 2, 3);
        assertEquals(new Vector3D(3, 3, 3).toString(), v1.subtract(v2).toString());
    }

    @Test
    void getLength() {
        Vector3D v = new Vector3D(5, 4, 8);
        assertEquals(10.246950765959598, v.getLength()); // Длина вектора 3-4-0 равна 5
    }

    @Test
    void scalarProduct() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        assertEquals(32, v1.scalarProduct(v2), 0.0001); // 1*4 + 2*5 + 3*6
    }

    void scalarProductWithCos() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        assertEquals(32, v1.scalarProduct(v2), 0.0001); // 1*4 + 2*5 + 3*6
    }

    @Test
    void testScalarProduct() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertEquals(new Vector3D(2, 4, 6).toString(), v.scalarProduct(2).toString());
    }

    @Test
    void normalization() {
        Vector3D v = new Vector3D(5, 4, 8);
        assertEquals(new Vector3D(5 / 10.246950765959598, 4 / 10.246950765959598, 8 / 10.246950765959598).toString(),  v.normalization().toString());
    }

    @Test
    void getAngle() {
        Vector3D v = new Vector3D(5, 4, 8);
        Vector3D v2 = new Vector3D(1, 2, 3);
        assertEquals(15.195959366678538, v.getAngle(v2));
    }

    @Test
    void vectorProduct(){
        Vector3D v = new Vector3D(5, 4, 8);
        Vector3D v2 = new Vector3D(1, 2, 3);
        Vector3D result = v.vectorProduct(v2);
        assertEquals(new Vector3D(-4, -7, 6).toString(), result.toString());
    }
}