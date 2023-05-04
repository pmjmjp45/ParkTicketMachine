package ParkTicketMachine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileClass {
	
	public void fileWrite(ArrayList<InfoClass> infolist, String date) {
		File file = new File("C:\\Users\\kopo14\\Desktop\\sales.csv");
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file, true));
		
		for (int i = 0; i < infolist.size(); i++) {
				bw.write(date + ",");
				bw.write(infolist.get(i).getDayIndex_info() + ",");
				bw.write(infolist.get(i).getAgeIndex_info() + ",");
				bw.write(infolist.get(i).getNumTicket_info() + ",");
				bw.write(infolist.get(i).getTicketPrice_info() + ",");
				bw.write(infolist.get(i).getOption_info() + "\n");
		}
		bw.flush();
		bw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
