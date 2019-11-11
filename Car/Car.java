package pl.itacademy.lesson10;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine ){
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String toString(){
        return name + " " + engine;
    }
}
