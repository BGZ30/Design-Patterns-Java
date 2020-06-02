package homeAutomation.Devices.TV;

public class TV {
	public static final int ON = 1;
	public static final int OFF = 0;
	int volume;
	int channel;
	
	public TV() {
		this.channel = OFF; 
		this.volume = OFF;  
	}
	
	public void on() {
		channel = ON;
		volume = ON; 
	}
	
	public void off() {
		channel = OFF;
		volume = OFF;
	}
	
	public void setchannel(int c) {
		channel = c;
	}	
	public void setVolume(int v) {
		volume = v;
	}

}
