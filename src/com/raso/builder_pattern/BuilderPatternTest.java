package com.raso.builder_pattern;

public class BuilderPatternTest {


    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        chickenMeal.showItems();
        System.out.println("Cost: "+chickenMeal.getCost());
        vegMeal.showItems();
        System.out.println("Cost: "+vegMeal.getCost());

    }
}
