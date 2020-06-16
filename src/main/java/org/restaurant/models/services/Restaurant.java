package org.restaurant.models.services;

import org.restaurant.models.Meal;
import org.restaurant.models.MealDatabase;
import org.restaurant.models.OrderR;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Restaurant {

    private List<Meal> menu = new MealDatabase().getMeals();

    public boolean checkIfMealExist(String mealName){
        for (Meal meal : menu) {
            if (mealName.equals(meal.getName())){
                return true;
            }
        }
        return false;
    }

     public int calculateOrderPrice(OrderR orderR){
        int sum = 0;
        for (Meal meals: orderR.getMealList()) {
            sum = sum + meals.getPrice();
        }
        //todo implement
        return sum;
    }

    /*OrderR
    public List<Meal> getMealList() {
        return mealList;
    }*/

    public Meal getMeal(String mealName){
        //todo implement
        for (Meal meals : menu) {
            if (mealName.equals(meals.getName())) {
                return meals;
            }
        }
        return null;
    }

    /*for (Meal meal : menu) {
            if (mealName.equals(meal.getName())){
                return true;
            }
        }
        return false;
    }*/

    public List<Meal> getMenu() {
        return menu;
    }
}
