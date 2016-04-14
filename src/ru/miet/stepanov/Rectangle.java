package ru.miet.stepanov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    public static void go() {
        System.out.println("Введите стороны a, b");
        Scanner in = new Scanner(System.in);
        double a=0, b=0;
        try {
            a = in.nextDouble();
            b = in.nextDouble();
        }
        catch(InputMismatchException ex) {
            ex.printStackTrace();
        }
        System.out.println("Площадь: " + a*b + ", периметр: " + (a+b)*2 + "\n");
    }
}
