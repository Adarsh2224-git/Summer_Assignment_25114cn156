import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 25;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High");
            else if (guess < number)
                System.out.println("Too Low");
            else
                System.out.println("Correct Guess");

        } while (guess != number);
    }
}


