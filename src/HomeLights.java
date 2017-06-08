
public class HomeLights implements ControlInterface{

	private boolean power = false;
	
	@Override
	public boolean powerOnOff() {
		// TODO Auto-generated method stub
		if (power == true)
		{
			power = false;
		}
		else if(power == false)
		{
			power = true;
		}
		return power;
	}

	@Override
	public int ToggleUp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ToggleDown() {
		// TODO Auto-generated method stub
		return 0;
	}

}
