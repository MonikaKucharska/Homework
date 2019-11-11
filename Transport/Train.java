package pl.itacademy.lesson9;

public class Train extends PublicTransport {
    @Override
    public void drive() {
        System.out.println("I drive train");
    }
    public void test(PublicTransport publicTransport){
        super.drive();
    }
}
