package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.RootVegetable;

public class Beet extends RootVegetable {

    public Beet(String name, double calories) {
        super("Beet", 43);

    }

    public Beet(double weight) {
        super("Beet", 43, weight);

    }
}
