package ru.miet.stepanov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prizm {
    public static void go() {
        System.out.println("Введите сторону и высоту a, b");
        Scanner in = new Scanner(System.in);
        double a=0, b=0;
        boolean flag=true;
        while (flag)
        {
            try {
                in = new Scanner(System.in);
                a = in.nextDouble();
                b = in.nextDouble();
                flag = false;
            }
            catch(InputMismatchException ex) {
                System.out.println("Неправильно введены аргументы! Попробуйте ещё раз.\n");
            }
        }
        System.out.println("Площадь: " + (a*3*b) + ", периметр: " + (a*6+b*3) + "\n");
    }
}
