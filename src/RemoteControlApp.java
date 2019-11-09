import java.util.Scanner;
public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		
		do {
			initialMessage();
			choice = keyboard.next();
			

		} while (!choice.equalsIgnoreCase("on"));
		
		
		
	
		}
	public static void initialMessage() {
		System.out.println("To begin, turn on the remote control.");
	}
	public static void turnOn() {
		System.out.println("Turning On...");
	}
		
		

	}

	
	// TODO add pressButton() method
	// TODO add turnOn() method
