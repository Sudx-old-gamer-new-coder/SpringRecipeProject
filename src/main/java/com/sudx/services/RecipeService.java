package com.sudx.services;

import com.sudx.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
