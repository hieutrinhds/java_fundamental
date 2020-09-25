import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create two Account objects
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial value of balance for each Account
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); //prompt
        double depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }

} // end class AccountTest
