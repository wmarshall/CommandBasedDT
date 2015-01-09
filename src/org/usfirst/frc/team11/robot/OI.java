package org.usfirst.frc.team11.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team11.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   static Joystick leftJoy = new Joystick(1);
   static Joystick rightJoy = new Joystick(2);
   public static double getLeftJoy(){
	   return -leftJoy.getY();
   }
   public static double getRightJoy(){
	   return -rightJoy.getY();
   }
}

