package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		
		String heightToRide = JOptionPane.showInputDialog(null, "What is your height");
		
		
	
	int heightAsInt = Integer.parseInt(heightToRide);
	
	if(heightAsInt >= 42)  
		JOptionPane.showMessageDialog(null, "You can ride the coaster with someone else!" ); 
	
	else if(heightAsInt >= 48)
		JOptionPane.showMessageDialog(null, "Hurray! You are tall enough to ride the coaster alone!");
	
	else
		JOptionPane.showMessageDialog(null, "You must be at least 42 inches tall to ride the roller coaster pal!");
		
} 
}
