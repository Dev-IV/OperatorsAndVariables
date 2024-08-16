package org.example;


public class Task12 {
    public static void main(String[] args) {
        int totalStudents = 100; // Общее количество учеников
        double percentage = 1.0; // Указать процент учеников с весом менее 30 кг

        if (percentage == 1.0) {
            // Для 100% учеников с весом менее 30 кг
            double milkPacks = totalStudents * 200 / 900; // Количество упаковок молока
            int buns = totalStudents * 2; // Количество пирожков
            System.out.println("For " + totalStudents + " students:");
            System.out.println("Number of milk cartons: " + milkPacks);
            System.out.println("Number of patties: " + buns);
        } else if (percentage == 0.6) {
            // Для 60% учеников с весом менее 30 кг
            // Аналогичные вычисления с учетом 60% учеников
            int students60 = (int) (totalStudents * percentage); // Количество учеников с весом менее 30 кг
            double milkPacks = students60 * 200 / 900; // Количество упаковок молока
            int buns = students60 * 2; // Количество пирожков
            System.out.println("For " + totalStudents + " students:");
            System.out.println("Number of milk cartons: " + milkPacks);
            System.out.println("Number of patties: " + buns);
        } else if (percentage == 0.01) {
            // Для 1% учеников с весом менее 30 кг
            // Аналогичные вычисления с учетом 1% учеников
            int students1 = (int) (totalStudents * percentage); // Количество учеников с весом менее 30 кг
            double milkPacks = students1 * 200 / 900; // Количество упаковок молока
            int buns = students1 * 2; // Количество пирожков
            System.out.println("For " + totalStudents + " students:");
            System.out.println("Number of milk cartons: " + milkPacks);
            System.out.println("Number of patties: " + buns);
        } else {
            System.out.println("Incorrect percentage of students.");
        }
    }
}