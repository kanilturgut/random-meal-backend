package com.kanilturgut.meal.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanilturgut.meal.repository.model.Ingredient;
import com.kanilturgut.meal.repository.model.Meal;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class CreateMealRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("ingredients")
    private List<IngredientsRequest> ingredients;

    @JsonProperty("type")
    private MealTypeRequest mealType;

    public Meal toMeal() {
        Meal meal = new Meal(name);
        meal.setType(mealType.toMealType());

        if (null != ingredients) {
            List<Ingredient> collect = ingredients.stream()
                    .map(i -> new Ingredient(i.getName()))
                    .collect(Collectors.toList());

            meal.setIngredients(collect);
        }
        return meal;
    }
}
