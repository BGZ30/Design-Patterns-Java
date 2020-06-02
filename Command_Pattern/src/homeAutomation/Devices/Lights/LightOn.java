package homeAutomation.Devices.Lights;

import homeAutomation.RemoteControl.Command;

public class LightOn implements Command {
	Lights light;

	public LightOn(Lights light) {
		this.light = light;
	}
	
	public void excute() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}

}
