package org.example;

public class Task06 {
    public static void main(String[] args) {
        final int w = 3; // ширина прямоугольника
        final int h = 4; // высота прямоугольника
        int perimeter = 2 * (w + h); // вычисление периметра
        int area = w * h; // вычисление площади
        System.out.println("Rectangle perimeter: " + perimeter);
        System.out.println("Rectangle area: " + area);
    }
}