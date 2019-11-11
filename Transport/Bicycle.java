package pl.itacademy.lesson9;

public class Bicycle extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive bicycle");
    }
    public void test(Transport transport){
        super.drive();
    }
}
