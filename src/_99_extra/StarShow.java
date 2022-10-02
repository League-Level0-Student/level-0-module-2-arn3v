
package _99_extra;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		int robotX = 300;
		
		int robotY = 300;
		
		int StarSize = 25;
		
		robot.setSpeed(1000);
		for( int i = 0; i < 30; i++) {
			robot.setPenWidth(i);
			robot.setX(robotX);
			robot.setY(robotY);
			drawStar(StarSize);
			robot.setX(robotX + StarSize);
			robot.setY(robotY - StarSize);
			StarSize += 20;
			robot.turn(12);
			robot.setPenColor(new Random().nextInt(256) , new Random().nextInt(256), new Random().nextInt(256));
		}

	}

	private void drawStar(int starSize) {
		
		 for( int i = 0; i < 5; i++) {
			 robot.penDown();
			 robot.move(starSize);
			 robot.turn(144);
		 }
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





