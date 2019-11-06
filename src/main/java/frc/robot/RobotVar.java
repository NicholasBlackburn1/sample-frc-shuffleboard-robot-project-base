package frc.robot;

/*
 * Class for mapping robot vars
 *  
 * */ 
public class RobotVar{

    public double xVal = RobotHardware.accelerometer.getX(); // maps double xValue to the acceleromitor x axis 
    public double yVal = RobotHardware.accelerometer.getY(); // maps double yValue to the acceleromitor y axis 
    public double zVal = RobotHardware.accelerometer.getZ(); // maps double zValue to the acceleromitor z axis 

    public Boolean Xaxis; // bool to map the status of dio input 

    public double accval;
    
}