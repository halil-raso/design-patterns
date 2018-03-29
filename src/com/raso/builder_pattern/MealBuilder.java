package com.raso.builder_pattern;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegaBurger());
        meal.addItem(new Pepsi());
        return meal;
    }


    public Meal prepareChickenMeal(){
        Meal meal =  new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
