import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        while (true) {

            System.out.println("\n===== Array Operations =====");
 System.out.println("1. Input Array");
            System.out.println("2. Display Array");
                System.out.println("3. Find Maximum");
      System.out.println("4. Find Minimum");
            System.out.println("5. Sum");
            System.out.println("6. Search");
            System.out.println("7. Sort");
         System.out.println("8. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
               arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println(Arrays.toString(arr));
                    break;

                case 3:
                    int max = arr[0];
                    for (int x : arr)
           if (x > max)
                            max = x;
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int x : arr)
                        if (x < min)
                            min = x;
                    System.out.println("Minimum = " + min);
                    break;

                case 5:
                    int sum = 0;
                    for (int x : arr)
                        sum += x;
                    System.out.println("Sum = " + sum);
                    break;

                case 6:
                    System.out.print("Enter Element: ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for (int x : arr) {
                        if (x == key) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Element Found");
                    else
                        System.out.println("Element Not Found");

                    break;

                case 7:
                    Arrays.sort(arr);
                    System.out.println("Array Sorted");
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
    

