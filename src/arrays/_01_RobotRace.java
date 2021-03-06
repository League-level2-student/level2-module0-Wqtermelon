package arrays;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		ArrayList<Robot> robot = new ArrayList<Robot>();
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robot.add(new Robot());
			robot.get(i).setX(80 + i * 180);
			robot.get(i).setY(500);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		for (int i = 0; i < 5; i++) {
			while (robot.get(i).getY()!=0) {
				robot.get(i).setY(robot.get(i).getY() - (int) (Math.random() * 50));
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
	