package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingToolTest {
    @Test
    void givenSpecificShapeShouldAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        //when
        drawingTool.addShape(circle);
        //then
        Circle circleInList = (Circle) drawingTool.shapeList.iterator().next();
        assertEquals(1, drawingTool.shapeList.size());
        assertEquals(circle.getRadius(), circleInList.getRadius());
    }

    @Test
    void givenTwoSpecificShapesShouldAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5, 6, 7);
        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);
        //then
        assertEquals(2, drawingTool.shapeList.size());
    }

    @Test
    void givenTwoDuplicatedShapesShouldNotAddShapeToList() {
        //given
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(10);

        //when
        drawingTool.addShape(circle);
        drawingTool.addShape(circle2);
        //then
        assertEquals(1, drawingTool.shapeList.size());
    }


    @Test
    void calculateTotalPerimeter() {
        DrawingTool drawingTool = new DrawingTool();
        Circle circle = new Circle(10);
        Square square = new Square(5);

        drawingTool.addShape(circle);
        drawingTool.addShape(square);

        assertEquals(82.83185307179586,drawingTool.calculateTotalPerimeter(),0.0001);

    }

    @Test
    void calculateTotalSurface() {
        DrawingTool drawingTool = new DrawingTool();
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(7,3);

        drawingTool.addShape(triangle);
        drawingTool.addShape(rectangle);

        assertEquals(27.0,drawingTool.calculateTotalSurface(), 0.00001);
    }
}