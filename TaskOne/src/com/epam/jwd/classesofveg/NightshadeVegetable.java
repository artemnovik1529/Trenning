package com.epam.jwd.classesofveg;

import com.epam.jwd.task.Vegetable;

public class NightshadeVegetable extends Vegetable {

    public NightshadeVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Nightshade Vegetables");
    }

    public NightshadeVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Nightshade Vegetables");

    }

}
