import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean inp = false;
		
		Tv tele = new Tv(50,41);
		AC ac = new AC(21);
		HomeLights lights = new HomeLights();
		Scanner sc = new Scanner(System.in);
		RemoteControl remote;
				
		while(inp == false)
		{
			System.out.println("\n1 for TV,2 for AC,3 for HomeLights,4 to exit:");
			System.out.println("Enter your Choice");  
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					remote = new RemoteControl(tele);
					System.out.println("Tv On: "+remote.powerOnOff());
					System.out.println("Channel Up : "+remote.ToggleUp());
					System.out.println("Channel Down: "+remote.ToggleDown());
					System.out.println("Tv OFF: "+remote.powerOnOff());
				break;
				
				case 2:
					remote = new RemoteControl(ac);
					System.out.println("AC On: "+remote.powerOnOff());
					System.out.println("Temp Up : "+remote.ToggleUp());
					System.out.println("Temp Down: "+remote.ToggleDown());
					System.out.println("AC OFF: "+remote.powerOnOff());
				break;
				
				case 3:
					remote = new RemoteControl(lights);
					System.out.println("Lights On: "+remote.powerOnOff());
					System.out.println("Lights OFF: "+remote.powerOnOff());
					break;
					
				case 4:
					inp = true;
					System.out.println("Home Controller turned off");
					break;
					
				default:
					System.out.println("Wrong Choice");
					break;
			}
		}
	}

	
}
