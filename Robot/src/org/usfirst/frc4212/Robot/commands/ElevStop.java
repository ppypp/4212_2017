package org.usfirst.frc4212.Robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc4212.Robot.Robot;

/**
 *
 */
public class ElevStop extends Command {

    public ElevStop() {
        requires(Robot.elevator);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.elevator.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//Robot.elevator.stop();
    }
}
