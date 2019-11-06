package frc.robot.subsystems;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;
import frc.robot.OI;
import frc.robot.RobotHardware;
import frc.robot.RobotVar;

public class Shuffleboard_Init {


    static OI oi = new OI(); // calls Operator interface class in a method called oi

    static RobotVar vRobotVar = new RobotVar(); // calls Robot Var interface class in a method called robotvar

    
  

    // Init function
    public void Init(){

        ShuffleboardTab dataTab = Shuffleboard.getTab("Data_Tab"); // Creates new tab in shuffleboard
        
        final NetworkTableEntry hightEntry = dataTab.add("X-axis", vRobotVar.Xaxis) // reads digital input from dio port 1 on roborio
        .withPosition(0,0)
        .withSize(2,1)
        .getEntry();

        final NetworkTableEntry drivercontrollerAEntry = dataTab.add("driver button A", OI.DriverController.getAButton()) // reads and displays driver controller button A status
        .withPosition(0, 2)
        .withSize(2, 1)
        .getEntry();

        final SimpleWidget drivercontrolerjoysticXWidget = dataTab.add("driver LeftStickX", OI.DriverController.getX(Hand.kLeft)) // reads and diaplays the x axis of the left joystic on the driver controler 
        .withPosition(0, 3)
        .withSize(2,1)
        .withProperties(Map.of("min",-1,"max",1))
        .withWidget(BuiltInWidgets.kNumberBar);

        final SimpleWidget drivercontrollerYWidget = dataTab. add("driver LeftstickY", OI.DriverController.getY(Hand.kLeft))// reads and diaplays the y axis of the left joystic on the driver controler 
        .withPosition(0, 4)
        .withSize(2, 1)
        .withProperties(Map.of("min",-1,"max",1))
        .withWidget(BuiltInWidgets.kNumberBar);

        final NetworkTableEntry AcellEntry = dataTab.add("Acceleromitor ", vRobotVar.accval) // reads and displays driver controller button A status
        .withPosition(2, 4)
        .withSize(2, 2)
        .withWidget(BuiltInWidgets.k3AxisAccelerometer)
        .getEntry();
      
        
    }

    public  void Perodic(){

        
        // conditional statement to check of digital input is pressed 
        if(RobotHardware.ElevatorXInput.get() == true) {

            vRobotVar.Xaxis = true; // sets Xaxis to true if digital input is pressed 
        } 
        else{

            vRobotVar.Xaxis = false; // sets Xaxis to false if digital input is depressed 
        } 

        if(OI.DriverController.getXButton() == true){ //  sets accvar equle to acceleromiter yVal if the driver controler button is pressed

            vRobotVar.accval = vRobotVar.yVal; // sets accval equl to the acceleromitor yVal

            
        }
        else{
            vRobotVar.accval = vRobotVar.xVal; // sets accval equl to the acceleromitor xVal
        }

        OI.DriverController.setRumble(RumbleType.kLeftRumble,100); // rumbels controller for while in test mode
        
    }


}