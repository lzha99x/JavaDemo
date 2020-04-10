package JavaPattern.Commad.simpleremote;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		// 封装成command
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		// 传递封装后的command
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}

}
