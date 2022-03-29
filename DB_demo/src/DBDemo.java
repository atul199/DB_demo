


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBDemo {
   public static void main(String[] args) throws Exception {

     
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      final String url = "jdbc:mysql:///employee";
      final String user = "root";
      final String password = "root";
      Connection con = DriverManager.getConnection(url, user, password);

    
	Statement statement = con.createStatement();

   // Result set get the result of the SQL query
   ResultSet resultSet = statement.executeQuery("select * from employee;");
//   System.out.println(resultSet);
       while (resultSet.next()) {  
 
						int emp_id	= resultSet.getInt("id");
    	              String name = resultSet.getString("emp_name");
    	              int salary  = resultSet.getInt("salary");
    	              String city = resultSet.getString("city");
    	              
           System.out.println(emp_id+" "+name+" "+salary+" "+city);
        }
    
//      if (con == null) {
//         System.out.println("JDBC connection is not established");
//         return;
//      } else
//         System.out.println("Congratulations," + 
//              " JDBC connection is established successfully.\n");
      con.close();
   } 
}