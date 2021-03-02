package ru.javalessons.task.rooms;

public class BasicRooms {
    protected double area;
    protected int numberOfWindow;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfWindow() {
        return numberOfWindow;
    }

    public void setNumberOfWindow(int numberOfWindow) {
        this.numberOfWindow = numberOfWindow;
    }

    public BasicRooms(double area, int numberOfWindow) {
        this.area = area;
        this.numberOfWindow = numberOfWindow;
    }
}
