package com.kanilturgut.meal.repository.dao;

import com.kanilturgut.meal.repository.model.MealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<MealType, Long> {
}
