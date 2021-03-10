package ru.javalessons.task.guests;

import ru.javalessons.task.shelter.CatsShelter;

public class Cat extends CatsShelter {

    private float weight;
    private String color;
    private String name;

    public Cat(float weight, String color) {
        this.weight = weight;
        this.color = color;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
