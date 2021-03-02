package ru.javalessons.task.other;

public class Cats {
    private String name;
    private int weight;
    private String color;
    private int numberOfPaws = 4;

    void eat(){
        System.out.println("кисик кушает");
    }
    void meows(){
        System.out.println("кисик говорит мяу");
    }
    void defecating(){
        System.out.println("исик какает");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public Cats(String name, int weight, String color, int numberOfPaws) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
    }
}
