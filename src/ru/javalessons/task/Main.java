package ru.javalessons.task;

import ru.javalessons.task.shelter.CatsShelter;
import ru.javalessons.task.guests.Cat;


public class Main {
    private static CatsShelter shelter = new CatsShelter(new Cat[2]);

    public static void main(String[] args) {
        Cat homelessCat = new Cat(1.3f, "Серый");
        homelessCat.setName("Пердунчик");
        shelter.putUpCat(homelessCat);
        Cat homeless2 = new Cat(1.2f, "Черный");
        homeless2.setName("Бандит");
        shelter.putUpCat(homeless2);
        Cat homelessCat3 = new Cat(2.1f,"Бело-черный");
        homelessCat3.setName("Рома");
        shelter.putUpCat(homelessCat3);
        shelter.feedsAllCat();



    }


}

