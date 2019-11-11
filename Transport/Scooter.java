package pl.itacademy.lesson9;

public class Scooter extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive scooter");
    }
    public void test(Transport transport){
        super.drive();
    }
}
