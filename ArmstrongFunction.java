import java.util.Scanner;

public class ArmstrongFunction {

    static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is Not an Armstrong Number");

        sc.close();
    }
}
    

