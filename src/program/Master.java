package program;


import enteties.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;
        System.out.println("Enter account number: ");
        int account = sc.nextInt();
        System.out.println("Enter holder name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there a initial desposit(y/n)?");
        char condition = sc.next().charAt(0);

        if (condition == 'y') {
            System.out.println("Enter initial depositi value: ");
            double value = sc.nextDouble();
            bank = new Bank(account, name, value);
        } else {
            bank = new Bank(account, name);
        }

        System.out.println("Account data:");
        System.out.println(bank.toString());
        System.out.println("Enter deposit value: ");
        double deposit = sc.nextDouble();
        bank.deposit(deposit);
        System.out.println("Upadate account data:");
        System.out.println(bank.toString());
        double withdraw = sc.nextDouble();
        System.out.println("Enter a withdraw value:");
        bank.withdraw(withdraw);
        System.out.println(bank.toString());

        sc.close();


    }
}
