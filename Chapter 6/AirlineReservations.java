import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[10];

        while (true) {
            System.out.println("\nPlease type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            System.out.print("Enter your choice (0 to exit): ");

            int choice = input.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice.");
                continue;
            }

            int start = (choice == 1) ? 0 : 5;
            int end = (choice == 1) ? 5 : 10;

            int seat = -1;

            for (int i = start; i < end; i++) {
                if (!seats[i]) {
                    seat = i;
                    break;
                }
            }

            if (seat == -1) {
                System.out.println("Section is full.");

                System.out.print("Would you like a seat in the other section? (1 = Yes, 2 = No): ");
                int answer = input.nextInt();

                if (answer == 1) {
                    start = (choice == 1) ? 5 : 0;
                    end = (choice == 1) ? 10 : 5;

                    for (int i = start; i < end; i++) {
                        if (!seats[i]) {
                            seat = i;
                            break;
                        }
                    }
                }

                if (seat == -1) {
                    System.out.println("Next flight leaves in 3 hours.");
                    continue;
                }
            }

            seats[seat] = true;

            System.out.println("\nBOARDING PASS");
            System.out.println("Seat Number: " + (seat + 1));
            System.out.println("Section: " +
                (seat < 5 ? "First Class" : "Economy"));
        }
    }
}