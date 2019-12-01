package pl.itacademy.lesson15;

public class Tale extends Book {
    String name;

    public Tale(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
