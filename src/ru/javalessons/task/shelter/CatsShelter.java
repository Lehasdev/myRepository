package ru.javalessons.task.shelter;

import ru.javalessons.task.guests.Cat;

public class CatsShelter {


    private Cat[] rooms;

    public CatsShelter(Cat[] rooms) {
        this.rooms = rooms;
    }

    private int i = 0;


    public void putUpCat(Cat anyCat) {
        if (i < rooms.length) {
            rooms[i] = anyCat;
            System.out.println("Кисик " + anyCat.getName() + " теперь имеет кров.\nЕго комната под номером " + i);
            i++;

        } else {
            System.out.println("Кисик " + rooms[0].getName() + " пришел в себя и готов покинуть приют");
            rooms[0] = null;


            rooms[0] = anyCat;
            System.out.println("Кисик " + rooms[0].getName() + " теперь имеет кров.\nЕго комната под номером " + 0);

        }

    }

    public void feedsAllCat() {
        final float food = 0.4f;
        for (i = 0; i < rooms.length; i++) {
            rooms[i].setWeight(rooms[i].getWeight() + food);

            System.out.println(rooms[i].getWeight());// хз как присвоить значение в сеттер, вызывает конструктор


        }
    }
}




















