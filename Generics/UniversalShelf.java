package pl.itacademy.lesson15;

import java.util.ArrayList;
import java.util.List;

public class UniversalShelf {
    List<? super Box> universalList = new ArrayList<>();

    public void addBox(Box box) {
        universalList.add(box);
    }

    public void printUniversalShelf() {
        System.out.println(universalList);
    }
}

