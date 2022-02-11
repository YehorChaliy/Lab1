package com.company;
import java.util.Scanner;

public class Main {

    static void Task1 () {
        Scanner in = new Scanner(System.in);
        System.out.format("Укажіть швидкість катера: %n");
        int V = in.nextInt();
        System.out.format("Укажіть швидкість течії: %n");
        int U = in.nextInt();
        System.out.format("Укажіть час руху катера по озеру: %n");
        int T1 = in.nextInt();
        System.out.format("Укажіть час руху катера по річці: %n");
        int T2 = in.nextInt();

        int V1 = V + U;
        int S1 = V * T1;
        int S2 = V1 * T2;
        int S = S1 + S2;
        System.out.println("Шлях S човна:" + S + " км.");
    }
    static void Task2 () {
        Scanner in = new Scanner(System.in);
        System.out.format("Укажіть значення x: %n");
        double x = in.nextDouble();
        double a = 1 + x;
        double b = 1 + Math.pow(Math.cos(x), 2);
        double y = a / b;
        System.out.println("Значення y = " + y);
    }
    static void Task3 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть координати х1 та y1 першого поля шахової дошки: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Введіть координати х2 та y2 другого поля шахової дошки: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        boolean c = a == b;
        System.out.println("(" + x1 + ";" + y1 + ")" + ", " + "(" + x2 + ";" + y2 + ")" + ": " + c );
    }


    public static void main(String[] args) {
        System.out.println("Task1:");
        Task1 ();
        System.out.println("Task2:");
        Task2 ();
        System.out.println("Task3:");
        Task3 ();
    }
}
