import java.util.Scanner;

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;

        while (true) {

            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit Successful.");
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

       if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful.");
                    } else {
        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 3:
       System.out.println("Current Balance = ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
    

