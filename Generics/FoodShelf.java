package pl.itacademy.lesson15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodShelf {

    List<? super Box> foodList = new ArrayList<>();

    public void addFood(Box<Food> foodBox) {
        foodList.add(foodBox);
    }

    public void printFoodShelf() {
        System.out.println(foodList);
    }

}
