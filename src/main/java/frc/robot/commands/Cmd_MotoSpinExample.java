// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Sub_MotorSpinExample;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;


public class Cmd_MotoSpinExample extends CommandBase {
   /** Creates a new Cmd_MotoSpinExample. */
  
   //Sets Sub_MotorSpinExample to be called m_MotorExample
  private final Sub_MotorSpinExample m_MotorExample;

  //sets paramaters that Cmd_MotorSpinExample needs to Sub_MotorSpinExample
  public Cmd_MotoSpinExample(Sub_MotorSpinExample Subsystem){
    m_MotorExample = Subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_MotorExample);
  }
  
    

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //Runs the start code from Sub_MotorSpinExample
    m_MotorExample.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //Runs the stop code from Sub_MotorSpinExample
    m_MotorExample.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
