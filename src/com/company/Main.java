package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        outputAreaFilledShape();
    }

    public static void outputAreaFilledShape()
    {
        double radius1 = readRadiusOfMinorCircle();
        double radius2 = readRadiusOfBigCircle();
        double area = calculateArea(radius1, radius2);
        System.out.println("Значение площади закрашенной фигуры = " + area);
    }

    public static double readRadiusOfMinorCircle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус малой окружности:");
        double radius1 = scanner.nextDouble();
        return radius1;
    }

    public static double readRadiusOfBigCircle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус большой окружности:");
        double radius2 = scanner.nextDouble();
        return radius2;
    }

    static double calculateArea(double radius1, double radius2)
    {
        double area1 = calculateArea1(radius2, radius1);
        double area2 = calculateArea2(radius1);
        double area3 = calculateArea3(radius2);
        double area = area1 + area2 + area3;
        return area;
    }

    static double calculateArea1(double radius1, double radius2)
    {
        return (Math.PI * radius2 * radius2 - Math.PI * radius1 * radius1) * 0.25;
    }

    static double calculateArea2(double radius1)
    {
        return Math.PI * radius1 * radius1 * 0.375;
    }

    static double calculateArea3(double radius2)
    {
        return (4 * radius2 * radius2 - Math.PI * radius2 * radius2) * 0.125;
    }
}
