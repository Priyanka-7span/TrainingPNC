package project;

public class Account {
    String customerName;
    String customerID;
    int balance = 0;
    int previousTransaction = 0;

    Account(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }

    //Deposit method
    void deposit(int amount){
        if(amount > 0){ //checking if amount is greater than 0
            balance = balance + amount; //updating new balance
            previousTransaction = amount; //making this previous transaction
            System.out.println("Amount Deposited Successfully.");
            System.out.println("New Balance is: " + " " + balance);
        }else{
            System.out.println("Please enter amount greater than 0");
        }
    }

    //withdraw method
    void withdraw(int amount){
        if (amount < balance) { //checking ample balance availability
            if (amount > 0) { //checking withdrawal amount to be greater than 0
                balance = balance - amount; //updating new balance
                previousTransaction = -amount; //updating (-)amount to signify withdrawal
                System.out.println("Withdrawal Successful");
                System.out.println("New Balance is: " + " " + balance);
            } else {
                System.out.println("Please enter amount greater than 0");
            }
        } else{
                System.out.println("Insufficient Funds, Cannot Withdraw");
        }
    }

    //Previous Transaction method
    void getPreviousTransaction(){
        if (previousTransaction > 0){ //positive value = Deposited
            System.out.println("Deposited: "+ " " + previousTransaction);
        } else if (previousTransaction<0) { // negative value = Withdrawal
            System.out.println("Withdrawn: "+ " " + previousTransaction);
        } else {
            System.out.println("No transaction occurred");
        }
    }

    //Calculate Interest method
    void calculateInterest(int years){
        double interestRate = .0185; //keeping a constant rate
        double newBalance = (balance*interestRate*years) + balance; //# of years is received as a parameter
        System.out.println("The current interest rate is" + (100*interestRate) + "%");
        System.out.println("After " + years + " " + "years, your balance will be: " + newBalance);
    }
}

