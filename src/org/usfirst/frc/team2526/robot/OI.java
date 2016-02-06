package org.usfirst.frc.team2526.robot;

import org.usfirst.frc.team2526.robot.commands.Nothing;
import org.usfirst.frc.team2526.robot.commands.SwitchDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	Joystick primaryStick = new Joystick(0);
	Joystick secondaryStick = new Joystick(1);
	Joystick thirdStick = new Joystick(2);
	Joystick fourthStick = new Joystick(3);
//	Button primaryStickSeven = new JoystickButton(primaryStick,7);
//	Button primaryStickEight = new JoystickButton(primaryStick,8);
//	Button primaryStickTen = new JoystickButton(primaryStick,10);
	
	Button primaryStickOne = new JoystickButton(primaryStick,1);
	
	
	Button thirdStickOne = new JoystickButton(thirdStick, 1);
	Button fourthStickOne = new JoystickButton(fourthStick, 1);
	

	
	public Joystick getPrimaryValue() {
		return primaryStick;
	}
	
	public Joystick getSecondaryValue() {
		return secondaryStick;
	}
	
	public Joystick getThirdValue() {
		return thirdStick;
	}
	
	public Joystick getFourthValue() {
		return fourthStick;
	}
	
	public OI() {
	
//		primaryStickOne.whenPressed(new SwitchDrive());
//		primaryStickOne.whenReleased(new Nothing());
//		primaryStickFive.whenPressed(new SwitchDrive());
		fourthStickOne.whenPressed(new SwitchDrive());
		fourthStickOne.whenReleased(new SwitchDrive());		
	}
	
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

