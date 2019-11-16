package pl.itacademy.lesson11;

import java.math.BigDecimal;

public class CreditAccount extends Account{

    private BigDecimal balance;
    private BigDecimal limit;

    public CreditAccount(){
        super();
        balance = BigDecimal.ZERO;
        limit = BigDecimal.valueOf(-5000);
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Cant top up on negative amount");
        }
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if(limit.compareTo(balance.subtract(amount)) < 0){
            balance = balance.subtract(amount);
        }else {
            System.out.println("Exceed the limit. Not enough money!");
        }
        return balance;
    }
}
