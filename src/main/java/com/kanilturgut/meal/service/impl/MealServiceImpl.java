package com.kanilturgut.meal.service.impl;

import com.kanilturgut.meal.controller.CreateMealRequest;
import com.kanilturgut.meal.repository.dao.MealRepository;
import com.kanilturgut.meal.repository.model.Meal;
import com.kanilturgut.meal.service.api.MealService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MealServiceImpl implements MealService {

    private final MealRepository mealRepository;

    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    @Transactional
    public Meal save(CreateMealRequest meal) {
        Meal save = mealRepository.save(meal.toMeal());
        return save;
    }

    @Override
    public List<Meal> get() {
        return mealRepository.findAll();
    }
}
