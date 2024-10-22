package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {

        double width = 6;
        double length = 6;
        Rectangle rectangle = new Rectangle(width, length);
        System.out.println("\tRectangle:");
        System.out.println(rectangle);

        double radius = 3;
        Circle circle = new Circle(radius);
        System.out.println("\tCircle:");
        System.out.println(circle);

        double height = 4;
        Cylinder cylinderCircle = new Cylinder(circle, height);
        System.out.println("\tCylinder:");
        System.out.println(cylinderCircle);


    }
}