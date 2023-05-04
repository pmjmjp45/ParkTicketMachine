package ParkTicketMachine;

import java.util.ArrayList;

public class PrintClass {
	
	public void printInfo(ArrayList<InfoClass> infoArray) {
		int sumTicketPrice = 0;
		int sumTicketNum = 0;
		
		System.out.println("===================================================================");
		for (int i = 0; i < infoArray.size(); i++) {
			System.out.printf("%s   %s%9s%s%5s%d%21s\n", infoArray.get(i).getDayIndex_info(), infoArray.get(i).getAgeIndex_info(),
					 ConstClass.decimalFormat.format(infoArray.get(i).getTicketPrice_info()), "won", "X", infoArray.get(i).getNumTicket_info(), infoArray.get(i).getOption_info());
			sumTicketPrice += (infoArray.get(i).getNumTicket_info() * infoArray.get(i).getTicketPrice_info()); 
			sumTicketNum += infoArray.get(i).getNumTicket_info();
		}
		System.out.printf("%s%d\n", LanguageClass.PRINT_TOTALNUMBER, sumTicketNum);
		System.out.printf("%s%swon\n", LanguageClass.PRINT_TOTALPRICE, ConstClass.decimalFormat.format(sumTicketPrice));
		System.out.println("===================================================================");

	}
	public void print_langSelect() {
		System.out.println("Language Select\n0: English / 1: Korean");
	}

	public void print_inputMode() {
		System.out.println(LanguageClass.INPUT_MODE_PRINT);
	}
	public void print_inputDay() {
		System.out.println(LanguageClass.INPUT_DAY_PRINT);
	}
	
	public void print_inputBirth() {
		System.out.println(LanguageClass.INPUT_BIRTH_PRINT);
	}
	
	public void print_option() {
		System.out.println(LanguageClass.MENU_TITLE);
		System.out.println(LanguageClass.MENU_1);
		System.out.println(LanguageClass.MENU_2);
		System.out.println(LanguageClass.MENU_3);
		System.out.println(LanguageClass.MENU_4);
		System.out.println(LanguageClass.MENU_5);
	}
	
	public void print_numTicket() {
		System.out.println(LanguageClass.INPUT_NUMTICKET_PRINT);
	}
	
	public void print_continueOrEnd() {
		System.out.println(LanguageClass.INPUT_CONTINUEOREND_PRINT);
	}
	
	public void print_end() {
		System.out.println(LanguageClass.PRINT_ENDMSG);
	}
	
	public void print_selectAnal() {
		System.out.println(LanguageClass.INPUT_ANAL_MENU);
		System.out.println(LanguageClass.INPUT_ANAL_DATE);
		System.out.println(LanguageClass.INPUT_ANAL_DAYTYPE);
		System.out.println(LanguageClass.INPUT_ANAL_OPTION);
		System.out.println(LanguageClass.INPUT_ANAL_END);
	}
	
	public void printError() {
		System.out.println(LanguageClass.PRINT_ERROR);
	}
	
	public void printError_Limit() {
		System.out.println(LanguageClass.PRINT_ERROR_LIMIT);
	}
}
