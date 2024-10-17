package geometry2d;

public class Circle implements Figure {

    private double R;

    public Circle() {
        setRadius(1);
    }

    public Circle(int r) {
        setRadius(r);
    }

    public double area() {
        return (Math.PI * R * R);
    }

    public double perimeter() {
        return (2 * Math.PI * R);
    }

    public void setRadius(double radius) {
        this.R = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

}
