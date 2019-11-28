package pl.itacademy.lesson13;

import java.util.Comparator;

public class EngineComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getEngine().getCapasity()==o2.getEngine().getCapasity()){
            return o1.getEngine().getHorsepower()-o2.getEngine().getHorsepower();
        }else {
            return o1.getEngine().getCapasity()-o2.getEngine().getCapasity();
        }
    }
}
