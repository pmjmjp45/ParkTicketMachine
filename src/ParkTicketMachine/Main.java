package ParkTicketMachine;
//// Font: MS Gothic
import java.util.ArrayList;
import java.util.Locale;

public class Main {

	private PrintClass P = null;
	private InputClass I = null;
	private VariableClass V = null;
	private IndexClass X = null;
	private InfoClass info = null;
	private LanguageClass L = null;
	
	public Main() {
		P = new PrintClass();
		I = new InputClass();
		V = new VariableClass();
		X = new IndexClass();
		L = new LanguageClass();

	}
	public static void main(String[] args) {
		Main M = new Main();
		ArrayList<InfoClass> infolist = new ArrayList<>();
		// language select
		Locale currentlocale = Locale.getDefault();
		M.L.setLanguage(currentlocale.getCountry());
		System.out.println("your locale : " + currentlocale.getCountry());
		M.L.language();
		
		// date
		M.V.setDate(M.I.inputDay());
		int dayIndex = M.X.getDayIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay());
		
		do {
			// age
			M.V.setBirth(M.I.inputBirth());
			int ageIndex = M.X.getAgeIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay()
					, M.V.getBirthYear(), M.V.getBirthMonth(), M.V.getBirthDay(), M.V.getGeneration());
			
			// option for discount
			//M.V.setOption(M.I.inputOption(ageIndex), ageIndex)
			int option = M.I.inputOption(ageIndex); 
			
			// ticket price
			int ticketPrice = M.X.getTicketPrice(option, ageIndex, dayIndex);
			
			// number of ticket
//			M.V.setNumTicket(M.I.inputNumTicket(option), option);
//			int numTicket = M.V.getNumTicket();
			int numTicket = M.I.inputNumTicket(option);
			
			// save ticket information
			M.info = new InfoClass(dayIndex, ageIndex, ticketPrice, numTicket, option);
			infolist.add(M.info);
			
			// print ticket information
			M.P.printInfo(infolist);

		} while (M.I.inputContinueOrEnd() == ConstClass.CONTINUE); // continue or end
		
		M.P.print_end(); // end message
	}

}
