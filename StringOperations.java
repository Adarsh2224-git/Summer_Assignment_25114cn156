import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        while (true) {

            System.out.println("\n===== String Operations =====");
            System.out.println("1. Length");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse");
            System.out.println("5. Palindrome");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

  switch (choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

        case 2:
                    System.out.println(str.toUpperCase());
                    break;

      case 3:
                    System.out.println(str.toLowerCase());
                    break;

                case 4:
                    String rev = "";
                    
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }

                    System.out.println("Reverse = " + rev);
                    break;

                case 5:

                    rev = "";

      for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }

       if (str.equalsIgnoreCase(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");

        break;

                case 6:
                    System.exit(0);

       default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
    

