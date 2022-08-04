package enteties;

public class Bank {
    private int account;
    private String name;
    private double balance;

    public Bank(int account, String name){
        this.account = account;
        this.name = name;
    }
    public Bank(int account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
        deposit(initialDeposit);
    }


    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double value) {

        return this.balance += value;
    }

    public double withdraw(double value) {
        return this.balance -= value + 5;
    }

    @Override
    public String toString() {
        return "Account " + account +
                ", Holder: " + name +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
