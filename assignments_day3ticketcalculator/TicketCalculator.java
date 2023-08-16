package assignments_day3ticketcalculator;

import java.util.Scanner;

public class TicketCalculator {

	public static void main(String[] args) {

					        Scanner scanner = new Scanner(System.in);

					        System.out.print("Enter no of bookings: ");
					        int numOfBookings = scanner.nextInt();

					        for (int i = 1; i <= numOfBookings; i++) {
					            System.out.print("Booking " + i + " - Enter the available tickets: ");
					            int availableTickets = scanner.nextInt();

					            System.out.print("Enter the ticket id: ");
					            int ticketId = scanner.nextInt();

					            System.out.print("Enter the price: ");
					            double ticketPrice = scanner.nextDouble();

					            System.out.print("Enter the no of tickets: ");
					            int numOfTickets = scanner.nextInt();

					            double totalCost = 0.0;

					            if (numOfTickets <= availableTickets) {
					                totalCost = ticketPrice * numOfTickets;
					                System.out.println("Booking " + i + " - Total cost of the ticket: $" + totalCost);
					                availableTickets -= numOfTickets;
					            } else {
					                System.out.println("Booking " + i + " - Not enough tickets available for this booking.");
					            }
					        }

					        System.out.println("Thank you for using the Ticket Calculator!");
					    }











	}
