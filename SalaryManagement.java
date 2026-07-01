import java.util.Scanner;

public class SalaryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;

        double netSalary = basic + hra + da - pf;

        System.out.println("\n------ Salary Slip ------");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("PF            : " + pf);
        System.out.println("Net Salary    : " + netSalary);
    }
}
    

