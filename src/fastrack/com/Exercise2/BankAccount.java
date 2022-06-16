package fastrack.com.Exercise2;

public class BankAccount implements BankInterface {
    int money = 0;

    public BankAccount(int initialDeposit) {
        if (initialDeposit > 0) {
            this.money = initialDeposit;
        } else {
            System.out.println("Please insert a valid amount");
        }

    }

    public void withdraw(int withdrawal) {
        if (this.money < withdrawal) {
            System.out.println("Not enough money. You have " + this.money + " in your account");
        } else {
            this.money -= withdrawal;
            System.out.println("You have " + this.money + " left in your account");
        }

    }

    public void deposit(int deposit) {
        this.money += deposit;
        System.out.println("Total amount in your account is " + this.money);
    }
}