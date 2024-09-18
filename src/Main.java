import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t\tWelcome to Bank of America\t\t");

        AccountSetup();


    }

    public static void AccountSetup() {
        System.out.println("Please state your full name: ");
        String name = scanner.nextLine();
        System.out.println("\nAccount options\n1. Checking Account\n2. Savings Account");
        int setupInput = scanner.nextInt();

        if(setupInput == 1) {
            System.out.println("Enter overdraft limit: ");
            double overdraftLimit = scanner.nextDouble();
            CheckingAccount a1 = new CheckingAccount(name, overdraftLimit);
            System.out.println("\nChecking account created for " + name);
            a1.displayAccountDetails();
            ATM atm = new ATM(a1);
            atm.start();
        }else if(setupInput == 2) {
            SavingAccount a2 = new SavingAccount(name);
            System.out.println("Saving account created for " + name);
            a2.displayAccountDetails();
            ATM atm = new ATM(a2);
            atm.start();
        } else System.out.println("Invalid option. Please restart the application.");




    }


}