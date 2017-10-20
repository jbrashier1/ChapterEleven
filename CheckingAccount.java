/**
 * Author: Jack Brashier
 * Date: 10/19/2017
 * Professor: Kanchanawanchai
 */
public class CheckingAccount extends Account {
    private boolean overdraft;
    private double odFee;

    public CheckingAccount() {
        this.acctNum = 1234567;
        this.balance = 0.00;
        this.dateCreated = "01/01/2010";
        this.overdraft = false;
        this.odFee = 0.00;
    }

    public CheckingAccount(int acctNum, double balance, String dateCreated, boolean overdraft, double odFee) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.dateCreated = dateCreated;
        this.overdraft = overdraft;
        this.odFee = odFee;
    }

    /** Converts info to a string */
    public String toString() {
        String returnString;
        returnString = Integer.toString(this.acctNum) + ": " + Double.toString(this.balance) + " (-" + Double.toString(this.odFee) + " ODFee) ~ " + this.dateCreated;
        return returnString;
    }

    /** Determines whether the account is overdrafted, and applies an average $35 overdraft fee */
    public void checkOverdraft() {
        if(this.balance >= 0.00) {
            this.overdraft = false;
        } else if(this.balance <= 0.00) {
            this.overdraft = true;
            this.odFee = 35.00;
        }
    }
}
