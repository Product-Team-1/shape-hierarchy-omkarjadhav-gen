package com.example.project;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double w = Math.max(0.0, width);
        double h = Math.max(0.0, height);
        return w + h;
    }
}
