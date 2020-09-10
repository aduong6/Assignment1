import  java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		final String HEADER = "Wifi Diagnosis \n";
		final String PROGRAMMER_NAME = "Programmer: Alan Duong\n";	
		final String PROBLEM = "Did that fix the problem?\n";
		
		System.out.println(HEADER);
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First Step: Reboot the computer and try to connect.");
		System.out.println(PROBLEM);
		String a = userInput.nextLine();
			if(a.equals("yes")) {
				System.out.println("Rebooting your computer seemed to work\n");
			}else if(a.equals("no")){
				System.out.println("Second Step: Reboot your router.");
				System.out.println(PROBLEM);
				String b = userInput.nextLine();
				if(b.equals("yes")){
					System.out.println("Rebooting your router seemed to work\n");
				}else if(b.equals("no")){
					System.out.println("Third Step: Make sure the cables to your router are plugged in firmly and your router is getting power.");
					System.out.println(PROBLEM);
					String c = userInput.nextLine();
					if(c.equals("yes")){
						System.out.println("Checking the router's cables seemed to work\n");
					}else if(c.equals("no")) {
						System.out.println("Fourth Step: Move your computer closer to your router.");
						System.out.println(PROBLEM);
						String d = userInput.nextLine();
						if(d.equals("yes")) {
							System.out.println("Moving your computer closer to your router seemed to work\n");
						}else if(d.equals("no")) {
							System.out.println("Contact your ISP");
						}
					}
				}
			}
			System.out.println(PROGRAMMER_NAME);
			userInput.close();
	}
}
