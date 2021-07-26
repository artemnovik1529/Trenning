package com.epam.jwd.comperator;

import com.epam.jwd.task.Vegetable;

public class WeightComparator implements java.util.Comparator<Vegetable> {

    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getWeight() - v2.getWeight());
    }
}
