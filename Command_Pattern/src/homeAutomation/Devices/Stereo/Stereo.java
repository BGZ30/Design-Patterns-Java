package homeAutomation.Devices.Stereo;

public class Stereo {

	public static final int OFF = 0;
	int volume;
		
	public Stereo() {
		volume = OFF;
	}
	
	public void on() {

	}
	
	public void off() {
		volume = OFF;
	}
	
	public void setVolume(int v) {
		volume = v;
	}
	
	public void setCD() {
		
	}
	
	public void setDVD() {
		
	}
	
	public void setRadio() {
		
	}
}