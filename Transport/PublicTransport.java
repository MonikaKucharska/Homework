package pl.itacademy.lesson9;

public class PublicTransport extends Transport {
    @Override
    public void drive() {
        System.out.println("I drive public transport");
    }
    public void test(Transport transport){
        super.drive();
    }
}
