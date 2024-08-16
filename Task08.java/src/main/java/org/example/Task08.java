package org.example;

public class Task08 {
    public static void main(String[] args) {
        // Скорость звука в воздухе (м/с)
        double speedOfSound = 344.0;
        // Время между вспышкой и раскатом грома (в секундах)
        double timeInSeconds = 3.0;

        // Вычисление расстояния
        double distance = speedOfSound * timeInSeconds;

        // Вывод расстояния на экран
        System.out.println("Distance to the place of lightning strike: " + distance + " meters");
    }
}