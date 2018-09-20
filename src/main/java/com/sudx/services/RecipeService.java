package com.sudx.services;

import com.sudx.commands.RecipeCommand;
import com.sudx.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
