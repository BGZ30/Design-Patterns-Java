package homeAutomation.Devices.Stereo;
import homeAutomation.RemoteControl.Command;


public class StereoOnCD implements Command{
	Stereo stereo;
	
	public StereoOnCD(Stereo stereo){
		this.stereo = stereo;
	}
	
	public void excute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(10);
	}
	
	public void undo() {
		stereo.off();
	}
}
