package _02_Generics_Store;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Item> {
    private T[] cart;

    public Cart() {
        cart = (T[]) new Item[100];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 100 items");
    }

    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                 panel.add(cart[i].getItem());
            }
        }
        frame.pack();

    }

    public int length() {
        return cart.length;
    }
    
    public void viewCart() {
    	if (cart.length == 0) {
    		System.out.println("Your cart is empty.");
    	}
    	else {
    		System.out.println("Your items are: ");
    		for(int i = 0; i < cart.length; i++) {
    			if (cart[i] != null) {
    			System.out.println(cart[i]);
    			System.out.println("Costs " + cart[i].getPrice() + "$");
    			}
    		}
    	}
    }
    
    public void remove(String thing) {
    	for (int i = 0; i < cart.length; i++) {
    		if (cart[i].getType().equals(thing)) {
    			cart[i] = null;
    			return;
    		}
    	}
    	System.out.println("Could not find the item you were looking for.");
    }
 
}
