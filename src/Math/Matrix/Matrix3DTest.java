package Math.Matrix;

import Math.Vectors.Vector3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3DTest {
    Matrix3D m1 = new Matrix3D(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    Matrix3D m2 = new Matrix3D(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    Vector3D v1 = new Vector3D(1,2,3);

    @Test
    void sum() {
        assertEquals(new Matrix3D(new double[][]{{2, 4, 6}, {8, 10, 12}, {14, 16, 18}}), m1.sum(m2));
    }

    @Test
    void substract() {
        assertEquals(new Matrix3D(new double[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}), m1.substract(m2));
    }

    @Test
    void matrixProduct() {
        assertEquals(new Matrix3D(new double[][]{{30, 36, 42}, {66, 81, 96}, {102, 126, 150}}), m1.matrixProduct(m2));
    }

    @Test
    void testMatrixProduct() {
        assertEquals(new Vector3D(14, 32, 50), m1.matrixProduct(v1));

    }

    @Test
    void transposition() {
        assertEquals(new Matrix3D(new double[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}), m1.transposition());
    }
}