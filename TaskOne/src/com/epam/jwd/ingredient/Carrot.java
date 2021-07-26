package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.RootVegetable;

public class Carrot extends RootVegetable {

    public Carrot(String name, double calories) {
        super("Carrot", 32);

    }

    public Carrot(double weight) {
        super("Carrot", 32, weight);

    }
}


