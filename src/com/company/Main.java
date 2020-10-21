package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius1 = readDouble("меньший радиус");
        double radius2 = readDouble("больший радиус");
        double result = calculateAreaOfFilledShape(radius1, radius2);
        printResultOfCalculation(result);
    }

    private static double readDouble(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s: ", string);
        return scanner.nextDouble();
    }

    private static void printResultOfCalculation(double result) {
        System.out.printf("Площадь закрашенной фигуры = %.1f", result);
    }

    private static double calculateAreaOfFilledShape(double radius1, double radius2) {
        return calculateArea1(radius1, radius2) + calculateArea2(radius1) + calculateArea3(radius2);
    }

    private static double calculateArea1(double radius1, double radius2) {
        return (calculateAreaOfCircle(radius2) - calculateAreaOfCircle(radius1)) / 4;
    }

    private static double calculateArea2(double radius1) {
        return calculateAreaOfCircle(radius1) / 8 * 3;
    }

    private static double calculateArea3(double radius2) {
        return (calculateAreaOfSquare(2 * radius2) - calculateAreaOfCircle(radius2)) / 8;
    }

    private static double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateAreaOfSquare(double side) {
        return side * side;
    }
}
