package ru.javalessons.task.shelter;

import ru.javalessons.task.guests.Cat;

public class CatsShelter {


    public static final float CAT_PORTION = 9f;

    private int numberOfRooms;
    private Cat[] cats;
    private float foodInKilos = 1f;

    public CatsShelter(int numberOfRooms) {
        if (numberOfRooms < 1) {
            System.out.println("Нельзя создать приют с таким количеством комнат!");
            System.out.println("Создался приют с одной комнатой");
            numberOfRooms = 1;
        }
        this.numberOfRooms = numberOfRooms;
        cats = new Cat[numberOfRooms];
    }

    int i = 0;
    int c = 0;


    public void putUpCat(Cat anyCat) {


        if (i < numberOfRooms) {
            cats[i] = anyCat;
            System.out.println("Кисик " + anyCat.getName() + " теперь имеет кров.\nЕго комната под номером " + i);
            i++;
        } else if (c != numberOfRooms) {

            System.out.println("Кот " + cats[c].getName() + " покидает приют");

            cats[c] = anyCat;
            System.out.println("Кисик " + anyCat.getName() + " теперь имеет кров. \nЕго комната под номером " + c);
            c++;
        } else {
            c = 0;
            System.out.println("Кот " + cats[c].getName() + " покидает приют");

            cats[c] = anyCat;
            System.out.println("Кисик " + anyCat.getName() + " теперь имеет кров. \nЕго комната под номером " + c);
            c++;
        }
    }

    public void feedAllCats() {
        if (foodInKilos < 9) {
            System.out.println("Еды не хватает, а коты голодают :(");
        } else {
            for (int i = 0; i < numberOfRooms; i++) {
                Cat cat = cats[i];
                if (cat != null) {

                    foodInKilos -= CAT_PORTION;
                    float remains = cat.eat(CAT_PORTION);
                    /*foodInKilos += remains; (((((((зачем?)))))) */
                    System.out.println("----Учет----");
                    System.out.println("Теперь кот " + cat.getName() + " весит " + cat.getWeight() + "кг.");
                    System.out.println("А запасов еды " + foodInKilos + " кг.");
                    System.out.println("------------");
                }
            }
        }
    }
}











































