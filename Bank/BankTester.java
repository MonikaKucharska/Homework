package pl.itacademy.lesson11;

import java.math.BigDecimal;

public class BankTester {
    public static void main(String[] args) {

        Address address = new Address(1,"kielce","nowa",5);
        Bank pko = new Bank("pko",address);
        DebitAccount konto = new DebitAccount();
        Person person = new Person("Anna", "Nowak");
        BankingCard card = new BankingCard(1245,person, (byte) 55, 1,"pko");
        pko.addAccount(konto);
        CashDepositMachine wplatomat = new CashDepositMachine(pko);
        wplatomat.insertCard(card);
        System.out.println(wplatomat.topUp(BigDecimal.valueOf(500)));
        Bankomat bankomat = new Bankomat(pko);
        bankomat.insertCard(card);
        System.out.println(bankomat.withDraw(BigDecimal.valueOf(100)));

        Address address2 = new Address(2,"kielce","nowa",5);
        Bank ing = new Bank("ing",address);
        CreditAccount konto2 = new CreditAccount();
        Person person2 = new Person("Anna", "Kowalska");
        BankingCard card2 = new BankingCard(1280, person2, (byte) 10,2,"ing");
        ing.addAccount(konto2);
        CashDepositMachine wplatomat2 = new CashDepositMachine(ing);
        wplatomat2.insertCard(card2);
        System.out.println(wplatomat2.topUp(BigDecimal.valueOf(500)));
        Bankomat bankomat2 = new Bankomat(ing);
        bankomat2.insertCard(card2);
        System.out.println(bankomat2.withDraw(BigDecimal.valueOf(100)));
        System.out.println(bankomat2.withDraw(BigDecimal.valueOf(500)));



    }
}
