package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class CANDriveSubsystem extends SubsystemBase {
  private final SparkMax leftMaster;
  private final SparkMax leftSlave;
  private final SparkMax rightMaster;
  private final SparkMax rightSlave;

  private final DifferentialDrive drive;

  public CANDriveSubsystem() {
    // motor atama
    leftMaster = new SparkMax(DriveConstants.LEFT_MASTER_ID, MotorType.kBrushed);
    leftSlave = new SparkMax(DriveConstants.LEFT_SLAVE_ID, MotorType.kBrushed);
    rightMaster = new SparkMax(DriveConstants.RIGHT_MASTER_ID, MotorType.kBrushed);
    rightSlave = new SparkMax(DriveConstants.RIGHT_SLAVE_ID, MotorType.kBrushed);

    drive = new DifferentialDrive(leftMaster, rightMaster);

    leftMaster.setCANTimeout(250);
    rightMaster.setCANTimeout(250);
    leftSlave.setCANTimeout(250);
    rightSlave.setCANTimeout(250);

    SparkMaxConfig config = new SparkMaxConfig();
    //VOLTAJ
    config.voltageCompensation(12);
    //maximum voltajı constantstan 60 atıyor
    config.smartCurrentLimit(DriveConstants.DRIVE_MOTOR_CURRENT_LIMIT);

    config.follow(leftMaster);
    leftSlave.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.follow(rightMaster);
    rightSlave.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    config.disableFollowerMode();
    rightMaster.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.inverted(true);
    leftMaster.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }

  @Override
  public void periodic() {
  }

  public void driveArcade(double xSpeed, double zRotation) {
    drive.arcadeDrive(xSpeed, zRotation);
  }
}
