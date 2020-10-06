package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус малой окружности");
        double r1 = scanner.nextDouble();
        System.out.println("Введите радиус большой окружности");
        double r2 = scanner.nextDouble();
        double calculateTheArea1 = calculateTheArea1 (r2, r1);
        double calculateTheArea2 = calculateTheArea2 (r1);
        double calculateTheArea3 = calculateTheArea3 (r2);
        double finalCalculateTheArea = finalCalculateTheArea (calculateTheArea1, calculateTheArea2, calculateTheArea3);
        System.out.println("Значение площади закрашенной фигуры" + finalCalculateTheArea );

    }
      static double calculateTheArea1 (double r1, double r2)
      {
          return (Math.PI*r2*r2 - Math.PI*r1*r1)*0.25;
      }
      static double calculateTheArea2 (double r1)
      {
          return Math.PI*r1*r1*0.375;
      }
      static double calculateTheArea3 (double r2)
      {
         return (4*r2*r2 - Math.PI*r2*r2)*0.125;
      }
      static double finalCalculateTheArea (double calculateTheArea1, double calculateTheArea2, double calculateTheArea3)
      {
          return calculateTheArea1 + calculateTheArea2 + calculateTheArea3;
      }
}
