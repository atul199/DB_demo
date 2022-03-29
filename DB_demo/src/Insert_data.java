

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Insert_data{
   public static void main(String[] args) throws Exception {
	 
	   
	   
	   
	  
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      final String url = "jdbc:mysql:///employee";
      final String user = "root";
      final String password = "root";
      Connection con = DriverManager.getConnection(url, user, password);


	String s = "insert into employee values(57,'RAM',40000,'INDORE')";
	PreparedStatement st = con.prepareStatement(s);
   
	st.execute();

//    System.out.println(resultSet);
       
    
//      if (con == null) {
//         System.out.println("JDBC connection is not established");
//         return;
//      } else
//         System.out.println("Congratulations," + 
//              " JDBC connection is established successfully.\n");
      con.close();
   } 
}