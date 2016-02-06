package org.usfirst.frc.team2526.robot.subsystems;

import org.usfirst.frc.team2526.robot.Robot;
import org.usfirst.frc.team2526.robot.RobotMap;
import org.usfirst.frc.team2526.robot.commands.Drive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	RobotDrive crane = new RobotDrive(new CANTalon(RobotMap.leftTalon), new CANTalon(RobotMap.rightTalon));

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new Drive());
    	setDefaultCommand(new Drive());
    }
    
    // Main Driver, non inverted system
    public void CraneDrive() {
    	if (RobotMap.primaryControl) {
    		// Main driver
    		crane.arcadeDrive(Robot.oi.getPrimaryValue().getY(), -Robot.oi.getSecondaryValue().getX());
    	} else {
    		// Co Driver
        	crane.arcadeDrive(-Robot.oi.getThirdValue().getY() * RobotMap.secondaryWeight, -Robot.oi.getFourthValue().getX() * RobotMap.secondaryWeight, false);
    	}
    	
    }
    
}

