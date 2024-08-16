package org.example;

public class Task02 {
    public static void main(String[] args) {
        int n = 345; // замените 345 на любое другое трехзначное число
        int sum = 0;
        sum += n % 10; // добавляем последнюю цифру к сумме
        n /= 10; // убираем последнюю цифру из числа
        sum += n % 10; // добавляем следующую цифру к сумме
        n /= 10; // снова убираем последнюю цифру из числа
        sum += n; // добавляем оставшуюся цифру к сумме
        System.out.println("Sum of digits of a number: " + sum);
    }
}