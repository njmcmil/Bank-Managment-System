public class CheckingAccount extends BankAccount {
private double overdraftLimit;


public CheckingAccount(String name, double overdraftLimit) {
    super(name);
    this.overdraftLimit = overdraftLimit;
}

public void withdraw(double amount) {
    if(amount < 0) {
        System.out.println("Invalid input: Try again");
    }else if (amount > (this.getAccountBalance() + overdraftLimit)) {
        System.out.println("Withdraw amount exceeds balance and overdraft limit: Try again");
    }else super.withdraw(amount);
}

public double getOverDraftLimit(){
    return overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
}

public void displayAccountDetails() {
    super.displayAccountDetails();
    System.out.println("Overdraft Limit: " + this.overdraftLimit);
}

}
