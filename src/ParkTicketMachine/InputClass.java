package ParkTicketMachine;

import java.util.Scanner;

public class InputClass {
	private PrintClass P = null;
	private VariableClass V = null;
	private Scanner scanner = null;
	
	public InputClass() {
		P = new PrintClass();
		V = new VariableClass();
		scanner = new Scanner(System.in);
	}
	
	public String inputDay() { // input day
		String date = "";
		while (true) {
			P.print_inputDay();
			date = scanner.next();
			if (V.setDate(date) == true) break;
			P.printError();
		}
		return date;	
	}
	
	public String inputBirth() { // input social number
		String number = "";
		while (true) {
			P.print_inputBirth();
			number = scanner.next();
			if (V.setBirth(number) == true) break;
			P.printError();	
		} 
		return number;
	}
	
	public int inputOption() { // input discount option
		int option = 0;
		while (true) {
			P.print_option();
			option = scanner.nextInt();
			if (option >= 1 && option <= 5) break;
			P.printError();
		}
		return option;
	}
	
	public int inputNumTicket() { // input number of ticket
		int numTicket = 0;
		while (true) {
			P.print_numTicket();
			numTicket = scanner.nextInt();
			if (numTicket >= 1) break;
			P.printError();
		}
		return numTicket;
	}
	
	public int inputContinueOrEnd() { // input continue or end
		int con = 0;
		while (true) {
			P.print_continueOrEnd();
			con = scanner.nextInt();
			if (con == 0 || con == 1) break;
			P.printError();
		}
		return con;
	}
}