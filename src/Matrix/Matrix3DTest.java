package Matrix;

import Vectors.Vector3D;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3DTest {
    Matrix3D m1 = new Matrix3D(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    Matrix3D m2 = new Matrix3D(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    Vector3D v1 = new Vector3D(1,2,3);

    @Test
    void sum() {
        assertEquals(Arrays.deepToString(new double[][]{{2, 4, 6}, {8, 10, 12}, {14, 16, 18}}), m1.sum(m2).toString());
    }

    @Test
    void substract() {
        assertEquals(Arrays.deepToString(new double[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}), m1.substract(m2).toString());
    }

    @Test
    void matrixProduct() {
        assertEquals(Arrays.deepToString(new double[][]{{30, 36, 42}, {66, 81, 96}, {102, 126, 150}}), m1.matrixProduct(m2).toString());
    }

    @Test
    void testMatrixProduct() {
        assertEquals(Arrays.toString(new double[]{14, 32, 50}), m1.matrixProduct(v1).toString());

    }

    @Test
    void transposition() {
        assertEquals(Arrays.deepToString(new double[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}), m1.transposition().toString());
    }
}