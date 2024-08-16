package org.example;

/*Добавил метод setLocale() чтобы при вводе числа с точкой не выводилось сообщение
Exception in thread "main" java.util.InputMismatchException
изначально метод nextDouble() ожидает ввод числа в формате с плавающей точкой*/

import java.util.Scanner;
import java.util.Locale;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Enter digit:");
        double number = scanner.nextDouble();

        // Проверка на вещественное число
        if (number % 1 != 0) {
            System.out.println("Digit " + number + " has a fractional part.");
        } else {
            System.out.println("Digit " + number + " does not have a fractional part.");

            scanner.close(); // Закрытие сканера
        }
    }
}