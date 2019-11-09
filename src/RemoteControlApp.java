import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		String num = "";
		
		do {
			initialMessage();
			choice = keyboard.next();
			

		} while (!choice.equalsIgnoreCase("on"));
		turnOn();
		enterNumber();
	
		
		
		do {
			num = keyboard.next();
			switch(num) {
				case "0":
					pressButton();
					enterNumber();
					break;
				case "1":
					pressButton();
					enterNumber();
					break;
			}
		} while (!num.equalsIgnoreCase("10"));
		
		
		}

	public static void initialMessage() {
		System.out.println("To begin, turn on the remote control.");
	}

	public static void turnOn() {
		System.out.println("Turning On...");
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}
	public static void enterNumber() {
		System.out.println("Please enter a button number: ");
		
	}

}

// TODO add pressButton() method
// TODO add turnOn() method
