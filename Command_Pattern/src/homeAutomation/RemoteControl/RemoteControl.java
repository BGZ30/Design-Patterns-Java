package homeAutomation.RemoteControl;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		
		onCommands = new Command[15]; // the remote have 15 slots i.e devices'actions
		offCommands = new Command[15];
		
		// Initialize all commands to noCommand
		Command noCommand = new NoCommand();
		for(int i=0; i<15; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	// reserve slots for commands (devices'actions)
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].excute();
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].excute();
	}
	
	
	// print slot name, commands and actions taken
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
			+ " " + offCommands[i].getClass().getName() + "\n");
			}
			
			return stringBuff.toString();
	}

}
