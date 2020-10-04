package com.kanilturgut.meal.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanilturgut.meal.repository.model.MealType;
import lombok.Data;

@Data
public class MealTypeRequest {

    @JsonProperty("name")
    private String name;

    public MealType toMealType() {
        return new MealType(this.name);
    }
}
