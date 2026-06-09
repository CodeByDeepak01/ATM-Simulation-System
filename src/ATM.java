import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private final int PIN = 1234;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public boolean login(int pin) {
        return pin == PIN;
    }

    public void showMenu() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ₹");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}