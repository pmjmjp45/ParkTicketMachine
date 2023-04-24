package ParkTicketMachine;

public class LanguageClass {
	private static int LANGUAGE; 
	public static String INPUT_DAY_PRINT;
	public static String INPUT_BIRTH_PRINT;
	public static String MENU_TITLE;
	public static String MENU_1;
	public static String MENU_2;
	public static String MENU_3;
	public static String MENU_4;
	public static String MENU_5;
	public static String INPUT_NUMTICKET_PRINT;
	public static String INPUT_CONTINUEOREND_PRINT;
	public static String PRINT_ENDMSG;
	public static String PRINT_ERROR;
	public static String PRINT_ERROR_LIMIT;
	public static String PRINT_TOTALNUMBER;
	public static String PRINT_TOTALPRICE;
	public static String INFO_DAY_WEEKDAY;
	public static String INFO_DAY_WEEKEND;
	public static String INFO_AGE_ADULT;
	public static String INFO_AGE_CHILD;
	public static String INFO_AGE_BABY;
	public static String INFO_OPTION_NONE;
	public static String INFO_OPTION_HANDICAPPED;
	public static String INFO_OPTION_HONORABLE;
	public static String INFO_OPTION_MULTICHILD;
	public static String INFO_OPTION_PREGNANCY;

	
	public void setLanguage(int langSelect) {
		LanguageClass.LANGUAGE = langSelect;
	}
	
	public void language() {
		if (LANGUAGE == 0) {
			LanguageClass.INPUT_DAY_PRINT = "Enter the date you visit\nex)20230413";
			LanguageClass.INPUT_BIRTH_PRINT = "Enter the 7 digits of your social number\nex)9004052";
			LanguageClass.MENU_TITLE = "=====Discout Option=====";
			LanguageClass.MENU_1 = "1. no option";
			LanguageClass.MENU_2 = "2. Handicapped discount";
			LanguageClass.MENU_3 = "3. Honorable Act"; 
			LanguageClass.MENU_4 = "4. Multichild discount";
			LanguageClass.MENU_5 = "5. Pregnancy discount";
			LanguageClass.INPUT_NUMTICKET_PRINT = "How many ticket do you want?";
			LanguageClass.INPUT_CONTINUEOREND_PRINT = "Continue : 1 / End : 0";
			LanguageClass.PRINT_ENDMSG = "Thank you";
			LanguageClass.PRINT_ERROR = "error! Please enter again";
			LanguageClass.PRINT_ERROR_LIMIT = "error! Please check the limitation on the discount option";
			LanguageClass.INFO_DAY_WEEKDAY = "weekday";
			LanguageClass.INFO_DAY_WEEKEND = "weekend";
			LanguageClass.INFO_AGE_ADULT = "adult/teenager";
			LanguageClass.INFO_AGE_CHILD = "child / elders";
			LanguageClass.INFO_AGE_BABY = "baby  **free**";
			LanguageClass.INFO_OPTION_NONE = "no discount";
			LanguageClass.INFO_OPTION_HANDICAPPED = "Handicapped discount";
			LanguageClass.INFO_OPTION_HONORABLE = "Honorable act";
			LanguageClass.INFO_OPTION_MULTICHILD = "Mutichild discount";
			LanguageClass.INFO_OPTION_PREGNANCY = "Pregnancy discount";
			LanguageClass.PRINT_TOTALNUMBER = "Total Amount : ";
			LanguageClass.PRINT_TOTALPRICE = "Total Price : ";
			
		} else if (LANGUAGE == 1) {
			LanguageClass.INPUT_DAY_PRINT = "방문할 날짜를 고르세요\n예시)20230413";
			LanguageClass.INPUT_BIRTH_PRINT = "주민등록번호 7자리를 입력하세요\n예시)9004052";
			LanguageClass.MENU_TITLE = "=====우대 사항=====";
			LanguageClass.MENU_1 = "1. 해당 없음";
			LanguageClass.MENU_2 = "2. 장애인";
			LanguageClass.MENU_3 = "3. 국가 유공자";
			LanguageClass.MENU_4 = "4. 다자녀";
			LanguageClass.MENU_5 = "5. 임산부";
			LanguageClass.INPUT_NUMTICKET_PRINT = "구매수량을 입력하세요";
			LanguageClass.INPUT_CONTINUEOREND_PRINT = "계속 구매 : 1 / 종료 : 0";
			LanguageClass.PRINT_ENDMSG = "감사합니다";
			LanguageClass.PRINT_ERROR = "다시 입력해 주세요.";
			LanguageClass.PRINT_ERROR_LIMIT = "우대사항 인원 제한 초과";
			LanguageClass.INFO_DAY_WEEKDAY = "주중권";
			LanguageClass.INFO_DAY_WEEKEND = "주말권";
			LanguageClass.INFO_AGE_ADULT = "대인/청소년";
			LanguageClass.INFO_AGE_CHILD = "소인 / 경로";
			LanguageClass.INFO_AGE_BABY = "3세미만무료";
			LanguageClass.INFO_OPTION_NONE = "우대 사항 없음";
			LanguageClass.INFO_OPTION_HANDICAPPED = "장애인 우대";
			LanguageClass.INFO_OPTION_HONORABLE = "국가 유공자 우대";
			LanguageClass.INFO_OPTION_MULTICHILD = "다자녀 우대";
			LanguageClass.INFO_OPTION_PREGNANCY = "임산부 우대";
			LanguageClass.PRINT_TOTALNUMBER = "총 구매 수량 : ";
			LanguageClass.PRINT_TOTALPRICE = "총 결제 금액 : ";
		}
	}
}
