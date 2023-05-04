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
	private FileClass F = null;
	private SalesAnalysis S= null;
	private WriteDB DB = null;
	
	public Main() {
		P = new PrintClass();
		I = new InputClass();
		V = new VariableClass();
		X = new IndexClass();
		L = new LanguageClass();
		F = new FileClass();
		S = new SalesAnalysis();
		DB = new WriteDB();
	}
	
	public static void main(String[] args) {
		Main M = new Main();
		ArrayList<InfoClass> infolist = new ArrayList<>();
		// language select
		Locale currentlocale = Locale.getDefault();
		M.L.setLanguage(currentlocale.getCountry());
		System.out.println("your locale : " + currentlocale.getCountry());
		M.L.language();
		
		// mode select
		int mode = M.I.inputMode();
		///////////////ticket purchase
		if (mode == 1) { 
			// date
			M.V.setDate(M.I.inputDay());
			String date = M.V.getDate();
			int dayIndex = M.X.getDayIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay());

			do {
				// age
				M.V.setBirth(M.I.inputBirth());
				int ageIndex = M.X.getAgeIndex(M.V.getDateYear(), M.V.getDateMonth(), M.V.getDateDay()
						, M.V.getBirthYear(), M.V.getBirthMonth(), M.V.getBirthDay(), M.V.getGeneration());

				// option for discount
				int option = M.I.inputOption(ageIndex); 
				
				// ticket price
				int ticketPrice = M.X.getTicketPrice(option, ageIndex, dayIndex);
				
				// number of ticket
				int numTicket = M.I.inputNumTicket(option);
				
				// save ticket information
				M.info = new InfoClass(dayIndex, ageIndex, ticketPrice, numTicket, option);
				infolist.add(M.info);
				
				// print ticket information
				M.P.printInfo(infolist);
				
			} while (M.I.inputContinueOrEnd() == ConstClass.CONTINUE); // continue or end
			
			// write csv
			M.F.fileWrite(infolist, date);
			M.DB.writeToDB(infolist, date);
		} else {
		////////////// sales report
			int select;
			do {
				select = M.I.inputSelectAnal();
				M.S.getSalesAnalysis(select);
			} while (select != 0);
		}
		M.P.print_end(); // end message
		
	}

}
