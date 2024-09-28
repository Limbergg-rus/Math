package Math.Matrix;

import Math.Vectors.Vector4D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix4DTest {
    Matrix4D m1 = new Matrix4D(new double[][]{{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
    Matrix4D m2 = new Matrix4D(new double[][]{{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
    Vector4D v1 = new Vector4D(1, 2, 3, 4);

    @Test
    void sum() {
        assertEquals(new Matrix4D(new double[][]{{2, 4, 6, 8,}, {10, 12, 14, 16}, {18, 20, 22, 24}, {26, 28, 30, 32}}), m1.sum(m2));
    }

    @Test
    void substract() {
        assertEquals(new Matrix4D(new double[4][4]), m1.substract(m2));

    }

    @Test
    void matrixProduct() {
        assertEquals(new Matrix4D(new double[][]{{90, 100, 110, 120,}, {202, 228, 254, 280}, {314, 356, 398, 440}, {426, 484, 542, 600}}), m1.matrixProduct(m2));
    }

    @Test
    void testMatrixProduct() {
        assertEquals(new Vector4D(30, 70, 110, 150), m1.matrixProduct(v1));

    }

    @Test
    void transposition() {
        assertEquals(new Matrix4D(new double[][]{{1, 5, 9, 13,}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}}), m1.transposition());

    }
}