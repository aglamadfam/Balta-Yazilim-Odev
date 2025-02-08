package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.Constants.RollerConstants;
import frc.robot.commands.AutoCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.RollerCommand;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANRollerSubsystem;

public class RobotContainer {
  //robotun subsystemler
  private final CANDriveSubsystem driveSubsystem = new CANDriveSubsystem();
  private final CANRollerSubsystem rollerSubsystem = new CANRollerSubsystem();

  private final CommandXboxController driverController = new CommandXboxController(
      OperatorConstants.DRIVER_CONTROLLER_PORT);

  private final CommandXboxController operatorController = new CommandXboxController(
      OperatorConstants.OPERATOR_CONTROLLER_PORT);

  private final SendableChooser<Command> autoChooser = new SendableChooser<>();

  public RobotContainer() {
    configureBindings();

    autoChooser.setDefaultOption("Autonomous", new AutoCommand(driveSubsystem));
  }

  private void configureBindings() {

    operatorController.a()
        .whileTrue(new RollerCommand(() -> RollerConstants.ROLLER_EJECT_VALUE, () -> 0, rollerSubsystem));

    driveSubsystem.setDefaultCommand(new DriveCommand(
      //sağbumper basılıysa hızı tam olur basılı değilse yarım
        () -> -driverController.getLeftY() * (driverController.getHID().getRightBumperButton() ? 1 : 0.5),
        () -> -driverController.getRightX(),
        driveSubsystem));

    rollerSubsystem.setDefaultCommand(new RollerCommand(
        () -> operatorController.getRightTriggerAxis(),
        () -> operatorController.getLeftTriggerAxis(),
        rollerSubsystem));
  }

  public Command getAutonomousCommand() {
    return autoChooser.getSelected();
  }
}
