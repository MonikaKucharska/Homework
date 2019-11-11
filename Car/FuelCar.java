package pl.itacademy.lesson10;

public class FuelCar extends Car implements Tankable  {

    public FuelCar(String name, Engine engine){
        super(name,engine);
    }

    @Override
    public void tank() {
        System.out.println("Car " + getName() + " engine " + getEngine() + " kW has been tanked");
    }
}
