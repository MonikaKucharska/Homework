package pl.itacademy.lesson13;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private Engine engine;
    private String manufacturer;
    private String model;

    public Car(Engine engine,String manufacturer,String model){
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return engine + " " + manufacturer + " " + model;
    }
    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, manufacturer, model);
    }

    @Override
    public int compareTo(Car o) {
        int a = manufacturer.compareTo(o.manufacturer);
        if(a==0){
            return model.compareTo(o.model);
        }
        return a;
    }
}
