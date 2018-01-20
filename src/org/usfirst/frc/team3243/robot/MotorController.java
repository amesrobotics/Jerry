package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.VictorSP;

public class MotorController 
{
	WPI_TalonSRX driveM1 = new WPI_TalonSRX(0);
    WPI_TalonSRX driveM2 = new WPI_TalonSRX(1);
	VictorSP driveM3 = new VictorSP(0);
	VictorSP driveM4 = new VictorSP(1);
	
	public void drive(Double [] val) {
		driveM1.set(-val[0]);
		driveM2.set(val[1]);
		driveM3.set(-val[0]);
		driveM4.set(val[1]);
	}
}
