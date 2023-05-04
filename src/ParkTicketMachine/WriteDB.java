package ParkTicketMachine;
import java.sql.*;
import java.util.ArrayList;

public class WriteDB {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";

    // MySQL 데이터베이스 계정 정보
    static final String USER = "root";
    static final String PASS = "123456";

    private Connection conn = null;
    private Statement stmt = null;
    
    WriteDB() {
    	try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }
    
    
    public void writeToDB(ArrayList<InfoClass> list, String date) {
   
      try {
		 for (InfoClass x : list) {
			 String data = date + "," + x.getDayIndex_info() + "," + x.getAgeIndex_info() 
			 + "," + x.getNumTicket_info() + "," + x.getTicketPrice_info() + "," + x.getOption_info();
			 String sql = "INSERT INTO orderlist VALUES ("+ data +")";
		
		 // SQL INSERT 문을 생성하고 실행합니다.
		 
		 stmt.executeUpdate(sql);	
		 }
		 System.out.println("데이터베이스에 새로운 레코드가 추가되었습니다.");	
	  } catch (Exception e) {
	  
	  }
    }
}