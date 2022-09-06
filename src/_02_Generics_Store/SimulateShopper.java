package _02_Generics_Store;

import java.util.Scanner;

public class SimulateShopper {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much money do you want to spend?");
		int money = scan.nextInt();
		Cart<Item> cart = new Cart<Item>();
		
		System.out.println("What would you like to do?");
		String next = scan.nextLine();
		if (next.equals("buy cereal")) {
			
		}
		else if (next.equals("buy clothes")) {
			
		}
		else if (next.equals("buy toy")) {
			
		}
		else if (next.equals("buy candy")) {
			
		}
		
	}
}
