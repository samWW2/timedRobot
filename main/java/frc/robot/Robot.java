

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.SerialPort.StopBits;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.simulation.*;


public class Robot extends TimedRobot {
 
  private final Spark leftMotor1 = new Spark(0);
  private final Spark leftMotor2 = new Spark(1);
  private final Spark rightMotor1 = new Spark(2);
  private final Spark rightMotor2 = new Spark(3);
  private Joystick joy1 = new Joystick(0);
  private double startTime;

  @Override
  public void robotInit() { 
    rightMotor1.setInverted(true);
    rightMotor2.setInverted(true);
    
  }
 
  @Override
  public void robotPeriodic() {
    
  }

  @Override
  public void autonomousInit() {
    startTime = Timer.getFPGATimestamp();
  }
  
  @Override
  public void autonomousPeriodic() {
    double time = Timer.getFPGATimestamp();
    if(time - startTime < 15){
      leftMotor1.set(0.5);
      leftMotor2.set(0.5);
      rightMotor1.set(0.5); 
      rightMotor1.set(0.5); 
    }
    else{
      leftMotor1.set(0);
      leftMotor2.set(0);
      rightMotor1.set(0); 
      rightMotor1.set(0); 
    }
   
  }
   
  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

    if(joy1.getRawAxis(1) == 1){
      leftMotor1.set(0.5);
      leftMotor2.set(0.5);
      rightMotor1.set(0.5); 
      rightMotor1.set(0.5); 
    }
    if(joy1.getRawAxis(-1) == 1){
      leftMotor1.set(-0.5);
      leftMotor2.set(-0.5);
      rightMotor1.set(-0.5); 
      rightMotor1.set(-0.5); 
    }
    if(joy1.getRawAxis(4) == 1){
      leftMotor1.set(0.5);
      leftMotor2.set(0.5);
      rightMotor1.set(-0.5); 
      rightMotor1.set(-0.5); 
    }
    if(joy1.getRawAxis(-4) == 1){
      leftMotor1.set(-0.5);
      leftMotor2.set(-0.5);
      rightMotor1.set(0.5); 
      rightMotor1.set(0.5); 
    }


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
  public void simulationInit() { System.out.println("is simulating");}

  @Override
  public void simulationPeriodic() {}
}
