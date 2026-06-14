import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 1) {
            System.out.println("Nth Fibonacci Number = " + a);
        } 
        else if (n == 2) {
            System.out.println("Nth Fibonacci Number = " + b);
        } 
        else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Number = " + c);
        }

        sc.close();
    }
}