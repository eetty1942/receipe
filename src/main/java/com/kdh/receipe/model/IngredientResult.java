package com.kdh.receipe.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class IngredientResult {

    @Id
    private String id;

    private String ingredientName;
    private String upperCategory;
    private String middleCategory;
}
