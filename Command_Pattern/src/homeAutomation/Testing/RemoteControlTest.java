package homeAutomation.Testing;

import homeAutomation.Devices.Lights.*;
import homeAutomation.Devices.Stereo.*;
import homeAutomation.Devices.CeilingFan.*;
import homeAutomation.Devices.TV.*;
import homeAutomation.RemoteControl.*;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new RemoteControl(); 
		
		// Create the devices
		Lights livingRoomLights = new Lights("Living room");
		Lights kitchenLights = new Lights("Kitchen");
		Lights BedRoomLights = new Lights("Bed room");
		
		Stereo stereo = new Stereo();
		
		CeilingFan livingRoomFan = new CeilingFan("Living room");
		CeilingFan bedRoomFan = new CeilingFan("Bed room");
		
		TV tv = new TV();
		
		
		// Create the command list for the living room lights
		LightOn livingRoomLightsOn = new LightOn(livingRoomLights);
		LightOff livingRoomLightsOff = new LightOff(livingRoomLights);
		
		// Create the command list for the kitchen lights
		LightOn kitchenLightsOn = new LightOn(kitchenLights);
		LightOff kitchenLightsOff = new LightOff(kitchenLights);
		
		// Create the command list for the bedroom lights
		LightOn bedRoomLightsOn = new LightOn(BedRoomLights);
		LightOff bedRoomLightsOff = new LightOff(BedRoomLights);
		
		// Create the command list for the stereo
		StereoOnCD stereoOnCD = new StereoOnCD(stereo);
		StereoOff stereoOff = new StereoOff(stereo);
		
		// Create command list for the living room Ceiling fan
		CeilingFanOn livingRoomFanOnL = new CeilingFanOn(livingRoomFan, "low");
		CeilingFanOn livingRoomFanOnM = new CeilingFanOn(livingRoomFan, "medium");
		CeilingFanOn livingRoomFanOnH = new CeilingFanOn(livingRoomFan, "high");
		CeilingFanOff livingRoomFanOff = new CeilingFanOff(livingRoomFan);

		// Create command list for the bed room Ceiling fan
		CeilingFanOn bedRoomFanOnL = new CeilingFanOn(bedRoomFan, "low");
		CeilingFanOn bedRoomFanOnM = new CeilingFanOn(bedRoomFan, "medium");
		CeilingFanOn bedRoomFanOnH = new CeilingFanOn(bedRoomFan, "high");
		CeilingFanOff bedRoomFanOff = new CeilingFanOff(bedRoomFan);
		
		// setting the commands (slots in the remote)
		remote.setCommand(0, livingRoomLightsOn, livingRoomLightsOff);
		remote.setCommand(1, bedRoomLightsOn, bedRoomLightsOff);
		remote.setCommand(2, kitchenLightsOn, kitchenLightsOff);
		remote.setCommand(3, stereoOnCD, stereoOff);
		remote.setCommand(4, livingRoomFanOnL, livingRoomFanOff);
		remote.setCommand(5, livingRoomFanOnM, livingRoomFanOff);
		remote.setCommand(6, livingRoomFanOnH, livingRoomFanOff);
		remote.setCommand(7, bedRoomFanOnL, bedRoomFanOff);
		remote.setCommand(8, bedRoomFanOnM, bedRoomFanOff);
		remote.setCommand(9, bedRoomFanOnH, bedRoomFanOff);
		
		
		// use toString() method to print each remote slot and the command that it is assigned to.
		System.out.println(remote);
		
		// press some buttons
		remote.onButtonWasPressed(0); // turn-on living room lights
		remote.offButtonWasPressed(1); // turn-off bed room lights
		remote.onButtonWasPressed(3); // turn-on stereo with cd
		remote.onButtonWasPressed(5); // turn-on fan in living room on medium speed
		remote.onButtonWasPressed(6); // turn-on fan in living room on high speed
		remote.offButtonWasPressed(6); // turn-off fan in living room
		remote.offButtonWasPressed(3); // turn-off stereo
		remote.offButtonWasPressed(0); // turn-off living room lights
		remote.onButtonWasPressed(8); // turn-on fan in bed room on medium speed
		
	}

}
