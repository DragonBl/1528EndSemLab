
public class Tv implements ControlInterface {
	
		boolean power = false;
		int volume;
		int channel;
		
		public Tv(int volume, int channel) {
			
			this.volume = volume;
			this.channel = channel;
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
			if (channel+1 == 100)
			{
				channel = 0;
				return channel;
			}
			else
				return ++channel;
			
		}
		
		public int ToggleDown() {
			if (channel-1 == -1)
			{
				channel = 99;
				return channel;
			}
			else
				return --channel;
			
		}
}
