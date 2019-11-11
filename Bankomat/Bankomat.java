package pl.itacademy.lesson9;

import java.util.Scanner;

public class Bankomat {
    public int withdrawMoney(BankCard card, int amount) {

        if(checkPinCode(card)){
            if (checkBalance(card.getAccount())&&card.getAccount().getBalance()>=amount){
                card.getAccount().setBalance(card.getAccount().getBalance()-amount);
                System.out.println("Withdraw money: ");
                return amount;
            }else {
                System.out.println("Insufficient account balance");
                amount = 0;
            }
        }
        return amount;
    }

    private boolean checkPinCode(BankCard card) {
      System.out.print("Enter your pin: ");
      Scanner scanner = new Scanner(System.in);
      String enteredPin = scanner.next();
      return enteredPin.equals(card.getPinCode());
    }

    private boolean checkBalance(BankAccount account){
        System.out.println("Do you want display balance? Yes/No");
        Scanner scanner = new Scanner(System.in);
        String enterBalance = scanner.next();
        if(enterBalance.equals("Yes")){
            System.out.println("Balance: " + account.getBalance());
        }else {
            System.out.println("Nothing to display");
        }
        return account.getBalance()>0;
    }
}
