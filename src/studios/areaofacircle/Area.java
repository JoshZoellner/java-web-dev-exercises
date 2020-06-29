package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        System.out.println("Enter a radius:");
        radius = 0;
        boolean error = false;
        try {
            radius = input.nextDouble();
        } catch (Exception e) {
            error = true;
            System.out.println("Radius value is not a number.");
        }
        input.close();
        if (error == false) {
            if (radius < 0) {
                System.out.println("Radius value is incorrect.");
            } else {
                area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            }
        }
    }
}