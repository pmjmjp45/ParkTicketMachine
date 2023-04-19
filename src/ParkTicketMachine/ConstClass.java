package ParkTicketMachine;

public class ConstClass {
	///////////ticket price
	static final int STANDARD_TICKET[][] = {{62000,68000}, {52000,58000}};  //Adult(weekday, weekend) ,child(weekday, weekend)
	static final int HANDICAPPED_TICKET[][] = {{37000,40000}, {31000,34000}}; // Handicapped - Adult(weekday, weekend) ,child(weekday, weekend)
	static final int HONORABLE_TICKET[][] = {{31000,34000}, {26000,29000}}; // Honorable - Adult(weekday, weekend) ,child(weekday, weekend) 
	static final int MULTICHILD_TICKET[][] = {{49000,54000},{41000,46000}}; // Multichild - Adult(weekday, weekend) ,child(weekday, weekend)
	static final int PREGNANT_TICKET[] = {52000,57000}; // Pregnant(weekday, weekend)  
	
	//////////weekday - weekend  
	static final int SATURDAY = 6, SUNDAY = 0;
	
	////////// age standard 
	static final int BABY = 3, CHILD = 12, ELDERLY = 65;
	
	/////////social number standard
	static final int MALE_BEFORE = 1, FEMALE_BEFORE = 2, MALE_AFTER = 3, FEMALE_AFTER = 4;
	
	///////Continue or End
	static final int CONTINUE = 1;

}
