package vn.edu.ueh.bit.pipes.simulate.service;

public class BankService {
    private static float balance = (float) Math.random() * 100000f;

    public boolean checkBankSolvency(float number){
        return number <= balance;
    }

    public float checkOut(float number){
        if(checkBankSolvency(number)){
            balance -= number;
            return balance;
        }
        return -1f;
    }
}
