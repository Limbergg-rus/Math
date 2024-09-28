package Math.Matrix;

import Math.Vectors.Vector3D;

import java.util.Arrays;
import java.util.Objects;

public class Matrix3D {
    private double[][] matrix;

    public Matrix3D(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            return;
        }
        this.matrix = matrix;
    }

    public Matrix3D() {
        this.matrix = new double[3][3];
    }

//todo констроуктор для создания единичной матрицы

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            return;
        }
        this.matrix = matrix;
    }

    public Matrix3D sum(Matrix3D m3) {
        double[][] ans = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = this.matrix[i][j] + m3.matrix[i][j];
            }
        }
        return new Matrix3D(ans);
    }

    public Matrix3D substract(Matrix3D m3) {
        double[][] ans = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = this.matrix[i][j] - m3.matrix[i][j];
            }
        }
        return new Matrix3D(ans);
    }

    public Matrix3D matrixProduct(Matrix3D m3) {
        int rowsA = this.matrix.length;
        int colsA = this.matrix[0].length;
        int rowsB = m3.matrix.length;
        int colsB = m3.matrix[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы!");
        }

        double[][] C = new double[rowsA][colsB];

        // Основной алгоритм перемножения
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += this.matrix[i][k] * m3.matrix[k][j];
                }
            }
        }

        return new Matrix3D(C);
    }

    public Vector3D matrixProduct(Vector3D vector) {
        return new Vector3D(this.matrix[0][0] * vector.getX() + this.matrix[0][1] * vector.getY() + this.matrix[0][2] * vector.getZ(),
                this.matrix[1][0] * vector.getX() + this.matrix[1][1] * vector.getY() + this.matrix[1][2] * vector.getZ(),
                this.matrix[2][0] * vector.getX() + this.matrix[2][1] * vector.getY() + this.matrix[2][2] * vector.getZ()
        );
    }

    public Matrix3D transposition() {
        double[][] result = this.getMatrix();
        double temp;

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                temp = result[j][i];
                result[j][i] = result[i][j];
                result[i][j] = temp;
            }

        }

        return new Matrix3D(result);
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(matrix[0]) + ", " + Arrays.toString(matrix[1]) + ", " +
                Arrays.toString(matrix[2]) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix3D matrix3D = (Matrix3D) o;
        return Objects.deepEquals(matrix, matrix3D.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }
}

    /*

– Быстрого задания единичной и нулевой матрицы (через конструктор
или метод)
     */
