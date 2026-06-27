import java.util.Scanner;

public class UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        System.out.println("Enter first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        System.out.println("Enter second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Union:");

        for (int i = 0; i < n1; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < n1; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
    

