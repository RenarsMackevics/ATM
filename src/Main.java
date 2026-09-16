import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("========[ATM]==========");

        Scanner sc  = new Scanner(System.in);

        BankAccount acc = new BankAccount(500.00);

        boolean running = true;

        while(running){
            System.out.println();
            System.out.println("1)Check balance");
            System.out.println("2)Deposit");
            System.out.println("3)Withdraw");
            System.out.println("4)Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Your balance: ");



                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");

                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");

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