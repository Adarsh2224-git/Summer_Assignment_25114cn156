import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("1. Java is developed by?");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.print("Answer: ");

        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        System.out.println("\n2. 5 + 7 = ?");
        System.out.println("a) 10");
        System.out.println("b) 12");
        System.out.println("c) 15");
        System.out.print("Answer: ");

        ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B')
            score++;

        System.out.println("\nYour Score = " + score + "/2");
    }
}
