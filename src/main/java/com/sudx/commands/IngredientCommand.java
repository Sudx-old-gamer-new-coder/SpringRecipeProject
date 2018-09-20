package com.sudx.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {
    private long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
    private Long recipeId;

}
