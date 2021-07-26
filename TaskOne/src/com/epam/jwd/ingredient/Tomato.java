package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.NightshadeVegetable;

public class Tomato extends NightshadeVegetable {

    public Tomato(String name, double calories) {
        super("Tomato", 20);

    }

    public Tomato(double weight) {
        super("Tomato", 20, weight);
    }
}
