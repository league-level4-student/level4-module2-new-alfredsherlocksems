package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends Item{
	public Clothing() {
		if(new Random().nextBoolean()) {
			this.item = "clothing1.jpeg";
		}
		else {
			this.item = "clothing2.jpeg";
		}
	}

	@Override
	public JLabel getItem() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "clothing";
	}
}
