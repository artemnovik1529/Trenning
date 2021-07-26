package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.CucurbitaceaeVegetable;

public class Cucumber extends CucurbitaceaeVegetable {

    public Cucumber(String name, double calories) {
        super("Cucumber", 15);

    }

    public Cucumber(double weight) {
        super("Cucumber", 15, weight);

    }
}
