import java.util.Scanner;

public class MiniLibrarySystem {

    static Scanner sc = new Scanner(System.in);

    static int[] bookId = new int[100];
    static String[] bookName = new String[100];
    static String[] author = new String[100];
    static boolean[] issued = new boolean[100];

    static int count = 0;

    // Add Book
    static void addBook() {
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
    }

    // Display Books
    static void displayBooks() {

        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\n-----------------------------------------------");
        System.out.println("ID\tBook Name\tAuthor\t\tStatus");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(bookId[i] + "\t" + bookName[i] + "\t\t"
                    + author[i] + "\t\t"
                    + (issued[i] ? "Issued" : "Available"));
        }
    }

    // Issue Book
    static void issueBook() {

        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (!issued[i]) {
                    issued[i] = true;
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Return Book
    static void returnBook() {

        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (issued[i]) {
                    issued[i] = false;
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book Was Not Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Search Book
    static void searchBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                System.out.println("\nBook Found");
                System.out.println("Book ID    : " + bookId[i]);
                System.out.println("Book Name  : " + bookName[i]);
                System.out.println("Author     : " + author[i]);
                System.out.println("Status     : " +
                        (issued[i] ? "Issued" : "Available"));
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== MINI LIBRARY SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
    

