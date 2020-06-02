package homeAutomation.Devices.TV;

import homeAutomation.RemoteControl.Command;

public class TVOff implements Command{

	TV tv;
	
	public TVOff(TV tv) {
		this.tv = tv;
	}
	
	public void excute() {
		tv.off();
	}
	
	public void undo() {
		// nothing now
	}

}