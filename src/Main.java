import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (atm.login(pin)) {
            System.out.println("Login Successful");
            atm.showMenu();
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}