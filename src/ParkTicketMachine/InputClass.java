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
	
	public int inputMode() {
		int mode = 0;
		while (true) {
			P.print_inputMode();
			mode = scanner.nextInt();
			if (mode == 1 || mode == 2) break;
			P.printError();
		}
		return mode;
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
	
	public int inputOption(int ageIndex) { // input discount option
		int option = 0;
		while (true) {
			P.print_option();
			option = scanner.nextInt();
			if (V.setOption(option, ageIndex) == true) break;
			P.printError();
		}
		return option;
	}
	
	public int inputNumTicket(int option) { // input number of ticket
		int numTicket = 0;
		while (true) {
			P.print_numTicket();
			numTicket = scanner.nextInt();
			if (V.setNumTicket(numTicket, option) == true) break;
			P.printError_Limit();
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
	
	public int inputSelectAnal() {
		int select = 0;
		while(true) {
			P.print_selectAnal();
			select = scanner.nextInt();
			if (select >= 0 && select <= 3) break;
			P.printError();
		}
		return select;
	}
}
