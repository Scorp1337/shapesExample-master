package org.example;

import java.util.Objects;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateSurface() {
        double multiplier = calculatePerimeter() / 2;
        return Math.sqrt(multiplier * (multiplier - side1) * (multiplier - side2) * (multiplier - side3));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;

        return this.side1 == triangle.side1 && this.side2 == triangle.side2
                && this.side3 == triangle.side3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1 + side2 + side3);
    }
}
