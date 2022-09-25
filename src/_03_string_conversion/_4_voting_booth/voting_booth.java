package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;


public class voting_booth {

public static void main(String[] args) {
	
	String ageString = JOptionPane.showInputDialog(null, "How old are you?");
	
	int age = Integer.parseInt(ageString);
	
	if(age >= 18)
		JOptionPane.showMessageDialog(null, "Who do you think will be the next president?");
	
	else 
		JOptionPane.showMessageDialog(null, "Shut up kid your opinion doesn't matter");
}
}
