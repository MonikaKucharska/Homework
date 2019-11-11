package pl.itacademy.lesson9;

public class Bus extends PublicTransport {
    @Override
    public void drive() {
        System.out.println("I drive bus");
    }
    public void test(PublicTransport publicTransport){
        super.drive();
    }

}
