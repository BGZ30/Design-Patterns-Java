package homeAutomation.Testing;
import homeAutomation.Devices.Lights.*;
import homeAutomation.RemoteControl.*;

public class SimpleRemoteTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Lights light = new Lights("Living room");
		LightOn lightOn = new LightOn(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.undoPressed();
	}
}
