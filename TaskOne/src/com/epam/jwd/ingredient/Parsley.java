package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.RootVegetable;

public class Parsley extends RootVegetable {

    public Parsley(String name, double calories) {
        super("Parsley", 36);

    }

    public Parsley(double weight) {
        super("Parsley", 36, weight);

    }
}


