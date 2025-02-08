package frc.robot;


public final class Constants {
  public static final class DriveConstants {
    public static final int LEFT_MASTER_ID = 1;
    public static final int LEFT_SLAVE_ID = 2;
    public static final int RIGHT_MASTER_ID = 3;
    public static final int RIGHT_SLAVE_ID = 4;

    public static final int DRIVE_MOTOR_CURRENT_LIMIT = 60;
  }

  public static final class RollerConstants {
    public static final int ROLLER_MOTOR_ID = 5;
    public static final int ROLLER_MOTOR_CURRENT_LIMIT = 60;
    public static final double ROLLER_MOTOR_VOLTAGE_COMP = 10;
    public static final double ROLLER_EJECT_VALUE = 0.44;
  }

  public static final class OperatorConstants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 1;
  }
}
