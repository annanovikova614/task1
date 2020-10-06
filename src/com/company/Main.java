package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    { 
        System.out.println("Значение площади закрашенной фигуры" + calculateArea(readRadiusOfMinorCircle(), readRadiusOfGreatCircle()));
    }
    public static int readRadiusOfMinorCircle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус малой окружности");
        return scanner.nextDouble();
    }
    public static int readRadiusOfGreatCircle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус большой окружности");
        return scanner.nextDouble();
    }
    static double calculateArea(double r1, double r2)
    {
        double area1 = calculateArea1(r2, r1);
        double area2 = calculateArea2(r1);
        double area3 = calculateArea3(r2);
        return area1 + area2 + area3;
    }
    static double calculateArea1(double r1, double r2)
    {
        return (Math.PI*r2*r2 - Math.PI*r1*r1)*0.25;
    }
    static double calculateArea2(double r1)
    {
        return Math.PI*r1*r1*0.375;
    }
    static double calculateArea3(double r2)
    {
        return (4*r2*r2 - Math.PI*r2*r2)*0.125;
    }
}
