package homeAutomation.Devices.Lights;

public class Lights {

	public static final int OFF = 0;
	public static final int ON = 1;
	String location;
	int brightness;
		
	public Lights(String location) {
		this.location = location;
		brightness = OFF;
	}
	
	public void on() {
		brightness = ON;
	}
	
	public void off() {
		brightness = OFF;
	}
	
}
		