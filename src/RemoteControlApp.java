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
				case "2":
					pressButton();
					enterNumber();
					break;
				case "3":
					pressButton();
					enterNumber();
					break;
				case "4":
					pressButton();
					enterNumber();
					break;
				case "5":
					pressButton();
					enterNumber();
					break;
				case "6":
					pressButton();
					enterNumber();
					break;
				case "7":
					pressButton();
					enterNumber();
					break;
				case "8":
					pressButton();
					enterNumber();
					break;
				case "9":
					pressButton();
					enterNumber();
					break;
				case "off":
				case "Off":
				case "OFF":
					turnOff();
					break;
				default:
					System.out.println("Command Not Recognized! ");
					enterNumber();
					break;
			}
		} while (!num.equalsIgnoreCase("off"));
		
		keyboard.close();
		
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
	public static void turnOff() {
		System.out.println("Turning Off...");
	}

}

// TODO add pressButton() method
// TODO add turnOn() method
