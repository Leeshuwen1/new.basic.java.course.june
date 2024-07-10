package ru.mulukin.java.basic.june.homework.lesson3;

import java.util.Scanner;

public class Applycation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите метод от 1 до 5");
        int choice = scanner.nextInt();
        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            checkSign((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        } else if (choice == 3) {
            selectColor();
        } else if (choice == 4) {
            compareNumbers();
        } else if (choice == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 10), (int) (Math.random() * 10), true);
        } else {
            System.out.println("Вы выбрали несуществующий вариант");
        }
    }

    public static void greetings() {
        System.out.println("Hello,");
        System.out.println("World,");
        System.out.println("from,");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println(a + " + " + b + " + " + c + " = Сумма положительная");
        } else {
            System.out.println(a + " + " + b + " + " + c + " = Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 10);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println("Сумма = " + (initValue + delta));
        } else {
            System.out.println("Разница = " + (initValue - delta));
        }
    }
}
