package pl.itacademy.lesson13;

import java.util.Objects;

public class Engine {
    private int capasity;
    private int horsepower;

    public Engine(int capasity, int horsepower){
        this.capasity = capasity;
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return capasity == engine.capasity &&
                horsepower == engine.horsepower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capasity, horsepower);
    }

    @Override
    public String toString() {
        return capasity + " " + horsepower;
    }

    public int getCapasity() {
        return capasity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
