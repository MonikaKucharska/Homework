package pl.itacademy.lesson7;

public class Car {
    private String name;
    private Engine engine;
    private int fuelTankCapacity;
    private int remainFuelAmount;

    Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainFuelAmount = fuelTankCapacity;
    }

    public void startEngine() {

        if (engine.getisStarted()) {
            System.out.println(engine.getName() + " engine has been started already in " + this.name);
        } else {
            System.out.println("Car " + this.name + " is starting " + engine.getName() + " engine");
            System.out.println(engine.getName() + " engine has been started");
        }
        engine.setisStarted(true);

    }

    public void stopEngine() {

        if (engine.getisStarted()) {
            System.out.println("Car " + this.name + " is stopping " + engine.getName() + " engine");
            System.out.println(engine.getName() + " engine has been stopped");
        }
        engine.setisStarted(false);
    }

    public void tank() {

        this.remainFuelAmount = fuelTankCapacity;
        System.out.println("Car " + this.name + " has been tanked up");

    }

    public void drive(int speed, int distance) {
        if (!engine.getisStarted()) {
            System.out.println("Car " + this.name + " cant be driven cause engine stopped");
        } else {
            if (this.remainFuelAmount <= 0) {
                System.out.println("Car " + this.name + " can't be driven. Tank is empty");
            } else {
                int maxSpeed = engine.getHorsepower()*100/50;
                if(speed>maxSpeed){
                    speed=maxSpeed;
                }
                int fuel = engine.getCapasity()/1000*10;
                int litre = distance*fuel/100;
                if(litre<this.remainFuelAmount){
                    this.remainFuelAmount-=litre;
                    distance=distance;
                    System.out.println("Car "+this.name+" has been driven for "+distance+" km with speed "+speed +" km/h. Remaining fuel: "+this.remainFuelAmount+ "L");
                }else {
                    distance=this.remainFuelAmount*100/fuel;
                    this.remainFuelAmount-=litre;
                    System.out.println("Car "+this.name+" has been driven for "+distance+" km with speed "+speed +" km/h. Tank is empty.");
                }
            }
        }
    }
}











