import java.util.Scanner;


public class ATM {
private BankAccount account;
private Scanner scanner;

public ATM(BankAccount account) {
    this.account = account;
    this.scanner = new Scanner(System.in);
}

public void start() {
    boolean running = true;
    while(running) {
        System.out.println("Welcome to Bank of America: ATM");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.println("4.Display Account Details");
        System.out.println("5.Exit");

        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdraw();
                break;
            case 3:
                handleCheckBalance();
                break;
            case 4:
                handleDisplayAccountDetails();
                break;
            case 5:
                running = false;
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

private void handleDeposit() {
    System.out.println("Enter amount to deposit: ");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}
private void handleWithdraw(){
    System.out.println("Enter amount to withdraw: ");
    double amount = scanner.nextDouble();
    account.withdraw(amount);
}
private void handleCheckBalance(){
    System.out.println("Current balance: " + account.getAccountBalance());
}

private void handleDisplayAccountDetails(){
    account.displayAccountDetails();
}



}
