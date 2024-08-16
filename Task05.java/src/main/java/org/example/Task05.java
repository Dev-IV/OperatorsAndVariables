package org.example;


public class Task05 {
    public static void main(String[] args) {
        final double radius = 5.0; // Пример задания радиуса как константы

        // Вычисление площади круга
        double area = Math.PI * radius * radius; // Формула: S = π * r^2

        // Вычисление длины окружности
        double circumference = 2 * Math.PI * radius; // Формула: C = 2 * π * r

        System.out.println("Circle area: " + area);
        System.out.println("Circumference length: " + circumference);
    }
}