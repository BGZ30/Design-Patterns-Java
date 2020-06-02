package homeAutomation.Devices.CeilingFan;

import homeAutomation.RemoteControl.Command;

public class CeilingFanOff implements Command{

	CeilingFan fan;
	String mode;
	
	public CeilingFanOff(CeilingFan fan, String mode) {
		this.fan = fan;
		this.mode = mode;
	}
	
	public void excute() {
		fan.off();
	}
	
	public void undo() {
		// nothing for now
	}

}

