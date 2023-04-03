package org.example;

import org.junit.jupiter.api.Test;

import javax.sql.rowset.BaseRowSet;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(5,2);

        assertEquals(14,rectangle.calculatePerimeter());
    }

    @Test
    void calculateSurface() {
        Rectangle rectangle = new Rectangle(5,2);

        assertEquals(10,rectangle.calculateSurface());
    }
}