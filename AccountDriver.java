/**
 * Author: Jack Brashier
 * Date: 10/19/2017
 * Professor: Kanchanawanchai
 */
public class AccountDriver {
    public static void main(String[] args) {
        Account jack = new Account();
        CheckingAccount jackChecking = new CheckingAccount(9876543, -60, "04/30/2007", true, 34.50);
        SavingsAccount jackSavings = new SavingsAccount(9876544, 10095, 0.06, "04/30/2007");
        System.out.println(jack.toString());
        System.out.println(jackChecking.toString());
        System.out.println(jackSavings.toString());
    }
}
