package org.example;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of the deposit:");
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble(); // начальная сумма вклада
        int n = 2; // количество лет
        double r = 10; // годовая процентная ставка

        double sum = p * (1 + r / 100 * n);
        System.out.println("Deposit amount after two years: " + sum);
    }
}