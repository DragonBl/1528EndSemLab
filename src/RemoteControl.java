

public class RemoteControl implements ControlInterface {

	ControlInterface tv;
	public RemoteControl(ControlInterface tv) {
		super();
		this.tv = tv;
	}

	@Override
	public boolean powerOnOff() {
		return tv.powerOnOff();
		
	}

	@Override
	public int ToggleUp() {
		return tv.ToggleUp();
		
	}

	@Override
	public int ToggleDown() {
		return tv.ToggleDown();
	}


}
