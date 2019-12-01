package pl.itacademy.lesson15;

public class Fantasy extends Book {
    String name;

    public Fantasy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
