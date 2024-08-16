package org.example;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit x: ");
        int x = scanner.nextInt();
        System.out.println("Enter digit y: ");
        int y = scanner.nextInt();
        int division = x / y; // Результат целочисленного деления
        int percentage = x % y; // Остаток от деления
        double squareRoot = Math.sqrt(x); // Квадратный корень
        System.out.println("Result of integer division of x by y: " + division);
        System.out.println("Remainder of x divided by y: " + percentage);
        System.out.println("Square root of x: " + squareRoot);

        scanner.close(); // Закрытие сканера
    }
}