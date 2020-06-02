package homeAutomation.Devices.Lights;

import homeAutomation.RemoteControl.Command;

public class LightOff implements Command {
	Lights light;

	public LightOff(Lights light) {
		this.light = light;
	}
	
	public void excute() {
		light.on();
	}
	
	public void undo() {
		light.on();
	}

}
