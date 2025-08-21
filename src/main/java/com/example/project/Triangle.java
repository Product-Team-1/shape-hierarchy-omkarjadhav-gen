package com.example.project;

public class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        double b = Math.max(0.0, base);
        double h = Math.max(0.0, height);
        return 0.5 * b * h;
    }
}
