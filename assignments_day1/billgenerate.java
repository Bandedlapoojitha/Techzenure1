package assignments_day1;

import java.util.Scanner;

public class billgenerate  {


			public static void main(String[] args) {

				System.out.println("WELCOME TO POOJITHA THEATER");

				Scanner scn= new Scanner(System.in);

				     System.out.println("Enter the pizza Quantity = ");
				         int PQ=scn.nextInt();

				    System.out.println("Enter the Puffs Quantity = ");
				        int PfQ=scn.nextInt();  

				    System.out.println("Enter the Cool drink Quantity = ");
				    int CQ=scn.nextInt(); 


				    System.out.println("Enter the Water Bottle Quantity = ");
				            int WbQ=scn.nextInt();

				    System.out.println("*-------------------------------------------*");

				    System.out.println("Bill Details");

				   System.out.print("Pizza Price = 100");  // PRICE
				        int PizzPrice=PQ*100; // TOTAL COST OF PRODUCT
				        System.out.println("  Pizza QTY = "+PQ);// NO.OF QTY

				        System.out.print("Puffs price = 20");
				        int PuffsPrice=PfQ*20;
				        System.out.println("  Puff QTY = "+PfQ);

				        System.out.print("Drinks Price = 10");
				        int CoolDrinkPrice=CQ*10;
				        System.out.println("  Cool Drink QTY = "+CQ);

				        System.out.print("Water Bottle Price = 15");
				        int WaterBottleprice=WbQ*15; 
				       System.out.println("  Water Bottle QTY = "+WbQ);


				      float   Total=PizzPrice+PuffsPrice+CoolDrinkPrice+WaterBottleprice;


				      System.out.println("tota price = "+Total+" Rs/- ");

				      System.out.println("Thank You Visit Again");
				      System.out.println("ENJOY THE SHOW!!!");


					}



		}
