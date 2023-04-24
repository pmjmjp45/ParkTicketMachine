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
			LanguageClass.INPUT_DAY_PRINT = "�湮�� ��¥�� ������\n����)20230413";
			LanguageClass.INPUT_BIRTH_PRINT = "�ֹε�Ϲ�ȣ 7�ڸ��� �Է��ϼ���\n����)9004052";
			LanguageClass.MENU_TITLE = "=====��� ����=====";
			LanguageClass.MENU_1 = "1. �ش� ����";
			LanguageClass.MENU_2 = "2. �����";
			LanguageClass.MENU_3 = "3. ���� ������";
			LanguageClass.MENU_4 = "4. ���ڳ�";
			LanguageClass.MENU_5 = "5. �ӻ��";
			LanguageClass.INPUT_NUMTICKET_PRINT = "���ż����� �Է��ϼ���";
			LanguageClass.INPUT_CONTINUEOREND_PRINT = "��� ���� : 1 / ���� : 0";
			LanguageClass.PRINT_ENDMSG = "�����մϴ�";
			LanguageClass.PRINT_ERROR = "�ٽ� �Է��� �ּ���.";
			LanguageClass.PRINT_ERROR_LIMIT = "������ �ο� ���� �ʰ�";
			LanguageClass.INFO_DAY_WEEKDAY = "���߱�";
			LanguageClass.INFO_DAY_WEEKEND = "�ָ���";
			LanguageClass.INFO_AGE_ADULT = "����/û�ҳ�";
			LanguageClass.INFO_AGE_CHILD = "���� / ���";
			LanguageClass.INFO_AGE_BABY = "3���̸�����";
			LanguageClass.INFO_OPTION_NONE = "��� ���� ����";
			LanguageClass.INFO_OPTION_HANDICAPPED = "����� ���";
			LanguageClass.INFO_OPTION_HONORABLE = "���� ������ ���";
			LanguageClass.INFO_OPTION_MULTICHILD = "���ڳ� ���";
			LanguageClass.INFO_OPTION_PREGNANCY = "�ӻ�� ���";
			LanguageClass.PRINT_TOTALNUMBER = "�� ���� ���� : ";
			LanguageClass.PRINT_TOTALPRICE = "�� ���� �ݾ� : ";
		}
	}
}
