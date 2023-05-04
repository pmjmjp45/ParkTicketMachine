package ParkTicketMachine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SalesAnalysis {

	private static PrintAnalysis PA = null;
	private ArrayList<String> datas;

	public SalesAnalysis() {
		PA = new PrintAnalysis();
		
		File file = new File("C:\\Users\\kopo14\\Desktop\\sales.csv");
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(file));
		
		ArrayList<String> datas = new ArrayList<String>();
		String text;
		text = br.readLine();
		
		while ((text = br.readLine()) != null) {
			datas.add(text);
		}
		br.close();
		this.datas = datas;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getSalesAnalysis(int select) {
		if (select == 1) {
			analDate(datas);
		} else if (select == 2) {
			analDayType(datas);
		} else if (select == 3){
			analOption(datas);
		}
	}
	
	public static void analDate(ArrayList<String> datas) {
		
		LinkedHashMap<String, Integer> mapDate = new LinkedHashMap<>();
		
		for (String text : datas) {
	        String[] field = text.split(",");
				mapDate.put(field[0], mapDate.getOrDefault(field[0],0) + Integer.parseInt(field[4]));
			}
		PA.printAnalDate(mapDate);
		
	}
	
	public static void analDayType(ArrayList<String> datas) {
		
		LinkedHashMap<String, Integer> mapWeekday = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> mapWeekend = new LinkedHashMap<>();
		int totalWeekday = 0;
		int totalWeekend = 0;
		
		for (String text : datas) {
	        String[] field = text.split(",");
			if (field[1].equals(LanguageClass.INFO_DAY_WEEKDAY)) {
				mapWeekday.put(field[2], mapWeekday.getOrDefault(field[2],0) + Integer.parseInt(field[3]));
				totalWeekday += Integer.parseInt(field[3]);
			} else {
				mapWeekend.put(field[2], mapWeekend.getOrDefault(field[2],0) + Integer.parseInt(field[3]));
				totalWeekend += Integer.parseInt(field[3]);
			}
		}
		PA.printAnalDayType(mapWeekday, totalWeekday, mapWeekend, totalWeekend);
	}
	
public static void analOption(ArrayList<String> datas) {
		
		LinkedHashMap<String, Integer> mapOption = new LinkedHashMap<>();
		
		for (String text : datas) {
	        String[] field = text.split(",");
			if (field[5].equals(LanguageClass.INFO_OPTION_NONE)) {
				mapOption.put(field[5], mapOption.getOrDefault(field[5],0) + Integer.parseInt(field[3]));
			} else if (field[5].equals(LanguageClass.INFO_OPTION_HANDICAPPED)) {
				mapOption.put(field[5], mapOption.getOrDefault(field[5],0) + Integer.parseInt(field[3]));
			} else if (field[5].equals(LanguageClass.INFO_OPTION_HONORABLE)) {
				mapOption.put(field[5], mapOption.getOrDefault(field[5],0) + Integer.parseInt(field[3]));
			} else if (field[5].equals(LanguageClass.INFO_OPTION_MULTICHILD)) {
				mapOption.put(field[5], mapOption.getOrDefault(field[5],0) + Integer.parseInt(field[3]));
			} else {
				mapOption.put(field[5], mapOption.getOrDefault(field[5],0) + Integer.parseInt(field[3]));
			}
		}	
		PA.printAnalOption(mapOption);
	}
}
