package ru.javalessons.task;

import ru.javalessons.task.shelter.CatsShelter;
import ru.javalessons.task.guests.Cat;


public class Main {
    private static CatsShelter shelter = new CatsShelter(5);

    public static void main(String[] args) {


        Cat homelessCat1 = new Cat(2.1f, "черный");
        Cat homelessCat2 = new Cat(2.3f, "Белый");
        Cat homelessCat3 = new Cat(2.2f, "Серый");
        homelessCat1.setName("Дося");
        homelessCat2.setName("Кеша");
        homelessCat3.setName("Пердунчик");
        shelter.putUpCat(homelessCat1);
        shelter.putUpCat(homelessCat2);
        shelter.putUpCat(homelessCat3);
        shelter.feedAllCats();
        homelessCat1.eat(3f)
        ;


    }


}

