
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
    public static void main(String[] args) throws InterruptedException {
   
    	String countdown = JOptionPane.showInputDialog(null, "Where should the countdown start from?" );
    	
        int c = Integer.parseInt(countdown);
        
       
        for (int i = c; i >=0; i--) {
        	System.out.println(i);
        	Thread.sleep(1000);
        }
        
        System.out.print("Blastoff!");
        
    }
}


