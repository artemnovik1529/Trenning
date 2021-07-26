package com.epam.jwd.salad;

import com.epam.jwd.ingredient.*;
import com.epam.jwd.task.Salad;

public class Vinaigrette extends Salad {

    public Vinaigrette() {
        setName("Vinaigrette");

        addIngredient(new Carrot(50));
        addIngredient(new Potato(100));
        addIngredient(new Beet(100));
        addIngredient(new Cucumber(80));
        addIngredient(new Onion(20));
    }
}
