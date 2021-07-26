package com.epam.jwd.ingredient;

import com.epam.jwd.classesofveg.NightshadeVegetable;

public class BulgarianPepper extends NightshadeVegetable {

    public BulgarianPepper(String name, double calories) {
        super("Bulgarian Pepper", 40);

    }


    public BulgarianPepper(double weight) {
        super("Bulgarian Pepper", 40, weight);

    }
}
