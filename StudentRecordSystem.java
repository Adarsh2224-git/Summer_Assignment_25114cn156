import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] roll = new int[100];
        String[] name = new String[100];
        double[] marks = new double[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
       roll[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

       System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
       if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
       System.out.println("\nRoll\tName\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
    

