public class StaticMethod {
    private String accountNum;
    private double balance;

    // Constructor
    public StaticMethod(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    // static method to calculate interest
    public static double calculateInterest(double balance, double interestRate) {
        return balance * interestRate / 100;
    }

    // instance method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // instance method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        // calling static method
        double interest = calculateInterest(1000.0, 10.0);
        System.out.println("Interest: " + interest);

        // creating obj
        StaticMethod obj1 = new StaticMethod("1234567890", 1500.0);
        StaticMethod obj2 = new StaticMethod("1234567890", 1000.0);

        // calling instance method
        obj1.deposit(500.0);
        System.out.println("Amount deposit by obj1 is: " + obj1.balance);
        obj1.displayDetails();
        obj2.deposit(200.0);
        System.out.println("Amount deposit by obj2 is: " + obj2.balance);
        obj2.displayDetails();
    }

}