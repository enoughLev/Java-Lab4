package geometry2d;

import exceptions.SizeExceptions;

public class Circle implements Figure {

    private double R;

    public Circle() {
        setRadius(1);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double area() {
        return (Math.PI * R * R);
    }

    public double perimeter() {
        return (2 * Math.PI * R);
    }

    public String toString() {
        StringBuilder stringSerial;
        stringSerial = new StringBuilder();
        stringSerial.append("Radius = ").append(this.R).append("\n");
        stringSerial.append("Perimeter = ").append(perimeter()).append("\n");
        stringSerial.append("Area = ").append(area()).append("\n");

        return stringSerial.toString();
    }

    public void setRadius(double radius) throws SizeExceptions {
        if (radius <= 0) throw new SizeExceptions("Radius must be greater then zero!");
        else this.R = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

}
