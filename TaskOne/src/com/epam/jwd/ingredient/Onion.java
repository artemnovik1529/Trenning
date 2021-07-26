package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.BulbousVegetable;

public class Onion extends BulbousVegetable {

    public Onion(String name, double calories) {
        super("Onion", 40);

    }

    public Onion(double weight) {
        super("Onion", 40, weight);

    }
}
