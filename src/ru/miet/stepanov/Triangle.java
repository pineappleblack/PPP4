package ru.miet.stepanov;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void go () {

    }

    public static void go() {
        System.out.println("Введите стороны a, b,c");
        Scanner in = new Scanner(System.in);
        double a=0, b=0,c=0;
        boolean flag=true;
        while (flag)
        {
            try {
                in = new Scanner(System.in);
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                flag = false;
            }
            catch(InputMismatchException ex) {
                System.out.println("Неправильно введены аргументы! Попробуйте ещё раз.\n");
            }
        }
        double p=(a+b+c)/2;
        System.out.println("Площадь: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)) + ", периметр: " + 2*p + "\n");
    }
}
