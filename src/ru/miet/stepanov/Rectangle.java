package ru.miet.stepanov;

import java.util.Scanner;

public class Rectangle {
    public static void go() {
        System.out.println("Введите стороны a, b");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Площадь: " + a*b + ", периметр: " + (a+b)*2 + "\n");
    }
}
