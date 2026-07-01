import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

     System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
   System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
           System.out.println("4. Division");
            System.out.println("5. Modulus");
     System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Thank You!");
                break;
            }

    System.out.print("Enter First Number: ");
            double a = sc.nextDouble();

            System.out.print("Enter Second Number: ");
    double b = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                                System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by Zero Not Allowed");
                    break;

                case 5:
                    System.out.println("Result = " + (a % b));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
    

