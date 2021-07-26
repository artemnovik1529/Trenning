package com.epam.jwd.classesofveg;

import com.epam.jwd.task.Vegetable;

public class RootVegetable extends Vegetable {

    public RootVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Root Vegetables");
    }

    public RootVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Root Vegetables");

    }

}



