package ru.javalessons.task.guests;

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

    public String getColor() {
        return color;
    }


    private void setWeight(float result) {


        this.weight = result;

    }

    public float eat(float x) {
        if (x < 9) {
            System.out.println("Еды не хватает, а коты голодают :(");
            return getWeight();

        } else {


            float result1 = x * 0.1f;// чтобы вес менялся реалистичней
            float result = result1 + getWeight();
            setWeight(result);
            return getWeight();

        }
    }
}












