package ru.javalessons.task.guests;

import ru.javalessons.task.shelter.CatsShelter;

public class Cat {

    private float weight;
    final String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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


}
