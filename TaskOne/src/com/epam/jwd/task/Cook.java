package com.epam.jwd.task;

import com.epam.jwd.salad.ClassicSaladTaC;
import com.epam.jwd.salad.GreekSalad;
import com.epam.jwd.salad.Vinaigrette;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cook {

    private String name;
    private GreekSalad greek_salad;
    private ClassicSaladTaC classicSaladTaC;
    private Vinaigrette vinaigrette;

    public Cook() {
        name = "Artem";
        greek_salad = new GreekSalad();
        classicSaladTaC = new ClassicSaladTaC();
        vinaigrette = new Vinaigrette();
    }

    public void showIngredientsForCalorie(Scanner scanner, Salad salad) {
        double lowerCalories, upperCalories;

        System.out.println("Select the smallest quantity:");
        try {
            lowerCalories = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
            return;
        }

        System.out.println("Select the biggest quantity:");
        try {
            upperCalories = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
            return;
        }

        salad.showIngredientsByCalorie(lowerCalories, upperCalories);
    }

    public void saladOptions(Salad salad) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Available options for salads");

        while (choice != 0) {
            System.out.println("1. Sort by calories");
            System.out.println("2. Sort by weight");
            System.out.println("3. Show ingredients for a given calorie range");
            System.out.println("4. Back to the list of salads");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    salad.sortIngredientsByCalorie();
                    break;

                case 2:
                    salad.sortIngredientsByWeight();
                    break;

                case 3:
                    showIngredientsForCalorie(scanner, salad);

                case 4: //Return to the beginning
                        return;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }

    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetable vegetable = null;

        System.out.println("Hi! My name is " + name + ".");
        System.out.println("What do you want to cook today?");

        while (choice != 0) {
            System.out.println("\nChoose one of the suggested salads:");
            System.out.println("1. Vinaigrette");
            System.out.println("2. Greek Salad");
            System.out.println("3. Classic salad");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Vinaigrette");
                    vinaigrette.showCook();
                    saladOptions(vinaigrette);
                    break;

                case 2:
                    System.out.println("Greek Salad");
                    vinaigrette.showCook();
                    saladOptions(greek_salad);
                    break;

                case 3:
                    System.out.println("Classic salad");
                    vinaigrette.showCook();
                    saladOptions(classicSaladTaC);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}

