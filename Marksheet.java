import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

  double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n------ Marksheet ------");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage);
        System.out.println("Grade        : " + grade);

        if (percentage >= 40)
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");
    }
}
    

