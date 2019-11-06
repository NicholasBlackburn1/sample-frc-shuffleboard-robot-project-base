package frc.robot;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

public class RobotHardware {

    public static DigitalInput ElevatorXInput = new DigitalInput(RobotMap.Xlimit); // creates an Digital input for an Xaxis control
    
    public static Accelerometer accelerometer = new BuiltInAccelerometer(Accelerometer.Range.k4G); // creates and init accelerometer build in to the roborio

}