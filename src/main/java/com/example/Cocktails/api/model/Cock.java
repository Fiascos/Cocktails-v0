package com.example.Cocktails.api.model;

public class Cock {

    private int id;
    private String title;
    private String ingredient;
    private String recipe;

    public Cock(int id, String title, String ingredient, String recipe) {
        this.id = id;
        this.title = title;
        this.ingredient = ingredient;
        this.recipe = recipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
