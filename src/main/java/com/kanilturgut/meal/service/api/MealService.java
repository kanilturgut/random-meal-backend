package com.kanilturgut.meal.service.api;

import com.kanilturgut.meal.controller.CreateMealRequest;
import com.kanilturgut.meal.repository.model.Meal;

import java.util.List;

public interface MealService {

    Meal save(CreateMealRequest meal);

    List<Meal> get();
}
