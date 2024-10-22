package geometry3d;

import exceptions.BaseExceptions;
import exceptions.SizeExceptions;
import geometry2d.Circle;
import geometry2d.Figure;

public class Cylinder {

    private double height;
    private Figure base;

    public Cylinder(Figure b, double h) {
        setBase(b);
        setHight(h);
    }

    public Cylinder(double r, double h) {
        setBase(new Circle(r));
        setHight(h);
    }

    public Cylinder() {
        setBase(new Circle(1));
        setHight(1);
    }

    public double volume() {
        return (height * base.area());
    }

    public String toString() {
        StringBuilder stringSerial;
        stringSerial = new StringBuilder();
        stringSerial.append(this.base);
        stringSerial.append("Height = ").append(this.height).append("\n");
        stringSerial.append("Volume = ").append(volume()).append("\n");

        return stringSerial.toString();
    }

    public void setHight(double height) throws SizeExceptions {
        if (height <= 0) throw new SizeExceptions("Height must be greater then zero!");
        else this.height = height;
    }

    public void setBase(Figure base) throws BaseExceptions {
        if (base.area() <= 0) throw new BaseExceptions("Base must be greater then zero!");
        else this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public Figure getBase() {
        return base;
    }
}
