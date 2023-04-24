package ParkTicketMachine;

import java.util.ArrayList;

public class Main {

	private PrintClass P = null;
	private InputClass I = null;
	private VariableClass V = null;
	private IndexClass X = null;
	private InfoClass info = null;
	
	public Main() {
		P = new PrintClass();
		I = new InputClass();
		V = new VariableClass();
		X = new IndexClass();

	}
	public static void main(String[] args) {
		Main M = new Main();
		ArrayList<InfoClass> infolist = new ArrayList<>();
		// date
		M.V.setDate(M.I.inputDay());
		int dayIndex = M.X.getDayIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay());
		
		do {
			// age
			M.V.setBirth(M.I.inputBirth());
			int ageIndex = M.X.getAgeIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay()
					, M.V.getBirthYear(), M.V.getBirthMonth(), M.V.getBirthDay(), M.V.getGeneration());
			
			// option for discount
			int option = M.I.inputOption(); 
			
			// ticket price
			int ticketPrice = M.X.getTicketPrice(option, ageIndex, dayIndex);
			
			// number of ticket
			M.V.setNumTicket(M.I.inputNumTicket(option), option);
			int numTicket = M.V.getNumTicket();
			
			// save ticket information
			M.info = new InfoClass(dayIndex, ageIndex, ticketPrice, numTicket, option);
			infolist.add(M.info);
			
			// print ticket information
			M.P.printInfo(infolist);

		} while (M.I.inputContinueOrEnd() == ConstClass.CONTINUE); // continue or end
		
		M.P.print_end(); // end message
	}

}
