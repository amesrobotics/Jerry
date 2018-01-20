package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;

public class InputManager {
	
	Joystick stickInput = new Joystick(0);
	Double[] stickData = new Double[2];
	
	Double[] getMoveInput() {
		
		stickData[0] = stickInput.getRawAxis(1);
		stickData[1] = stickInput.getRawAxis(3);
		
		return stickData;
	}	
}
