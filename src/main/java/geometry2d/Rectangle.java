package geometry2d;

import exceptions.SizeExceptions;

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

    public String toString() {
        StringBuilder stringSerial;
        stringSerial = new StringBuilder();
        stringSerial.append("Length = ").append(this.length).append("\n");
        stringSerial.append("Width = ").append(this.width).append("\n");
        stringSerial.append("Perimeter = ").append(perimeter()).append("\n");
        stringSerial.append("Area = ").append(area()).append("\n");

        return stringSerial.toString();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws SizeExceptions {
        if (width <= 0) throw new SizeExceptions("Width must be greater then zero!");
        else this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws SizeExceptions {
        if (length <= 0) throw new SizeExceptions("Length must be greater then zero!");
        else this.length = length;
    }
}
