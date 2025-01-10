package com.javacode.learn;

import com.javacode.learn.model.Shape;
import com.javacode.learn.model.impl.Circle;
import com.javacode.learn.model.impl.Rectangle;
import com.javacode.learn.model.impl.Triangle;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape triangle = new Triangle(5.0, 3.0, 4.0);

        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getPerimeter() = " + circle.getPerimeter());

        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());

        System.out.println("triangle.getArea() = " + triangle.getArea());
        System.out.println("triangle.getPerimeter() = " + triangle.getPerimeter());
    }
}
