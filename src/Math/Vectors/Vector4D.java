package Math.Vectors;

import java.util.Objects;

public class Vector4D {
    private double x;
    private double y;
    private double z;
    private double w;

    public Vector4D(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }


    public Vector4D sum(Vector4D v4) {
        return new Vector4D(this.x + v4.x, this.y + v4.y, this.z + v4.z, this.w + v4.w);

    }


    public Vector4D subtract(Vector4D v4) {
        return new Vector4D(this.x - v4.x, this.y - v4.y, this.z - v4.z, this.w - v4.w);
    }


    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public double getAngle(Vector4D v4) {
        return Math.toDegrees(Math.acos(this.scalarProduct(v4) / (this.getLength() * v4.getLength())));
    }


    public double scalarProduct(Vector4D v4) {
        return this.x * v4.x + this.y * v4.y + this.z * v4.z + this.w * v4.w;
    }


    public Vector4D scalarProduct(double k) {
        return new Vector4D(this.x * k, this.y * k, this.z * k, this.w * k);
    }


    public Vector4D normalization() {
        return scalarProduct(1 / this.getLength());
    }

    @Override
    public String toString() {
        return "Math.Vectors.Vector4D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", w=" + w +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector4D vector4D = (Vector4D) o;
        return Double.compare(x, vector4D.x) == 0 && Double.compare(y, vector4D.y) == 0 && Double.compare(z, vector4D.z) == 0 && Double.compare(w, vector4D.w) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, w);
    }
}
