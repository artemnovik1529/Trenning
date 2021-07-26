package com.epam.jwd.classesofveg;

import com.epam.jwd.task.Vegetable;

public class CucurbitaceaeVegetable extends Vegetable {

    public CucurbitaceaeVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Cucurbitaceae Vegetables");
    }

    public CucurbitaceaeVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Cucurbitaceae Vegetables");
    }
}
