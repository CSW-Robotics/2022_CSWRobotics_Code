// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class Sub_MotorSpinExample extends SubsystemBase {
  //creates a new TalonSRX called motor_1
  //Sets motor_1's port number from the constants file
  private final TalonSRX motor_1 = new TalonSRX(Constants.motor_1Port);
 
  //Creates a stop option for motor_1
  //Sets motor_1 to 0% speed
  public void stop(){
    motor_1.set(ControlMode.PercentOutput, 0);
  }

  //Creates a start option for motor_1
  //Sets motor_1 to 100% speed
  public void start(){
    motor_1.set(ControlMode.PercentOutput, 1);

  }
 
  /** Creates a new Sub_MotorSpinExample. */
  public Sub_MotorSpinExample() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
