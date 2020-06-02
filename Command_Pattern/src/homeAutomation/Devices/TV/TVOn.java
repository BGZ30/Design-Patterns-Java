package homeAutomation.Devices.TV;

import homeAutomation.RemoteControl.Command;

public class TVOn implements Command{

	TV tv;
	
	public TVOn(TV tv) {
		this.tv = tv;
	}
	
	public void excute() {
		tv.on();
	}
	
	public void undo() {
		// nothing now
	}

}
