package com.W3Resource.basic_part1;

public class AreaAndPerimeterOfCircle {
    public double getArea(double radius){
        double output = Math.PI*radius*radius;
        return output;
    }
    public double getPerimeter(double radius){
        double output = 2*Math.PI*radius;
        return output;
    }

    public static void main(String[] args) {
        double radius = 7.5;
        AreaAndPerimeterOfCircle objAreaAndPerimeterOfCircle = new AreaAndPerimeterOfCircle();
        System.out.println("Area is =" + objAreaAndPerimeterOfCircle.getArea(radius));
        System.out.println("Perimeter is =" + objAreaAndPerimeterOfCircle.getPerimeter(radius));
    }
}
