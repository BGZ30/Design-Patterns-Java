/*
 * 	a remote control with only two buttons, and corresponding slot to hold one device to control.
 *  Here it controls the lights
*/

package homeAutomation.RemoteControl;

public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.excute();
	}
	
	public void undoPressed() {
		slot.undo();
	}

}
