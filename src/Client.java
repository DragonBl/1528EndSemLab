import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv Tele = new Tv(50,41);
		AC ac = new AC(21);
		HomeLights lights = new HomeLights();
		Scanner sc = new Scanner(System.in);
		
		RemoteControl Rm1 = new RemoteControl(Tele);
		RemoteControl Rm2 = new RemoteControl(ac);
		RemoteControl Rm3 = new RemoteControl(lights);
		
		System.out.println("1 for TV,2 for AC,3 for HomeLights,4 to exit:");
		System.out.println("Enter your Choice");  
		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1:
				System.out.println("Tv On: "+Rm1.powerOnOff());
				System.out.println("Channel Up : "+Rm1.ToggleUp());
				System.out.println("Channel Down: "+Rm1.ToggleDown());
				System.out.println("Tv OFF: "+Rm1.powerOnOff());
			break;
			
			case 2:				
				System.out.println("AC On: "+Rm2.powerOnOff());
				System.out.println("Temp Up : "+Rm2.ToggleUp());
				System.out.println("Temp Down: "+Rm2.ToggleDown());
				System.out.println("AC OFF: "+Rm2.powerOnOff());
			break;
			
			case 3:
				System.out.println("Lights On: "+Rm3.powerOnOff());
				System.out.println("Lights OFF: "+Rm3.powerOnOff());
				break;
				
			case 4:
				break;
		}	
		
	}

	
}
