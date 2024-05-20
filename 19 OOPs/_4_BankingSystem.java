// BankAccount class representing a bank account

class BankAccount {
    private String accountNumber;
    private double balance;


    // Constructor to initialize account details
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit funds into the account (public)
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully. New balance: " + balance);
    }

    // Method to withdraw funds from the account (public)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Getter method to retrieve account balance (public)
    public double getBalance() {
        return balance;
    }
}

// Customer class representing a bank customer
class Customer {
    private String name;
    private String address;
    private String contactNumber;

    // Constructor to initialize customer details
    public Customer(String name, String address, String contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Getter and setter methods for customer details (public)
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

// Main class to demonstrate the banking system
public class _4_BankingSystem {

    public static void main(String[] args) {
        // Creating a bank account for a customer
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Depositing and withdrawing funds
        account.deposit(500.0);
        account.withdraw(200.0);

        // Displaying account balance
        System.out.println("Current balance: " + account.getBalance());

        // Creating a customer and updating personal details
        Customer customer = new Customer("Sachin Kumar", "123 Main St", "123-456-7890");
        customer.setAddress("456 Rpr St");
        customer.setContactNumber("000-654-3210");

        // Displaying updated customer details
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Customer contact number: " + customer.getContactNumber());
    }
}