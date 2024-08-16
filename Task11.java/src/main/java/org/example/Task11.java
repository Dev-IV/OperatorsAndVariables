package org.example;

import java.util.Scanner;

public class Task11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запросить у пользователя количество секунд
            System.out.print("Enter the number of seconds until New Year's Eve: ");
            long totalSeconds = scanner.nextLong();

            // Определяем количество полных дней, часов, минут и секунд
            long secondsInDay = 86400; // 60 секунд * 60 минут * 24 часа
            long secondsInHour = 3600;  // 60 секунд * 60 минут
            long secondsInMinute = 60;   // 60 секунд

            long days = totalSeconds / secondsInDay;
            totalSeconds %= secondsInDay;

            long hours = totalSeconds / secondsInHour;
            totalSeconds %= secondsInHour;

            long minutes = totalSeconds / secondsInMinute;
            long seconds = totalSeconds % secondsInMinute;

            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds");

            scanner.close(); // Закрытие сканера
        }
    }



