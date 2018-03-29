package com.raso.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){

        double cost = 0;
        for (Item it: items
             ) {
        cost += it.price();
        }
        return cost;

    }

    public void showItems(){

        System.out.println("Items in ur Meal::");
        for (Item it: items
             ) {
            System.out.println(it.name());
        }
        System.out.println("*********");

    }


}
