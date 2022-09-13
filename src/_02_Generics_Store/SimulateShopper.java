package _02_Generics_Store;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class SimulateShopper {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much money do you want to spend?");
		int totalMoney = scan.nextInt();
		int money = totalMoney;
		Cart<Item> cart = new Cart<Item>();
		boolean checkOut = false;
		int candyPrice = new Candy().getPrice();
		int cerealPrice = new Cereal().getPrice();
		int clothesPrice = new Clothing().getPrice();
		int toyPrice = new Toy().getPrice();
		
		while(!checkOut) {
			
			
		
			
			System.out.println("What would you like to do?");
			
			String next = scan.nextLine();
			
			
			if (next.equals("buy cereal")) {
				if (money >= cerealPrice) {
					cart.add(new Cereal());
					money-=cerealPrice;
				}
				else {
					System.out.println("You can't afford this; you have " + money + " dollars.");
				}
			}
			else if (next.equals("buy clothes")) {
				if (money >= clothesPrice) {
					cart.add(new Clothing());
					money-=clothesPrice;
				}
				else {
					System.out.println("You can't afford this; you have " + money + " dollars.");
				}
			}
			else if (next.equals("buy toy")) {
				if (money >= toyPrice) {
					cart.add(new Toy());
					money-=toyPrice;
				}
				else {
					System.out.println("You can't afford this; you have " + money + " dollars.");
				}
			}
			else if (next.equals("buy candy")) {
				if (money >= candyPrice) {
					cart.add(new Candy());
					money-=candyPrice;
				}
				else {
					System.out.println("You can't afford this; you have " + money + " dollars.");
				}
				
			}
			else if (next.equals("sell cereal")) {
				cart.remove("cereal");
				money+=cerealPrice;
			}
			else if (next.equals("sell clothes")) {
				cart.remove("clothes");
				money+=clothesPrice;
			}
			else if (next.equals("sell toy")) {
				cart.remove("toy");
				money+=toyPrice;
			}
			else if (next.equals("sell candy")) {
				cart.remove("candy");
				money+=candyPrice;
			}
			else if (next.equals("show cart")) {
				cart.viewCart();
			}
			else if (next.equals("show money")) {
				System.out.println("You have " + money + " dollars.");
			}
			else if (next.equals("check out")) {
				System.out.println("Are you sure? You still have " + money + " dollars.");
				next = scan.nextLine();
				if (next.equals("yes")) {
					System.out.println("Here is your recipt: ");
					cart.viewCart();
					System.out.println("Total money spent = " + (totalMoney - money) + "$");
					cart.showCart();
					checkOut= true;
				}
			}
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
		}
	}
}
