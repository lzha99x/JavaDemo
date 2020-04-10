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
		// ��װ��command
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		// ���ݷ�װ���command
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}

}
