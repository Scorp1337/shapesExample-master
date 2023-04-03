package org.example;
/*
* You need to design an application that allows the possibility to calculate
* the surface and perimeter for multiple types of shape: rectangle, square, circle and triangle.
*  // calculatePerimeter, calculateSurface  | Square, Rectangle, Triangle, Circle - Shape
*
The tool should allow the possibility to add multiple shapes and calculate
*  the total sum for perimeter and for surface.
*
* // addShape, calculateTotalPerimeter, calculateTotalSurface | DrawingTool
*
Also, the application should make sure that 2 similar shapes couldn’t be added
*  to the drawing tool. In case 2 similar shapes are added, an appropriate
* message should be printed to console.
* // checkShapeIsSimilar - same class, same length/width/radius, String type c1.type = c2.type
*
* Since you want to be sure that you provide a high quality implementation,
* unit tests are needed to prove the main functionalities described above,
* work correctly (add all types of shapes, add duplicates,
* add single shape and pairs of shapes).
* // Test calculation methods
* // Test total methods
* // Test adding shapes
* // Test adding similar shapes
*
* */
public class App {
    public static void main(String[] args) {

        DrawingTool drawingTool = new DrawingTool();

        Square square1 = new Square(5);
        square1.setSide(10);
        drawingTool.addShape(square1);
        drawingTool.addShape(square1);

        drawingTool.calculateTotalPerimeter();
        drawingTool.calculateTotalSurface();

        System.out.println("Elements on the drawing tool: " + drawingTool.shapeList.size());

    }

}
