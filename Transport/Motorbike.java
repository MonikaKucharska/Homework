package pl.itacademy.lesson9;

public class Motorbike extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive motorbike");
    }
    public void test(Transport transport){
        super.drive();
    }
}
