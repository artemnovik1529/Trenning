package com.epam.jwd.classesofveg;

import com.epam.jwd.task.Vegetable;

public class BulbousVegetable extends Vegetable {

    public BulbousVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Bulbous Vegetables");
    }

    public BulbousVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Bulbous Vegetables");
    }
}
