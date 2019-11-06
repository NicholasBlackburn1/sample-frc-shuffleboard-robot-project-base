/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  // Elevator limit digital input
  public static int Xlimit = 0;
  public static int Ylimit = 1;
  public static int Zlimit = 2;

  // DriverStation-Controler ports 
  public static int Driver_Controller  = 1;
  public static int Operator_Controller = 2;
  public static int Operational_Panal = 3;


}
