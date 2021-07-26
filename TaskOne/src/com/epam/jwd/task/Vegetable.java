package com.epam.jwd.task;

public class Vegetable {
    private String name;
    private String category;
    private double kcal100g;
    private double weight;

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, double calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Can't find an ingredient with "
                    + calories + "ccal");
        }

        this.name = name;
        this.kcal100g = calories;
        this.weight = 100;
    }

    public Vegetable(String name, double calories, double weight) {
        if (calories < 0) {
            throw new IllegalArgumentException("Can't find an ingredient with "
                    + calories + "ccal");
        }

        if (weight < Double.MIN_NORMAL) {
            throw new IllegalArgumentException("Can't find an ingredient with " + weight
                    + "gramm in " + name);
        }

        this.name = name;
        this.kcal100g = calories;
        this.weight = weight;
    }

    public String toString() {
        return ("In " + weight + " gramms " + name + " (" + category + "), "
                + getTotalCalorie() + "ccal");
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getCalories() {
        return kcal100g;
    }

    public double getWeight() {
        return weight;
    }

    public double getTotalCalorie() {
        return kcal100g * weight / 100.0;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCategory(String category) {
        this.category = category;
    }

    protected void setCalories(double calories) {
        this.kcal100g = calories;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

}
