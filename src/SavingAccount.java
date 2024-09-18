public class SavingAccount extends BankAccount{
    private double interestRate;
    private double minimumBalance;


    public SavingAccount(String name) {
        super(name);

        this.interestRate = 1.00;
        this.minimumBalance = 500.0;
    }

//Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.getAccountBalance() - amount) >= this.minimumBalance) {
    super.withdraw(amount);
     System.out.println("Withdrew: " + amount);
       } else System.out.println("Insufficent funds or invalid amount.");
    }

    //Method for interest logic
    public void applyInterest() {
        double interest = this.getAccountBalance() * (this.interestRate / 100);

        this.deposit(interest);

        System.out.println("Interest applied " + interest);
    }

    //getter && setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance){
        this.minimumBalance = minimumBalance;
    }

    //override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + this.interestRate + "%");
        System.out.println("Minimum Balance: " + this.minimumBalance);
    }


}
