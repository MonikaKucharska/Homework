package pl.itacademy.lesson9;

public class BankCard {
    private BankAccount account;
    private String pinCode;

    public BankCard(BankAccount account, String pinCode) {
        this.account = account;
        this.pinCode = pinCode;
    }

    public BankAccount getAccount() {
        return account;
    }
    public String getPinCode(){
        return pinCode;
    }


}
