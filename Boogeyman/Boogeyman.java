package Boogeyman;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Boogeyman - a robot by (your name here)
 */
public class Boogeyman extends Robot
{
	/**
	 * run: Boogeyman's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			double i = (double) (40+Math.random()*400);
			double j = (double) (40+Math.random()*400);
			double k = (double) (1+Math.random()*180);
			ahead(i);
			back(j);
			turnRight(k);
			turnGunRight(360);
			setAdjustGunForRobotTurn(true);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(4);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		ahead(80);
		back(10);
	}
	
	/**
	 * onHitRobot: What to do when you hit a robot
	 */
	public void onHitRobot(HitRobotEvent e) {
		back(50);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		double x = getX();
		double y = getY();
		double m = getBattleFieldWidth();
		double n = getBattleFieldHeight();
		if((x==m)||(x==0)) {
			ahead(100);
		}
		if((y==n)||(y==0)) {
			back(60);
		}
	}	
}
