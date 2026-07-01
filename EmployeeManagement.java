import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        double[] salary = new double[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Employee ID: ");
   id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Salary: ");
     salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added.");
                    break;

    case 2:

                    for (int i = 0; i < count; i++) {
                        System.out.println(id[i] + " " + name[i] + " " + salary[i]);
                    }
                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
           int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == search) {
                            System.out.println("ID : " + id[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println("Salary : " + salary[i]);
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found");

                    break;

   case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
    

