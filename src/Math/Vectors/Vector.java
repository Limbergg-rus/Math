package Math.Vectors;

public abstract class Vector {

    public abstract void sum(Vector v);

    public abstract void subtract(Vector v);

    public abstract double getLength();

    public abstract double scalarProduct(Vector v, double angle);

    //    Произведение вектора на скаляр
    public abstract void scalarProduct(double k);

    public abstract void normalization();
}

