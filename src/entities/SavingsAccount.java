package entities;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
    }

    public Double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(){
        this.interestRate = interestRate;
    }
}
