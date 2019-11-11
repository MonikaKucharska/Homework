package pl.itacademy.lesson9;

public class BankomatTester {
    public static void main(String[] args) {

        BankAccount pko = new BankAccount(1000);
        BankCard card = new BankCard(pko,"2540");
        Bankomat bankomat = new Bankomat();
        System.out.println(bankomat.withdrawMoney(card,700));
        System.out.println(bankomat.withdrawMoney(card,700));


    }
}
