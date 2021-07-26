package com.epam.jwd.salad;


import com.epam.jwd.ingredient.*;
import com.epam.jwd.ingredient.BulgarianPepper;
import com.epam.jwd.task.Salad;

public class GreekSalad extends Salad {

    public GreekSalad() {
        setName("Greek Salad");

        addIngredient(new Cucumber(300));
        addIngredient(new Tomato(250));
        addIngredient(new Onion(100));
        addIngredient(new BulgarianPepper(150));
        addIngredient(new Parsley(30));

    }
}
