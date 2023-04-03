package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void givenSizeShouldCalculatePerimeter() {
        //given
        Circle circle = new Circle(10);
        //when
        double result = circle.calculatePerimeter();
        //then
        assertEquals(62.83185307179586, result, 0.00001);
    }

    @Test
    void givenRadiusShouldCalculateSurface() {
        //given
        Circle circle = new Circle(10);
        //when
        double result = circle.calculateSurface();
        //then
        assertEquals(314.1592653589793, result, 0.00001);
    }
}