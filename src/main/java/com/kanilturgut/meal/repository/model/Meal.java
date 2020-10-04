package com.kanilturgut.meal.repository.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Meal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meal_generator")
    @SequenceGenerator(name = "meal_generator", sequenceName = "seq_meal")
    private Long id;

    @NonNull
    private String name;

    @ManyToMany(targetEntity = Ingredient.class, cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;
}
