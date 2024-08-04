import java.util.Scanner;

public class sapna {
    private double balance;
    private String pin;

    public sapna(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance is: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance is: $" + balance);
        }
    }

    public boolean authenticate(String inputPin) {
        return inputPin.equals(pin);
    }

    public static void main(String[] args) {
        sapna atm = new sapna(1000, "1234");
        Scanner scanner = new Scanner(System.in);

        boolean authenticated = false;
        while (!authenticated) {
            System.out.print("Enter your PIN: ");
            String inputPin = scanner.next();

            if (atm.authenticate(inputPin)) {
                authenticated = true;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}