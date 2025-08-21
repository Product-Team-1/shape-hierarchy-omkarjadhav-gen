package com.example.project;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double r = Math.max(0.0, radius);
        return Math.PI * r * r;
    }
}
