package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculatePerimeter() {

        Square square = new Square(5);
        assertEquals(20,square.calculatePerimeter());


    }

    @Test
    void calculateSurface() {
        Square square = new Square(6);

        assertEquals(36,square.calculateSurface());

    }
}