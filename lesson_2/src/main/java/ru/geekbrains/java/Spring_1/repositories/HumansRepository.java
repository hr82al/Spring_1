package ru.geekbrains.java.Spring_1.repositories;

import org.springframework.stereotype.Component;
import ru.geekbrains.java.Spring_1.entities.Human;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class HumansRepository {
    private static List<Human> humans = new ArrayList<>();

    static {
        humans.add(new Human(1, 0));
        humans.add(new Human(2, 0));
        humans.add(new Human(3, 1));
        humans.add(new Human(4, 3));
        humans.add(new Human(5, 4));
        humans.add(new Human(6, 0));
    }

    public Human findById(int id) {
        for (int i =  0; i < humans.size(); i++){
            if (humans.get(i).getId() == id) {
                return humans.get(i);
            }
        }
        return null;
    }

    public List<Human> getHumansList() {
        return humans;
    }
}
