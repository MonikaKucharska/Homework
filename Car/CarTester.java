package pl.itacademy.lesson10;

import java.util.Arrays;

public class CarTester {
    public static void main(String[] args) {
        Engine engine1 = new Engine("diesel",480);
        FuelCar Opel = new FuelCar("Opel",engine1);

        Engine engine2 = new Engine("electric",400);
        ElectricCar Toyota = new ElectricCar("Toyota",engine2);

        Engine engine3 = new Engine("hybrid",350);
        HybridCar Honda = new HybridCar("Honda",engine3);

        Car[] array = new Car[3];
        array[0] = Opel;
        array[1] = Toyota;
        array[2] = Honda;

        for (Car car: array){
            if(car instanceof FuelCar){
                ((FuelCar) car).tank();
            }
            if (car instanceof ElectricCar){
                ((ElectricCar) car).charge();
            }
            if (car instanceof HybridCar){
                ((HybridCar) car).charge();
                ((HybridCar) car).tank();
            }
        }
    }
}
