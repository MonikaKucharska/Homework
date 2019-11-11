package pl.itacademy.lesson9;

public class Bike extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive bike");
    }
    public void test(Transport transport){
        super.drive();
    }
}
