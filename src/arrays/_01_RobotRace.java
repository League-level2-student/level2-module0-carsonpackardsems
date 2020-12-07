package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static //1. make a main method
	int winnerSaver;
public static void main(String[] args) {
Robot [] robot = new Robot[5];

for(int i = 0; i < 5; i++) {
	int difference = i*100;
robot [i] = new Robot();
robot [i].setX(50 + difference);
robot [i].setY(500);
}
boolean raceOver = false;
while(raceOver == false) {
for(int is = 0; is < 5; is++) {
	Random r = new Random();
	int ran = r.nextInt(100);
	robot[is].move(ran);
	if(robot[is].getY() <= 20) {
		robot[is].setY(20);
		robot[is].turn(90);
	}
	if(robot[is].getX() <= 500) {
		//set X and turn 90 degrees
	}
	if(robot[is].getY() == 0 ) {
		if(robot[is].getX() == 0) {
			raceOver = true;
			winnerSaver = is + 1;
		break;
		}
	}
	
}

}
JOptionPane.showMessageDialog(null, "Robot " + winnerSaver + " is the winner!");
JOptionPane.showMessageDialog(null, "The party was legendary! It was remembered as 'The Great Robot Race' for all time.");
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}