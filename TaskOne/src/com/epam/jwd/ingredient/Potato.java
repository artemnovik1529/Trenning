package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.RootVegetable;

public class Potato extends RootVegetable {

    public Potato(String name, double calories) {
        super("Potato", 86);

    }

    public Potato(double weight) {
        super("Potato", 86, weight);

    }
}
