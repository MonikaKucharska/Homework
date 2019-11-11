package pl.itacademy.lesson10;

public class HybridCar extends Car implements Tankable,Chargable {

    public HybridCar(String name, Engine engine){
        super(name,engine);
    }

    @Override
    public void charge() {
        System.out.println("Car " + getName() + " engine " + getEngine() + " kW has been charged");
    }

    @Override
    public void tank() {
        System.out.println("Car " + getName() + " engine " + getEngine() + " kW has been tanked");
    }
}
