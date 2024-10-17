package geometry2d;

public class Rectangle implements Figure {

    private double width;
    private double length;

    public Rectangle() {
        setLength(1);
        setWidth(1);
    }

    public Rectangle(double w, double l) {
        setWidth(w);
        setLength(l);
    }

    public double area() {
        return (width * length);
    }

    public double perimeter() {
        return ((width + length) * 2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
