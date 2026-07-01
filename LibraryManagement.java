import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        String[] author = new String[100];
        boolean[] issued = new boolean[100];

        int count = 0;

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
      sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully.");
                    break;

     case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nID\tBook\tAuthor\tStatus");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookId[i] + "\t" + bookName[i] + "\t" +
                                    author[i] + "\t" + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
               found = true;

                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book Already Issued.");
           }
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    found = false;

  for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            found = true;

                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully.");
             } else {
                                System.out.println("Book Was Not Issued.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

   case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
    

