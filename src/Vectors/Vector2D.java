package Vectors;

public class Vector2D {
    /*
– Операции сложения и вычитания
– Умножения и деления на скаляр
– Вычисления длины
– Нормализации
– Скалярного произведения
– Векторного произведения (Для вектора размерности 3)

     */
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Vector2D sum(Vector2D v2) {
        return new Vector2D(this.x + v2.x, this.y + v2.y);
    }


    public Vector2D subtract(Vector2D v2) {
        return new Vector2D(this.x - v2.x, this.y - v2.y);
    }


    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    //Скалярное произведение векторов


    public double scalarProduct(Vector2D v2) {
        return this.x* v2.x + this.y*v2.y;
    }

    public double getAngle(Vector2D v2){
        return Math.toDegrees(Math.acos(this.scalarProduct(v2)/(this.getLength() * v2.getLength())));
    }

    //Произведение вектора на скаляр

    public Vector2D scalarProduct(double k) {
        return new Vector2D(this.x * k, this.y * k);
    }


    public Vector2D normalization() {
        return scalarProduct(1 / this.getLength());

    }
}
