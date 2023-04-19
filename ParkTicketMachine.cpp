#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

///////////Ticket Price
const int STANDARD_TICKET[2][2] = {{62000,68000}, {52000,58000}}; //Adult(weekday, weekend) ,child(weekday, weekend)
const int HANDICAPPED_TICKET[2][2] = {{37000,40000}, {31000,34000}}; // Handicapped - Adult(weekday, weekend) ,child(weekday, weekend)
const int HONORABLE_TICKET[2][2] = {{31000,34000}, {26000,29000}}; // Honorable - Adult(weekday, weekend) ,child(weekday, weekend)
const int MULTICHILD_TICKET[2][2] = {{49000,54000},{41000,46000}}; // Multichild - Adult(weekday, weekend) ,child(weekday, weekend)
const int PREGNANT_TICKET[] = {52000,57000}; // Pregnant(weekday, weekend) 

//////////weekday - weekend 
const int SATURDAY = 6, SUNDAY = 0;

////////// age standard
const int BABY = 3, CHILD = 12, ELDERLY = 65;


///////print for input 
void print_inputDay();
void print_age();
void print_option();
void print_numTicket();

/////// methods
void inputDay(int *year, int *month, int *day);
int dayIndex(int dateYear, int dateMonth, int dateDay);
int ageIndex(int dateYear, int dateMonth, int dateDay);
int option();
int ticketPrice(int option_return, int ageIndex_return, int dayIndex_return);
int numTicket();
void information(int count, int sumTicketPrice, int dayIndex_return, int ageIndex_return, int ticketPrice_return, int numTicket_return, int option_return);
int continueOrEnd();

int main()
{	
	int dateYear = 0, dateMonth = 0, dateDay = 0;
	int count = 0, sumTicketPrice = 0;
	int dayIndex_return = 0, ageIndex_return = 0, option_return = 0, ticketPrice_return = 0, numTicket_return = 0;
	
	inputDay(&dateYear, &dateMonth, &dateDay);
	
	do {
		ageIndex_return = ageIndex(dateYear, dateMonth, dateDay);  // age 
		option_return = option(); // option
		ticketPrice_return = ticketPrice(option_return, ageIndex_return, dayIndex_return); // ticket price 
		numTicket_return = numTicket(); // number of ticket 
		sumTicketPrice += (ticketPrice_return * numTicket_return); // total ticket price
		information(count, sumTicketPrice, dayIndex_return, ageIndex_return, ticketPrice_return, numTicket_return, option_return); // information
		count++;
	} while(continueOrEnd() == 1); 
	printf("Thank you\n");
	
	return 0;
}

void inputDay(int *year, int *month, int *day) { // day input
	print_inputDay();
	scanf("%4d%2d%2d", year, month, day);
}

int dayIndex(int dateYear, int dateMonth, int dateDay) { // weekday - weekend
	int countDays = 0;
	int months[12] = {31,28,31,30,31,30,31,31,30,31,30,31};

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
		
		if (countDays % 7 == SATURDAY || countDays % 7 == SUNDAY) { 
			return 1; // weekend index 1   
		} else {
			return 0; // weekday index 0 
		}
}

int ageIndex(int dateYear, int dateMonth, int dateDay) { // age
	int birthYear = 0, birthMonth = 0, birthDay = 0, generation = 0, age = 0;

	print_age();
	scanf("%2d%2d%2d%1d", &birthYear, &birthMonth, &birthDay, &generation);	  

	if (generation == 1 || generation == 2) {
        birthYear += 1900;
    }
    else if (generation == 3 || generation == 4) {
        birthYear += 2000;
    }

    age = dateYear - birthYear;
    
    if (birthMonth > dateMonth || (birthMonth == dateMonth && birthDay > dateDay)) {
        age--;
    }
    
   	if (age > CHILD && age < ELDERLY) {
		return 0; // adult index 0 
	} else if ((age >= BABY && age <= CHILD) || age >= ELDERLY) {
		return 1; // child index 1 
	} 
}

int option() { // option 
	int number = 0; 
		 
	print_option();
	
	scanf("%d", &number);
	
	return number; 
}

int ticketPrice(int option_return, int ageIndex_return, int dayIndex_return) {	// ticket price 
	int ticPrice = 0;
	
	switch (option_return) {
		case 1: 
			ticPrice = STANDARD_TICKET[ageIndex_return][dayIndex_return];
			break;
		case 2: 
			ticPrice = HANDICAPPED_TICKET[ageIndex_return][dayIndex_return];
			break;	
		case 3: 
			ticPrice = HONORABLE_TICKET[ageIndex_return][dayIndex_return];
			break;
		case 4: 
			ticPrice = MULTICHILD_TICKET[ageIndex_return][dayIndex_return];
			break;
		case 5:
			ticPrice = PREGNANT_TICKET[dayIndex_return];		
			break;			
	}	
	return ticPrice;
}

int numTicket() { // number of ticket 
	int numberTicket;

	print_numTicket();

	scanf("%d", &numberTicket);
	
	return numberTicket;
}

void information(int count, int sumTicketPrice, int dayIndex_return, int ageIndex_return, int ticketPrice_return, int numTicket_return, int option_return) {
	int ticketInformation[100][5]; // {dayIndex, ageIndex, ticketPrice, number of ticket, option} 
		
	ticketInformation[count][0] = dayIndex_return;
	ticketInformation[count][1] = ageIndex_return;			
	ticketInformation[count][2] = ticketPrice_return;
	ticketInformation[count][3] = numTicket_return;
	ticketInformation[count][4] = option_return;				
				
	printf("===========================EVERLAND===========================\n");
	
	for (int i = 0; i <= count; i++) {
		if (ticketInformation[i][0] == 0) {
			printf("weekday\t");
		} else {
			printf("weekend\t");
		}
		
		if (ticketInformation[i][1] == 0) {
			printf("adult/teenager\t");
		} else {
			printf("child / elders\t");
		}
		
		printf("%d\t", ticketInformation[i][2]);
		printf("%dÀå\t", ticketInformation[i][3]);
		
		if (ticketInformation[i][4] == 1) {
			printf("no discount\n");
		} else if (ticketInformation[i][4] == 2) {
			printf("Handicapped discount\n");
		} else if (ticketInformation[i][4] == 3) {
			printf("Honorable act\n");
		} else if (ticketInformation[i][4] == 4) {
			printf("Multichild discount\n");
		} else if (ticketInformation[i][4] == 5) {
			printf("Pregnancy discount\n");  
		}
	}
	printf("Total price : %d\n", sumTicketPrice); 
	printf("==============================================================\n");

} 
int continueOrEnd() {
	int answer = 0;
	printf("Continue : 1 / End : 0\n");
	scanf("%d", &answer);
	return answer;
}
void print_inputDay() {
	printf("Enter the date you visit\nex)20230413\n");
}  
void print_age() {
	printf("Enter the 7 digits of your social number\nex)9004052\n");
}
void print_option() {
	printf("=====Discout Option=====\n");
	printf("1. no discount\n");
	printf("2. Handicapped discount\n");
	printf("3. Honorable act\n");
	printf("4. Multichild discount\n");
	printf("5. Pregnancy discount\n");
}
void print_numTicket() {
	printf("How many ticket do you want?\n");
}

