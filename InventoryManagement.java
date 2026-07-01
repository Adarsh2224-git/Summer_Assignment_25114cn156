import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        int[] quantity = new int[100];

        int count = 0;

        while (true) {

      System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
      System.out.println("2. Display Products");
          System.out.println("3. Search Product");
          System.out.println("4. Update Quantity");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Product ID: ");
                    id[count] = sc.nextInt();

           sc.nextLine();

                    System.out.print("Product Name: ");
                    name[count] = sc.nextLine();

       System.out.print("Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;

                    System.out.println("Product Added.")
                          break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Products Available.");
                    } else {

                        System.out.println("\nID\tName\tQuantity");

                        for (int i = 0; i < count; i++) {
                            System.out.println(id[i] + "\t" + name[i] + "\t" + quantity[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == search) {

                            System.out.println("ID : " + id[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println("Quantity : " + quantity[i]);

                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int update = sc.nextInt();

                    found = false;

        for (int i = 0; i < count; i++) {

                        if (id[i] == update) {

                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Quantity Updated.");

                            found = true;
                        }
                    }

                    if (!found)
                                  System.out.println("Product Not Found.");

                    break;

      case 5:
          System.out.println("Thank You!");
       System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
    

