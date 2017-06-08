
public class AC implements ControlInterface{
	
	boolean power = false;
	int temp;
	
	public AC(int temp) {
		this.temp = temp;
	
	}
	
	@Override
	public boolean powerOnOff() {
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
		if (temp+1 == 35)
		{
			temp = 35;
			return temp;
		}
		else
			return ++temp;
		
	}

	public int ToggleDown() {
		if (temp-1 == 15)
		{
			temp = 15;
			return temp;
		}
		else
			return --temp;
		
	}
}
