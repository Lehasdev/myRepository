package ru.javalessons.task.shelter;

import ru.javalessons.task.guests.Cat;

public class CatsShelter {
    private Cat[] rooms = new Cat[20];

    private int i = 0;


    public void putUpCat(Cat someone) {
        if (i < rooms.length) {
            rooms[i] = someone;
            System.out.println("Кисик " + someone.getName() + " теперь имеет кров.\nЕго комната под номером " + i);
            i++;

        }
    }

    public void feedsAllCat() {

        for (i = 0; i < 20; i++) {
            if (rooms[i] != null) {
                System.out.println("Кисик " + rooms[i].getName() + " кушает!");
            }

        }
    }
}





















