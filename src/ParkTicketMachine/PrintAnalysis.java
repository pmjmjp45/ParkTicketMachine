package ParkTicketMachine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class PrintAnalysis {
	
	public void printAnalDate(LinkedHashMap<String, Integer> mapDate) {
		System.out.println("=============" + LanguageClass.PRINT_ANAL_DATE + "=============");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		ArrayList<String> sorting = new ArrayList<>(mapDate.keySet());
		Collections.sort(sorting);
		for(String key : sorting) {
			try {
				System.out.println(sdf2.format(sdf1.parse(key)) + " : " + LanguageClass.PRINT_ANAL_TOTAL_SALES + " - " + ConstClass.decimalFormat.format(mapDate.get(key)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("============================================");
	}
	
	public void printAnalDayType(LinkedHashMap<String, Integer> mapWeekday, int totalWeekday, LinkedHashMap<String, Integer> mapWeekend, int totalWeekend) {
		System.out.println("=============" + LanguageClass.PRINT_ANAL_DAYTYPE+ "=============");
		System.out.println("**" + LanguageClass.INFO_DAY_WEEKDAY + "**");
		for(String key : mapWeekday.keySet()) {
			System.out.println(key + mapWeekday.get(key));
		}
		System.out.println(LanguageClass.PRINT_TOTALNUMBER + totalWeekday);
		System.out.println("**" + LanguageClass.INFO_DAY_WEEKEND + "**");
		for(String key : mapWeekend.keySet()) {
			System.out.println(key + ConstClass.decimalFormat.format(mapWeekend.get(key)));
		}
		System.out.println(LanguageClass.PRINT_TOTALNUMBER + totalWeekend);
		System.out.println("============================================");
	}
	
	public void printAnalOption(LinkedHashMap<String, Integer> mapOption) {
		int totalTicket = 0;
		System.out.println("=============" + LanguageClass.PRINT_ANAL_OPTION + "=============");
		
		for(String key : mapOption.keySet()) {
			System.out.println(key + " : " + mapOption.get(key));
			totalTicket += mapOption.get(key);
		}
		System.out.println(LanguageClass.PRINT_TOTALNUMBER + totalTicket);
		System.out.println("============================================");
	}
}
