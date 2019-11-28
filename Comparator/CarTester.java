package pl.itacademy.lesson13;

import java.util.ArrayList;
import java.util.Collections;

public class CarTester {
    public static void main(String[] args) {
        Engine engineOne = new Engine(500,480);
        Car opel = new Car(engineOne,"opel","corsa");

        Engine engineTwo = new Engine(600,570);
        Car toyota = new Car(engineTwo,"toyota","yaris");

        Engine engineThree = new Engine(550,780);
        Car ford = new Car(engineThree,"ford","fusion");

        Engine engineFour = new Engine(540,780);
        Car audi = new Car(engineFour,"audi","a4");

        ArrayList <Car>list = new ArrayList<Car>();
        list.add(opel);
        list.add(toyota);
        list.add(ford);
        list.add(audi);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sort by manufacturer " + list);

        EngineComparator engineComparator = new EngineComparator();
        Collections.sort(list, engineComparator);
        System.out.println("Sort by engine " + list);

        ModelComparator modelComparator = new ModelComparator();
        Collections.sort(list, modelComparator);
        System.out.println("Sort by model " + list );

    }
}
