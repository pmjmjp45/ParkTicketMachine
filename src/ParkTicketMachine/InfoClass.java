package ParkTicketMachine;

public class InfoClass {

	private String dayIndex_info;  
	private String ageIndex_info; 
	private int ticketPrice_info; 
	private int numTicket_info; 
	private String option_info;	
	
	public InfoClass(int dayIndex, int ageIndex, int ticketPrice, int numTicket, int option) {
		this.dayIndex_info = Integer.toString(dayIndex);
		this.ageIndex_info = Integer.toString(ageIndex);
		this.ticketPrice_info = ticketPrice;
		this.numTicket_info = numTicket;
		this.option_info = Integer.toString(option);
	}

	public String getDayIndex_info() {
		if (dayIndex_info.equals("0")) {
			return LanguageClass.INFO_DAY_WEEKDAY;
		} else {
			return LanguageClass.INFO_DAY_WEEKEND;
		}
	}

	public String getAgeIndex_info() {
		if (ageIndex_info.equals("0")) {
			return LanguageClass.INFO_AGE_ADULT;
		} else if (ageIndex_info.equals("1")){
			return LanguageClass.INFO_AGE_CHILD;
		} else {
			return LanguageClass.INFO_AGE_BABY;
		}
	}

	public int getTicketPrice_info() {
		return ticketPrice_info;
	}


	public int getNumTicket_info() {
		return numTicket_info;
	}

	public String getOption_info() {
		if (option_info.equals("1")) {
			return LanguageClass.INFO_OPTION_NONE;
		} else if (option_info.equals("2")) {
			return LanguageClass.INFO_OPTION_HANDICAPPED;
		} else if (option_info.equals("3")) {
			return LanguageClass.INFO_OPTION_HONORABLE;
		} else if (option_info.equals("4")) {
			return LanguageClass.INFO_OPTION_MULTICHILD;
		} else {
			return LanguageClass.INFO_OPTION_PREGNANCY;  
		}
	}
}
