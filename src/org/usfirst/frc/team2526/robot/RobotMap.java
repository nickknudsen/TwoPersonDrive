package org.usfirst.frc.team2526.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	
	public static int rightTalon = 1;
	public static int leftTalon = 2;
	
	public static boolean primaryControl = true;
	public static boolean secondaryControl = false;
	
	public static double secondaryWeight = .65; // How we weight down the joystick sensitivity
	
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public boolean getPrimaryControl() {
		return primaryControl;
	}
	
	public boolean getSecondaryControl() {
		return secondaryControl;
	}
	
	public void setPrimaryControl(boolean set) {
		primaryControl = set;
	}
	
	public void setSecondaryControl(boolean set) {
		secondaryControl = set;
	}
}
