package ParkTicketMachine;

import java.util.ArrayList;

public class PrintClass {
	
	public void printInfo(ArrayList<InfoClass> infoArray) {
		int sumTicketPrice = 0;
		
		System.out.println("===================================================================");
		for (int i = 0; i < infoArray.size(); i++) {
			System.out.printf("%s   %s   %8dwon%5s%d   %s\n", infoArray.get(i).getDayIndex_info(), infoArray.get(i).getAgeIndex_info(),
					infoArray.get(i).getTicketPrice_info(), "X", infoArray.get(i).getNumTicket_info(), infoArray.get(i).getOption_info());
			sumTicketPrice += (infoArray.get(i).getNumTicket_info() * infoArray.get(i).getTicketPrice_info()); 
		}
		System.out.printf("Total price : %d\n", sumTicketPrice);
		System.out.println("===================================================================");

	}

	public void print_inputDay() {
		System.out.println("Enter the date you visit\nex)20230413");
	}
	
	public void print_inputBirth() {
		System.out.println("Enter the 7 digits of your social number\nex)9004052");
	}
	
	public void print_option() {
		System.out.println("=====Discout Option=====");
		System.out.println("1. no discount");
		System.out.println("2. Handicapped discount");
		System.out.println("3. Honorable act");
		System.out.println("4. Multichild discount");
		System.out.println("5. Pregnancy discount");
	}
	
	public void print_numTicket() {
		System.out.println("How many ticket do you want?");
	}
	
	public void print_continueOrEnd() {
		System.out.println("Continue : 1 / End : 0");
	}
	
	public void print_end() {
		System.out.println("Thank you");
	}
	
	public void printError() {
		System.out.println("error! Please enter again");
	}
	
	public void printError_Limit() {
		System.out.println("error! Please check the limitation on the discount option");
	}
}
