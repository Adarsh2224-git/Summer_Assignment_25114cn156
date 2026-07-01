import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 10;

        while (true) {

            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("Available Seats: " + seats);

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

       System.out.print("Number of Tickets: ");
                    int book = sc.nextInt();

                    if (book <= seats) {
                        seats -= book;
                        System.out.println(book + " Ticket(s) Booked.");
           } else {
                        System.out.println("Seats Not Available.");
                    }

                    break;

                case 2:
                    System.out.print("Number of Tickets to Cancel: ");
                    int cancel = sc.nextInt();
      seats += cancel;

                    if (seats > 10)
                        seats = 10;

                    System.out.println("Ticket Cancelled.");

                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
    

