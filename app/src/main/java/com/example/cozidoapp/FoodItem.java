package com.example.cozidoapp;

import java.util.Objects;

public class FoodItem {
    int foodCover;
    String tempoCozer;
    String porcao;
    String calorias;
    String ingredientes;
    String preparo;
    String foodName;

    public FoodItem() {
    }

    public FoodItem(int cityCover, String cityName) {
        this.foodCover = cityCover;
        this.foodName = cityName;
    }

    public FoodItem(int foodCover,String foodName, String tempoCozer, String porcao, String calorias, String ingredientes, String preparo ) {
        this.foodCover = foodCover;
        this.tempoCozer = tempoCozer;
        this.porcao = porcao;
        this.calorias = calorias;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.foodName = foodName;
    }

    public String getTempoCozer() {
        return tempoCozer;
    }

    public void setTempoCozer(String tempoCozer) {
        this.tempoCozer = tempoCozer;
    }

    public String getPorcao() {
        return porcao;
    }

    public void setPorcao(String porcao) {
        this.porcao = porcao;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getIngredies() {
        return ingredientes;
    }

    public void setIngredies(String ingredies) {
        this.ingredientes = ingredies;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public int getFoodCover() {
        return foodCover;
    }

    public void setFoodCover(int foodCover) {
        this.foodCover = foodCover;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodItem foodItem = (FoodItem) o;
        return foodName.equals(foodItem.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName);
    }
}
