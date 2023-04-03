package org.example;

import java.util.Objects;

public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateSurface() {
        return length * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;

        return this.width == rectangle.width && this.length == rectangle.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width + length);
    }

}
