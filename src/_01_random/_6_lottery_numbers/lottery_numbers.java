package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	public static void main(String[] args) {
		Random num = new Random();
		// creating the 6 random numbers (has to be seperate variables)
		int r = num.nextInt(101);
		int a = num.nextInt(101);
		int n = num.nextInt(101);
		int d = num.nextInt(101);
		int o = num.nextInt(101);
		int m = num.nextInt(101);
		
		// used oracle documentation -> https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
		
		// use "+" for concatenating, have to add a |+ " " +| in between each variable to create a space. Finally, add the "Lottery Ticket" to create a title for the pop-up. When doing a title for the pop-up, you need to have a 1 at the end, otherwise JOptionPane does not work. 
		
		JOptionPane.showMessageDialog(null,r + " " + a + " " + n + " " + d + " " + o + " " + m , "Lottery Ticket", 1);
		
		
	}

}
