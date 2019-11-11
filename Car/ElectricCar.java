package pl.itacademy.lesson10;

public class ElectricCar extends Car implements Chargable {

    public ElectricCar(String name, Engine engine){
        super(name,engine);
    }

    @Override
    public void charge() {
        System.out.println("Car " + getName() + " engine " + getEngine() + " kW has been charged");
    }
}
