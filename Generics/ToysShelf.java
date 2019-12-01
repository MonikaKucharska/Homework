package pl.itacademy.lesson15;

import java.util.ArrayList;
import java.util.List;

public class ToysShelf {
    List<? super Box> toyList = new ArrayList<>();

    public void addToy(Box<Toy> toyBox) {
        toyList.add(toyBox);
    }

    public void printToysShelf() {
        System.out.println(toyList);
    }



}
