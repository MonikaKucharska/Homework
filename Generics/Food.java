package pl.itacademy.lesson15;

public class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
