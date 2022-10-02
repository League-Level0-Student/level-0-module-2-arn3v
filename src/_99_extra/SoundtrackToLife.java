
package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are u in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Bored", "Depressed" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
        System.out.print(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if(userMood == 0) {
		  playVideo("https://www.youtube.com/watch?v=NMCgN4QK1Gw");
		}
        
		if(userMood == 1) {
		  playVideo("https://classroom.google.com/u/3/h");
		}
        
        if(userMood == 2) {
        playVideo("https://www.youtube.com/watch?v=C7dPqrmDWxs"); }

		
		// 4. Play different songs for other moods.

/**
* If you can't think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



