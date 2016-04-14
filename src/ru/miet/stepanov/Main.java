package ru.miet.stepanov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.println("Выберите фигуру: \n1 - Прямоугольник\n2 - Треугольник\n3 - Параллелепипед\n4-  Призма\n5- Выйти из программы");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            switch (a) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введите другое значение");
            }
        }

    }
}
