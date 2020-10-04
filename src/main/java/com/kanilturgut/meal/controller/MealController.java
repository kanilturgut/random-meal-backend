package com.kanilturgut.meal.controller;

import com.kanilturgut.meal.repository.model.Meal;
import com.kanilturgut.meal.service.api.MealService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("meal")
public class MealController {

    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @PostMapping
    public Meal save(@RequestBody CreateMealRequest meal) {
        return mealService.save(meal);
    }

    @GetMapping
    public List<Meal> getAll() {
        return mealService.get();
    }
}
