package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class ShapeHierarchy {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Triangle(6, 4));
        shapes.add(new Circle(-2)); // treated as 0

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
