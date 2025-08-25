package com.gqt.challenges.OverLoading;
class Polygon {
    //to calculate area of a regular polygon
    double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
public class RegularPolygonArea {
    public static void main(String[] args) {
        Polygon poly = new Polygon();
        int sides = 6;       // hexagon
        double length = 5.0; 
        double area = poly.area(sides, length);
        System.out.println("Area of regular polygon with " + sides + " sides of length " + length + " = " + area);
    }
}
