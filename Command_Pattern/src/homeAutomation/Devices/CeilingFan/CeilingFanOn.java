package homeAutomation.Devices.CeilingFan;

import homeAutomation.RemoteControl.Command;

public class CeilingFanOn implements Command{
	
	CeilingFan fan;
	String mode;
	
	public CeilingFanOn(CeilingFan fan, String mode) {
		this.fan = fan;
		this.mode = mode;
	}

	public void excute() {
		if(mode.equalsIgnoreCase("Low"))
			fan.low();
		else if(mode.equalsIgnoreCase("Medium"))
			fan.medium();
		else if(mode.equalsIgnoreCase("High"))
			fan.high();
	}
	
	public void undo() {
		// nothing for now
	}
}
