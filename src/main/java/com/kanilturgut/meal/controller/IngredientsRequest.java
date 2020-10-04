package com.kanilturgut.meal.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IngredientsRequest {

    @JsonProperty("name")
    private String name;
}
