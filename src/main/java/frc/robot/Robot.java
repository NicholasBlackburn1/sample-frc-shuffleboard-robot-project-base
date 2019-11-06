/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.Shuffleboard_Init;
;


public class Robot extends TimedRobot {

  // inits the classes of Hardwaremap and Operator control

  public static OI m_oi; // creates an simple linking method for Operator Interface

  public static RobotHardware m_hardware; // creates an simple linking method for robot harware

  public static Shuffleboard_Init shuffleboardinit;// creates an simple linking method for The Shuffleboardint class

  public static RobotVar robotvar; // creates an simple linking method for The RobotVar class

  @Override
  public void robotInit() {

    m_oi = new OI(); // method for calling Operator Interface 
    m_hardware = new RobotHardware(); // method for calling Robot Init hardware interface'
  

    shuffleboardinit.Init(); // inits Shuffleboards Data tab items layout and position
  }

  
  @Override
  public void robotPeriodic() {
  }


  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
   
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {
  
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

 
  @Override
  public void testPeriodic() {

    shuffleboardinit.Perodic(); // Checks for X axis input from the robot
  }
}
