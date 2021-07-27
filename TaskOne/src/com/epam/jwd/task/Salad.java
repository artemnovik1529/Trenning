package com.epam.jwd.task;

import com.epam.jwd.comperator.CaloriesComparator;
import com.epam.jwd.comperator.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> ingredients = new ArrayList<Vegetable>();


    public Salad() {
        name = "Unknown";
    }

    public Salad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<?> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addIngredient(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void showCook() {
        System.out.println(name + " consists of:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }

    }

    public void sortIngredientsByCalorie() {
        Collections.sort(ingredients, new CaloriesComparator());
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }
    }

    public void sortIngredientsByWeight() {
        Collections.sort(ingredients, new WeightComparator());
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }
    }

    public void showIngredientsByCalorie(double lowerCalorie,
                                          double upperCalorie) {
        double calories;

        System.out.println("Ingredients by calories ["
                + lowerCalorie + ", " + upperCalorie + "]");
        for (Vegetable vegetable : ingredients) {
            calories = vegetable.getCalories();
            if (calories >= lowerCalorie && calories <= upperCalorie) {
                System.out.println(vegetable.getName() + ", "
                        + vegetable.getCalories() + "ccal in 100g.");
            }
        }
    }
}
