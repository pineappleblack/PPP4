package ru.miet.stepanov;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Саня on 14.04.2016.
 */
public class OrtagonalParallelepiped {
    private static double a = 0, b = 0, h = 0, err = 0;

    public static void go() {
        while (err == 0) {
            try {
                System.out.print("Введите две стороны основания параллелипипеда через пробел или enter: ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.print("Введите высоту параллелипипеда: ");
                sc = new Scanner(System.in);
                h = sc.nextDouble();
                err = 1;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверные данные");
            }
        }
        System.out.println("Ваши данные: длина = " + a + ", ширина = " + b + ", высота = " + h);
        System.out.println("Площадь поверххности = "+getS()+"\nОбъем = "+getV());
    }
    private static double getV(){
        return a*b*h;
    }
    private static double getS(){
        return 2*a*b+2*a*h+2*b*h;
    }
}
