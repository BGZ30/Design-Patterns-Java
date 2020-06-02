package homeAutomation.Devices.CeilingFan;

import homeAutomation.RemoteControl.Command;

public class CeilingFanOff implements Command{

	CeilingFan fan;
	
	public CeilingFanOff(CeilingFan fan) {
		this.fan = fan;
	}
	
	public void excute() {
		fan.off();
	}
	
	public void undo() {
		// nothing for now
	}

}

