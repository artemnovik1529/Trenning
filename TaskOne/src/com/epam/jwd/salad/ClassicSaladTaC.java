package com.epam.jwd.salad;

import com.epam.jwd.ingredient.*;
import com.epam.jwd.task.Salad;

public class ClassicSaladTaC extends Salad {

    public ClassicSaladTaC() {
        setName("ClassicSalad");


        addIngredient(new Cucumber(300));
        addIngredient(new Tomato(250));
        addIngredient(new Onion(100));


    }
}

