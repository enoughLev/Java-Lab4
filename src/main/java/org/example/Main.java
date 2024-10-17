package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\tRectangle");
        Rectangle rec = new Rectangle(1, 1);
        double perimetr = rec.perimeter();
        double area = rec.area();
        System.out.println("Area of rectangle:        " + area);
        System.out.println("Perimeter of rectangle:   " + perimetr);


        System.out.println("\n\tCircle");
        Circle cir = new Circle(2);
        double per = cir.perimeter();
        double ar = cir.area();
        System.out.println("Area of circle:           " + ar);
        System.out.println("Perimeter of circle:      " + per);


    }
}