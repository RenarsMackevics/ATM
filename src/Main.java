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
                    acc.displayBalance();


                    System.out.print("Do you want to make another transaction? (y/n)");
                    sc.nextLine();
                    if(sc.nextLine().equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);

                    System.out.println("Your transaction has been successfully deposited.");


                    System.out.print("Do you want to make another transaction? (y/n)");
                    sc.nextLine();
                    if(sc.nextLine().equals("y")){
                        continue;

                    }
                    else {
                        break;
                    }

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double amount2 = sc.nextDouble();

                    if(acc.getBalance() < amount2){
                        System.out.println("Insufficient funds.");
                        continue;
                    }

                    acc.withdraw(amount2);

                    System.out.println("You have withdrawn" + amount2 + " ");

                    System.out.print("Do you want to make another transaction? (y/n)");
                    sc.nextLine();
                    if(sc.nextLine().equals("y")){
                        continue;
                    }
                    else {
                        break;
                    }

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