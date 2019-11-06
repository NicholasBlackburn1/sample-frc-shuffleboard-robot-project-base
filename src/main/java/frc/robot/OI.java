/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  // inits Driver Controller from driver station Computer 

  public static XboxController DriverController = new XboxController(RobotMap.Driver_Controller); // Creates Driver Controler via port 1

  public static XboxController operatorController = new XboxController(RobotMap.Operator_Controller); // Creates Driver Controler via port 2

  

  
}
