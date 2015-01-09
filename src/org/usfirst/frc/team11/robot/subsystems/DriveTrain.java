package org.usfirst.frc.team11.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	Talon left1 = new Talon(0);
	Talon left2 = new Talon(1);
	Talon right1 = new Talon(2);
	Talon right2 = new Talon(3);
	Talon right3 = new Talon(4);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    public void setSpeed(double leftSpeed, double rightSpeed){
    	left1.set(leftSpeed);
    	left2.set(leftSpeed);
    	right1.set(rightSpeed);
    	right2.set(rightSpeed);
    	right3.set(rightSpeed);
    }
}

