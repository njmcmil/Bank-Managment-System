import java.util.Random;



public class BankAccount {
    private int accountType;
    //1 == checkings || 2 == savings
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    /**
     * A parameterized constructor for a general bank account, accepts 1 param.
     * @param name the value to be set for name.
     *
     * @pre [name must contain only letters] AND 0.00 <= accountBalance AND [accountNumber must contain only integers, and
     *contain 10 digits]
     *
     * @post accountHolderName = name AND accountBalance = 0.00 AND accountNumber = generateAccountNumber()
     */


    //Constructor
    public BankAccount(String name) {
        this.accountHolderName = name;
        this.accountBalance = 0.00;
        this.accountNumber = generateAccountNumber();
    }

    /**
     * Standard getter for account number
     * @return accountNumber, a String
     *
     * @pre none
     *
     * @post getAccountNumber = accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }


    //Methods

    //Random Account Number generator
    private String generateAccountNumber() {
        Random random = new Random();
        int length = 10; //length of the account number
        StringBuilder accountNumber= new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10); // Generate random digit between 0-9
            accountNumber.append(digit);
        }
        return accountNumber.toString();
    }

    public void deposit(double amount) {
    if(amount < 0) {
        System.out.println("Invalid Input: Try again");
    } else this.accountBalance += amount;
    System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
    if(amount > this.accountBalance) {
        System.out.println("Withdraw amount exceeds balance: Try again");

    } else if (amount < 0) { System.out.println("Invalid input: Try again");
    } else this.accountBalance -= amount;
    }

    public void displayAccountDetails (){
    System.out.println("Account Name: " + this.accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + this.accountBalance);
    }



}

