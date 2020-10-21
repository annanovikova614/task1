package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Значение площади закрашенной фигуры = " + areaFilledShape());
    }

    public static double readRadiusOfMinorCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус малой окружности:");
        double radius1 = scanner.nextDouble();
        return radius1;
    }

    public static double readRadiusOfBigCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус большой окружности:");
        double radius2 = scanner.nextDouble();
        return radius2;
    }

    public static double minorCircleS(double radius1) {
        return Math.PI * radius1 * radius1;
    }

    public static double bigCircleS(double radius2) {
        return Math.PI * radius2 * radius2;
    }

    public static double squareS(double radius2) {
        double side = 2 * radius2;
        return side * side;
    }

    static double calculateArea1(double minorcircleS) {
        return minorcircleS / 8 * 3;
    }

    static double calculateArea2(double minorcircleS, double bigcircleS) {
        return (bigcircleS - minorcircleS) / 8 * 2;
    }

    static double calculateArea3(double bigcircleS, double squareS) {
        return (squareS - bigcircleS) / 8 * 1;
    }

    public static double calculateArea(double area1, double area2, double area3) {
        return area1 + area2 + area3;
    }

    public static double areaFilledShape() {
        double radiusMinor = readRadiusOfMinorCircle();
        double radiusBig = readRadiusOfBigCircle();
        double minorcircleS = minorCircleS(radiusMinor);
        double bigcircleS = bigCircleS(radiusBig);
        double square = squareS(radiusBig);
        double area1 = calculateArea1(minorcircleS);
        double area2 = calculateArea2(minorcircleS, bigcircleS);
        double area3 = calculateArea3(bigcircleS, square);
        return calculateArea(area1, area2, area3);
    }
}

