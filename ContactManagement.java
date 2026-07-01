import java.util.Scanner;

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        String[] phone = new String[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:
      System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone[count] = sc.nextLine();

                    count++;

      System.out.println("Contact Saved.");
                    break;

                case 2:

                    if (count == 0) {
                                  System.out.println("No Contacts Found.");
                    } else {
                        System.out.println("\nName\tPhone");
                        for (int i = 0; i < count; i++) {
                            System.out.println(name[i] + "\t" + phone[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : " + name[i]);
                            System.out.println("Phone: " + phone[i]);
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");

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
    

