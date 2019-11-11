package pl.itacademy.lesson9;

public class Car extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive car");
    }
    public void test(Transport transport){
        super.drive();
    }
}
