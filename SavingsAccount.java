/**
 * Author: Jack Brashier
 * Date: 10/19/2017
 * Professor: Kanchanawanchai
 */
public class SavingsAccount extends Account {

    public SavingsAccount() {
        this.acctNum = 1234567;
        this.balance = 0.00;
        this.interestRate = 0.06;
        this.dateCreated = "01012010";
    }

    public SavingsAccount(int acctNum, double balance, double interestRate, String dateCreated) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    /** Converts info to a string */
    public String toString() {
        String returnString;
        returnString = Integer.toString(this.acctNum) + ": " + Double.toString(this.balance) + " @ " + Double.toString(this.interestRate) + " ~ " + this.dateCreated;
        return returnString;
    }

    /** Removes money from the account */
    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
