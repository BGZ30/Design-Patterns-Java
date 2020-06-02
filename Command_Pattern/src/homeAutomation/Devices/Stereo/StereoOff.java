package homeAutomation.Devices.Stereo;
import homeAutomation.RemoteControl.Command;


public class StereoOff implements Command{
	Stereo stereo;
	
	public StereoOff(Stereo stereo){
		this.stereo = stereo;
	}
	
	public void excute() {
		stereo.off();
	}
	
	public void undo() {
		// nothing now
	}
}
