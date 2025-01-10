package com.javacode.learn;

import com.javacode.learn.model.Shape;
import com.javacode.learn.model.ThreeDShape;
import com.javacode.learn.model.impl.*;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape triangle = new Triangle(5.0, 3.0, 4.0);

        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getPerimeter() = " + circle.getPerimeter());
        System.out.println("circle.getShapeName() = " + circle.getShapeName());

        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());
        System.out.println("rectangle.getShapeName() = " + rectangle.getShapeName());

        System.out.println("triangle.getArea() = " + triangle.getArea());
        System.out.println("triangle.getPerimeter() = " + triangle.getPerimeter());
        System.out.println("triangle.getShapeName() = " + triangle.getShapeName());

        System.out.println(ComparingShapes.isEqualShapesType(circle, rectangle));

        Shape rectangle2 = new Rectangle(6.0, 7.0);
        System.out.println(ComparingShapes.isEqualShapesType(rectangle2, rectangle));

        ComparingShapes.getShapeInfo(circle);
        ComparingShapes.getShapeInfo(rectangle2);
        ComparingShapes.getShapeInfo(rectangle);
        ComparingShapes.getShapeInfo(triangle);

        ThreeDShape cube = new Cube(5.0);
        ThreeDShape sphere = new Sphere(15.0);

        System.out.println("cube.getVolume() = " + cube.getVolume());
        System.out.println("sphere.getVolume() = " + sphere.getVolume());
    }
}