/**
 * Author: Jack Brashier
 * Date: 10/19/2017
 * Professor: Kanchanawanchai
 */
public class Account {
    public int acctNum;
    public double balance;
    public double interestRate;
    public String dateCreated; // MM/DD/YYYY

    public Account() {
        this.acctNum = 1234567;
        this.balance = 10000.00;
        this.interestRate = 0.06;
        this.dateCreated = "01/01/2010";
    }

    public Account(int acctNum, double balance, double interestRate, String dateCreated) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    /** Converts info to a string */
    public String toString() {
        String returnString;
        returnString = Integer.toString(this.acctNum) + ": $" + Double.toString(this.balance) + " @ " + Double.toString(this.interestRate) + " ~ " + this.dateCreated;
        return returnString;
    }

    /** Puts money into the account */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /** Takes money out of the account */
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
