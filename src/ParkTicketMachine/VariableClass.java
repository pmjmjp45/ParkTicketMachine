package ParkTicketMachine;

public class VariableClass {

	// date
	private String date;
	private int dateYear;
	private int dateMonth;
	private int dateDay;
	// social number
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private int generation;
	private int gender;
	
	private int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean setDate(String date) {
		boolean dayBool;	
        
		if (date.length() == 8) { // date validation
			int year = Integer.parseInt(date.substring(0, 4));
			int month = Integer.parseInt(date.substring(4, 6));
	        int day = Integer.parseInt(date.substring(6));
	        if ((year % 4 == 0 && year %100 != 0) || year % 400 == 0) { // leap year 
				months[1] = 29;	
			}
	        
			if ((month >=1 && month <= 12) // month validation
					&& (day >=1 && day <= months[month - 1])) { // day validation 
				dayBool = true;
				this.date = date;
				this.dateYear = year;
				this.dateMonth = month;
	            this.dateDay = day;
			} else dayBool = false;
		} else {
			dayBool = false;
		}
        return dayBool;
	}
	
	public boolean setBirth(String socialnum) { 
		boolean numBool;
		
		if (socialnum.length() == 7) { // social number validation
			int year = Integer.parseInt(socialnum.substring(0, 2));
			int month = Integer.parseInt(socialnum.substring(2, 4));
			int day = Integer.parseInt(socialnum.substring(4, 6));
			int gene = Integer.parseInt(socialnum.substring(6));
			if ((year % 4 == 0 && year %100 != 0) || year % 400 == 0) { // leap year 
				months[1] = 29;	
			}
			
			if ((month >= 1 && month <= 12) // month validation
					&& (day >=1 && day <= months[month - 1]) // day validation 
					&& (gene >= 1 && gene <= 4)) { // generation validation
				numBool = true;
				this.birthYear = year; 
	            this.birthMonth = month;
	            this.birthDay = day;
	            this.generation = gene;
	            if (gene == 1 || gene == 3) {
	            	this.gender = ConstClass.MALE;
	            } else {
	            	this.gender = ConstClass.FEMALE;
	            }
			} else numBool = false;
		} else {
			numBool = false;
		}
		return numBool;
	}
	
	public boolean setOption(int option, int ageIndex) {
		boolean optionBool;
		
		if (option >= 1 && option <= 5) {
			if (option == 5 && (ageIndex != 0 || gender != ConstClass.FEMALE)) { // pregnancy option validation
				optionBool = false;
			} else {
				optionBool = true;
			}
		} else {
			optionBool = false;
		}
		return optionBool;
	}
	
	public boolean setNumTicket(int inputNumTicket, int option) {
		boolean numTicketBool;
		
		if (inputNumTicket > 0) { // number limitations on Option
			if (option == ConstClass.HANDICAPPED&& inputNumTicket > ConstClass.HANDICAPPED_LIMIT) {
				numTicketBool = false;
			} else if (option == ConstClass.HONORABLE && inputNumTicket > ConstClass.HONORABLE_LIMIT) {
				numTicketBool = false;
			}
			else if (option == ConstClass.PREGNANT && inputNumTicket > ConstClass.PREGNANT_LIMIT) {
				numTicketBool = false;
			} else
				numTicketBool = true;
		} else
			numTicketBool = false;
		
		return numTicketBool;
	}

	public String getDate() {
		return date;
	}

	public int getDateYear() {
		return dateYear;
	}

	public int getDateMonth() {
		return dateMonth;
	}

	public int getDateDay() {
		return dateDay;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getGeneration() {
		return generation;
	}

}
