package project;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer ID: ");
        String customerID = scanner.nextLine();
        Account account = new Account(customerName,customerID);

        System.out.println("__________________________");
        System.out.println("Welcome, "+ account.customerName + "!");
        System.out.println("Your ID is: " + account.customerID);
        System.out.println("__________________________");
        System.out.println("Select Any Option To Proceed");
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Interest");
        System.out.println("F. Exit");

        char option; //char data type variable to accept user's choice
        boolean flag = true; //will be used to loop until user exits the program
        while (flag){
            System.out.println("Enter Your Choice:");
            option = scanner.next().charAt(0); //syntax to accept a single character as input
            switch (option){
                case 'A' :
                    System.out.println("Account Balance = $" + account.balance);
                    break;
                case 'B' :
                    System.out.println("Enter an amount to deposit: ");
                    int depositAmount = scanner.nextInt(); //accept an amount input
                    account.deposit(depositAmount);
                    break;
                case 'C' :
                    System.out.println("Enter an amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt(); //accept an amount input
                    account.withdraw(withdrawAmount);
                    break;
                case 'D' :
                    account.getPreviousTransaction();
                    break;
                case 'E' :
                    System.out.println("Enter the years for which you wish to calculate the interest: ");
                    int years = scanner.nextInt(); //accept # of years as input
                    account.calculateInterest(years);
                    break;
                case 'F' :
                    System.out.println("Thank you for banking with us!");
                    scanner.close();
                    flag = false; //nullify flag to terminate the while loop
                    break;
                default:
                    System.out.println("Error: Invalid option. Please enter A, B, C, D, E or F to access services.");
            }
        }
    }
}