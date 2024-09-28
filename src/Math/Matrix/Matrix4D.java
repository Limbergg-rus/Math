package Math.Matrix;

import Math.Vectors.Vector4D;

import java.util.Arrays;
import java.util.Objects;

public class Matrix4D {
    private double[][] matrix;

    public Matrix4D(double[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4) {
            return;
        }
        this.matrix = matrix;
    }

    public Matrix4D() {
        this.matrix = new double[4][4];
    }

//todo констроуктор для создания единичной матрицы

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4) {
            return;
        }
        this.matrix = matrix;
    }

    public Matrix4D sum(Matrix4D m4) {
        double[][] ans = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ans[i][j] = this.matrix[i][j] + m4.matrix[i][j];
            }
        }
        return new Matrix4D(ans);
    }

    public Matrix4D substract(Math.Matrix.Matrix4D m4) {
        double[][] ans = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ans[i][j] = this.matrix[i][j] - m4.matrix[i][j];
            }
        }
        return new Matrix4D(ans);
    }

    public Matrix4D matrixProduct(Math.Matrix.Matrix4D m4) {
        if (this.matrix[0].length != m4.matrix.length) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы!");
        }

        double[][] C = new double[this.matrix.length][m4.matrix[0].length];

        // Основной алгоритм перемножения
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < m4.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    C[i][j] += this.matrix[i][k] * m4.matrix[k][j];
                }
            }
        }

        return new Matrix4D(C);
    }

    public Vector4D matrixProduct(Vector4D vector) {
        return new Vector4D(this.matrix[0][0] * vector.getX() + this.matrix[0][1] * vector.getY() + this.matrix[0][2] * vector.getZ() + this.matrix[0][3] * vector.getW(),
                this.matrix[1][0] * vector.getX() + this.matrix[1][1] * vector.getY() + this.matrix[1][2] * vector.getZ() + this.matrix[1][3] * vector.getW(),
                this.matrix[2][0] * vector.getX() + this.matrix[2][1] * vector.getY() + this.matrix[2][2] * vector.getZ() + this.matrix[2][3] * vector.getW(),
                this.matrix[3][0] * vector.getX() + this.matrix[3][1] * vector.getY() + this.matrix[3][2] * vector.getZ() + this.matrix[3][3] * vector.getW()
        );
    }

    public Matrix4D transposition() {
        double[][] result = this.getMatrix();
        double temp;

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                temp = result[j][i];
                result[j][i] = result[i][j];
                result[i][j] = temp;
            }

        }

        return new Matrix4D(result);
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("[");
        int cnt = 0;
        for(var item : matrix){
            if (cnt == 0) {
                ans.append(Arrays.toString(matrix[cnt]));
            }else{
                ans.append(", ").append(Arrays.toString(matrix[cnt]));
            }
            cnt++;
        }
        return String.valueOf(ans.append(']'));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix4D matrix4D = (Matrix4D) o;
        return Objects.deepEquals(matrix, matrix4D.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }

    /*

– Быстрого задания единичной и нулевой матрицы (через конструктор
или метод)
     */

}
