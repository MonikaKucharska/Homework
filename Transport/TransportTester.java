package pl.itacademy.lesson9;

public class TransportTester {
    public static void main(String[] args) {

        Train train = new Train();
        PublicTransport obj1 = new PublicTransport();
        Transport obj2 = new Transport();
        train.test(obj1);
        train.test(obj2);
        train.drive();
        Scooter scooter = new Scooter();
        scooter.test(obj2);
        scooter.drive();
        Motorbike motorbike = new Motorbike();
        motorbike.test(obj2);

    }
}
