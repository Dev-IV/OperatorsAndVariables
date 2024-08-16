package org.example;

public class Task10 {
    public static void main(String[] args) {
        final int height = 175; // Рост в см
        final int weight = 80; // Вес в кг

        int idealWeight = height - 110;
        int weightDifference = weight - idealWeight;

        if (weightDifference > 0) {
            System.out.println("You need to reset " + weightDifference + " kg, to reach your ideal weight.");
        } else if (weightDifference < 0) {
            System.out.println("You need to type in " + Math.abs(weightDifference) + " kg, to reach your ideal weight.");
        } else {
            System.out.println("Congratulations, your weight is already perfect!");
        }
    }
}