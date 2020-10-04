package com.kanilturgut.meal.repository.dao;

import com.kanilturgut.meal.repository.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
