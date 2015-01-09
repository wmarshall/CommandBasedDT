package org.usfirst.frc.team11.robot.commands;

import org.usfirst.frc.team11.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends CommandBase {

    public JoystickDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	dt.setSpeed(OI.getLeftJoy(), OI.getRightJoy());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
