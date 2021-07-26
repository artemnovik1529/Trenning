package com.epam.jwd.comperator;

import com.epam.jwd.task.Vegetable;

public class CaloriesComparator implements java.util.Comparator<Vegetable> {

    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v2.getCalories() - v1.getCalories());
    }
}
