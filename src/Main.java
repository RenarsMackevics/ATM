import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========[ATM]==========");

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(500.50);

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("1) Check balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            int choice;

            // Error handling for menu choice
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear invalid input
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Your balance: ");
                    acc.displayBalance();

                    System.out.print("Do you want to make another transaction? (y/n): ");
                    sc.nextLine();

                    String answer1 = sc.nextLine();

                    if (answer1.equalsIgnoreCase("y")) {
                        continue;
                    } else if (answer1.equalsIgnoreCase("n")) {
                        running = false;
                    } else {
                        System.out.println("Invalid input. Returning to menu.");
                    }

                    break;


                case 2:
                    System.out.print("Enter amount to deposit: ");

                    double amount;

                    try {
                        amount = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Please enter a number.");
                        sc.nextLine();
                        continue;
                    }

                    if (amount <= 0) {
                        System.out.println("Amount must be greater than 0.");
                        continue;
                    }

                    acc.deposit(amount);

                    System.out.println("Your transaction has been successfully deposited.");

                    System.out.print("Do you want to make another transaction? (y/n): ");
                    sc.nextLine();

                    String answer2 = sc.nextLine();

                    if (answer2.equalsIgnoreCase("y")) {
                        continue;
                    } else if (answer2.equalsIgnoreCase("n")) {
                        running = false;
                    } else {
                        System.out.println("Invalid input. Returning to menu.");
                    }

                    break;


                case 3:
                    System.out.print("Enter amount to withdraw: ");

                    double amount2;

                    try {
                        amount2 = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Please enter a number.");
                        sc.nextLine();
                        continue;
                    }

                    if (amount2 <= 0) {
                        System.out.println("Amount must be greater than 0.");
                        continue;
                    }

                    if (acc.getBalance() < amount2) {
                        System.out.println("Insufficient funds.");
                        continue;
                    }

                    acc.withdraw(amount2);

                    System.out.println("You have withdrawn " + amount2);

                    System.out.print("Do you want to make another transaction? (y/n): ");
                    sc.nextLine();

                    String answer3 = sc.nextLine();

                    if (answer3.equalsIgnoreCase("y")) {
                        continue;
                    } else if (answer3.equalsIgnoreCase("n")) {
                        running = false;
                    } else {
                        System.out.println("Invalid input. Returning to menu.");
                    }

                    break;


                case 4:
                    running = false;
                    System.out.println("Thank you for using this program.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}