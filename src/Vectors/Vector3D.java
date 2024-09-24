package Vectors;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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


    public Vector3D sum(Vector3D v3) {
        return new Vector3D(this.x + v3.x, this.y + v3.y, this.z + v3.z);
    }


    public Vector3D subtract(Vector3D v3) {
        return new Vector3D(this.x - v3.x, this.y - v3.y, this.z - v3.z);
    }


    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double getAngle(Vector3D v3) {
        return Math.toDegrees(Math.acos(this.scalarProduct(v3) / (this.getLength() * v3.getLength())));
    }


    public double scalarProduct(Vector3D v3) {
        return this.x* v3.x + this.y*v3.y + this.z * v3.z;
    }


    public Vector3D scalarProduct(double k) {
        return new Vector3D(this.x * k, this.y * k, this.z * k);
    }

    public Vector3D vectorProduct(Vector3D v3){
        return new Vector3D(this.y*v3.z - this.z* v3.y, -(this.x*v3.z - this.z*v3.x), this.x*v3.y -this.y*v3.x);
    }


    public Vector3D normalization() {
        return scalarProduct(1 / this.getLength());
    }

    @Override
    public String toString() {
        return "Vectors.Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

//todo Векторное произведение
}
