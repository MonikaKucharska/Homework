package pl.itacademy.lesson11;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bankomat implements Withdrawable{

    private BankingCard insertedCard;
    private Bank bank;

    public Bankomat(Bank bank){
        this.bank = bank;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (askPinCode()) {
            if(!insertedCard.getBankName().equals(bank.getName())){
                return null;
            }else {
                return bank.getAccountByNumber(insertedCard.getAccountNumber()).withDraw(amount);
            }
        } else {
            System.out.println("Error");
            return null;
        }
    }

    private boolean askPinCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your pin: ");
        byte enteredPin = scanner.nextByte();
        return insertedCard.isCorrectPin(enteredPin);
    }

    public void insertCard(BankingCard card) {
        insertedCard = card;
    }

    public void endSession(){
        insertedCard = null;
    }
}
