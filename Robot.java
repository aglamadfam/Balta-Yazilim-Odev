// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

    private CANSparkMax leftMotor1 = new CANSparkMax(1, MotorType.kBrushless);
    private CANSparkMax leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
    private CANSparkMax rightMotor1 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);


  private Joystick joy1 = new Joystick(0);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double speed = -joy1.getRawAxis(1) * 0.75;
    // speedde joy kısmına eksi koymamızın gereği üste gidince normalde negatiflere gidiyor
    // o yüzden çevirmek için - koyduk ve hızını kontrol etmesi kolay olsun diye %75 ile sınırladık
    double turn = joy1.getRawAxis(4) * 0.3;
    // axisleri frc driver stationda hangisi gösteriyorsa ona göre ayarlamamız lazım 
    // kontrol etmesi kolay olsun diye %30 ile sınırlandırdık

    double left = speed + turn;
    double right = speed - turn;


    leftMotor1.set(left);
    leftMotor2.set(left);
    rightMotor1.set(-right);
    rightMotor2.set(-right);
  }

  @Override 
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
