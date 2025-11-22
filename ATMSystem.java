import java.util.*;

public class ATMSystem {

    private float balance;
    private final int PIN = 1234;
    private List<String> transactionHistory = new ArrayList<>();

    // PIN verification
    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Wrong PIN! Please try again.\n");
            checkPin();
        }
    }

    // Display main menu to user
    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======== ATM MENU ========");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("\nThank you for using our ATM!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Show transaction history
    public void showHistory() {
        System.out.println("\n---- Transaction History ----");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String record : transactionHistory) {
                System.out.println(record);
            }
        }
    }

    // Withdraw function
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Deposit money to account
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit: ");
        float amount = sc.nextFloat();

        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Try again!");
        }
    }

    // Transfer money to another account
    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter recipient account number: ");
        int acc = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        float amount = sc.nextFloat();

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("Transferred " + amount + " to Account " + acc);
            System.out.println("Successfully transferred " + amount + " to account " + acc);
        } else {
            System.out.println("Invalid transfer or insufficient balance!");
        }
    }

    // Main method
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        System.out.println("Welcome to the ATM Service!");
        atm.checkPin();
    }
}
