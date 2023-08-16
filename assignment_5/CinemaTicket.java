package assignment_5;

import java.util.Scanner;

public class CinemaTicket {

					public static void main(String[] args) {
						@SuppressWarnings("resource")
						Scanner scn=new Scanner(System.in);
				        System.out.print("Enter the no of tickets: ");
				        int numOfTickets=scn.nextInt();
				        double discount=0.1;
				        double couponDiscount=0.02;
				        int kingTicketCost=85;
				        int queenTicketCost=250;
				        int refreshmentCharge=50;
				        double ticketCost;
				        if(numOfTickets>=6 && numOfTickets<=60)
				        {
				        	 System.out.print("Do you want refreshment: ");
				             char refreshment=scn.next().charAt(0);
				             System.out.print("Do you have coupon code: ");
				             char couponCode=scn.next().charAt(0);
				             System.out.print("Enter the Circle: ");
				             char circle=scn.next().charAt(0);

				             if(circle =='K')
				             {
				            	 ticketCost=numOfTickets*kingTicketCost;
				             }
				             else{
				            	 ticketCost=numOfTickets*queenTicketCost;
				             }

				             double discount1 = 0;
							if(numOfTickets>20)
				            	 discount1 = ticketCost*discount;
				            	 ticketCost=ticketCost-discount1;
				             double discount2 = 0;
							if(couponCode=='Y')
				            	 discount2=ticketCost*couponDiscount;
				            	 ticketCost=ticketCost-discount2;
				            if(refreshment=='Y')
				            	 ticketCost+=(numOfTickets*refreshmentCharge);

				             System.out.println("Ticket cost: "+ticketCost);     	
				        }
				        else {
				        	System.out.println("minimum of 5 and maximum of 40 tickets");
				        }     
					}







	}


   