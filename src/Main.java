import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
/*        Account acc = new Account(1001, "Joao", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Samantha", 0.0, 500.00);


        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Joao", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        // essa operação não é permitida porque acc3 não é do tipo bussiness account
        //para testar, usa-se o método instanceof
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.00);
            System.out.println("loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }*/

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        SavingsAccount  acc2 = new SavingsAccount(1002,"Robert", 1000.00,2);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        BusinessAccount acc3 = new BusinessAccount(1003,"Caio",1000.00,200.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}