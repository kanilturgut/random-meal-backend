package com.kanilturgut.meal.repository.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class MealType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mealtype_generator")
    @SequenceGenerator(name = "mealtype_generator", sequenceName = "seq_mealtype")
    private Long id;

    @NonNull
    private String name;
}
