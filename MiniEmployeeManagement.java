import java.util.Scanner;

public class MiniEmployeeManagement {

    static Scanner sc = new Scanner(System.in);

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] department = new String[100];
    static double[] salary = new double[100];

    static int count = 0;

    // Add Employee
    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee Added Successfully.");
    }

    // Display Employees
    static void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n--------------------------------------------------------");
        System.out.println("ID\tName\t\tDepartment\tSalary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(empId[i] + "\t" + empName[i] + "\t\t"
                    + department[i] + "\t\t₹" + salary[i]);
        }
    }

    // Search Employee
    static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("\nEmployee Found");
                System.out.println("ID         : " + empId[i]);
                System.out.println("Name       : " + empName[i]);
                System.out.println("Department : " + department[i]);
                System.out.println("Salary     : ₹" + salary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Update Salary
    static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();

                System.out.println("Salary Updated Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Delete Employee
    static void deleteEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                for (int j = i; j < count - 1; j++) {

                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];
                }

                count--;

                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========= MINI EMPLOYEE MANAGEMENT SYSTEM =========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    deleteEmployee();
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
    

