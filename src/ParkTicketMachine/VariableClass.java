package ParkTicketMachine;

public class VariableClass {

	// date
	private int dateYear;
	private int dateMonth;
	private int dateDay;
	// social number
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private int generation;
	
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
			} else numBool = false;
		} else {
			numBool = false;
		}
		return numBool;
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
