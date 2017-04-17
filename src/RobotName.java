
import org.jointheleague.graphical.robot.Robot;


public class RobotName {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot test5;
    	test5= new Robot ("mini");
    	test5.setX(100);
    	
    	Robot test6;
    	test6= new Robot ("mini");
    	test6.setX(300);
        // 3. Put the robot's pen down
    	test5.penDown();
    	test6.penDown();
        // 6. Make the robot move as fast as possible
    	test5.setSpeed(10);
    	test6.setSpeed(10);
        // 5. Do everything below here 4 times
    	
    
        //         2. Move your robot 200 pixels
    	test5.move(50);
    	test5.move(-50);
    	test5.turn(90);
    	test5.move(100);
    	test5.turn(-90);
    	test5.move(200);
        //         4. Turn the robot 90 degrees to the right (90 degrees)
    	test6.turn(15);
    	test6.move(200);
    	test6.turn(120);
    	
    }
}
