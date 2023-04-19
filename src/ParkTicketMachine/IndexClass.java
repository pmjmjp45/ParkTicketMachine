package ParkTicketMachine;

public class IndexClass {
		
	int getDayIndex(int dateYear, int dateMonth, int dateDay) { // weekday - weekend 
		int countDays = 0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		if ((dateYear % 4 == 0 && dateYear %100 != 0) || dateYear % 400 == 0) { // leap year 
				months[1] = 29;	
			}	
			for (int i = 1900; i < dateYear; i++) {
				if ((i % 4 == 0 && i %100 != 0) || i % 400 == 0) {
					countDays += 366;
				} else {
					countDays += 365;
				}
			}
			for (int i = 0; i < dateMonth - 1; i++) {
				countDays += months[i];
			} 	 
			countDays += dateDay;
			
			if (countDays % 7 == ConstClass.SATURDAY || countDays % 7 == ConstClass.SUNDAY) { 
				return 1; // weekend index 1    
			} else {
				return 0; // weekday index 0 
			}
	}

	int getAgeIndex(int dateYear, int dateMonth, int dateDay, 
			int birthYear, int birthMonth, int birthDay, int generation) { // age
		
		int age = 0;
		
		if (generation == ConstClass.MALE_BEFORE || generation == ConstClass.FEMALE_BEFORE) {
	        birthYear += 1900;
	    }
	    else if (generation == ConstClass.MALE_AFTER || generation == ConstClass.FEMALE_AFTER) {
	        birthYear += 2000;
	    }

	    age = dateYear - birthYear;
	    
	    if (birthMonth > dateMonth || (birthMonth == dateMonth && birthDay > dateDay)) {
	        age--;
	    }
	    
	   	if (age > ConstClass.CHILD && age < ConstClass.ELDERLY) {
			return 0; // adult index 0 
		} else if ((age >= ConstClass.BABY && age <= ConstClass.CHILD) || age >= ConstClass.ELDERLY) {
			return 1; // child index 1 
		} else {
			return -1; // under 3
		}
 
	}
	
	int getTicketPrice(int option, int ageIndex, int dayIndex) { // ticket price 
		int ticketPrice = 0;
		
		if (ageIndex == -1) {
			ticketPrice = 0;
		} else {
			switch (option) {
			case 1: 
				ticketPrice = ConstClass.STANDARD_TICKET[ageIndex][dayIndex];
				break;
			case 2: 
				ticketPrice = ConstClass.HANDICAPPED_TICKET[ageIndex][dayIndex];
				break;	
			case 3: 
				ticketPrice = ConstClass.HONORABLE_TICKET[ageIndex][dayIndex];
				break;
			case 4: 
				ticketPrice = ConstClass.MULTICHILD_TICKET[ageIndex][dayIndex];
				break;
			case 5:
				ticketPrice = ConstClass.PREGNANT_TICKET[dayIndex];	
				break;			
			}	
		}
		return ticketPrice;
	}
	
}
