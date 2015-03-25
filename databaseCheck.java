package RegisterReseller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

public class databaseCheck {

	public void register(String domain_name, String db_url, String db_user,String db_userpw, int status){
		// test DB
		Connection conn = null;
		Statement stmt = null;
		try{
		//STEP 2: Register JDBC driver
	      Class.forName("oracle.jdbc.OracleDriver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(db_url,db_user,db_userpw);

	    //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "select domain_name, current_status from domain_name where domain_name='"+domain_name+"'";
	      ResultSet rs = stmt.executeQuery(sql);

	    //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         String domain = rs.getString("domain_name");
	         int status_id = rs.getInt("current_status");
	     
	         //Display values
	         System.out.println("domain name: " + domain);
	         System.out.println("current status: " + status_id);
	         if ( status == status_id){
		         System.out.println("domain is in Data Base!!");
	         }else{
		         System.out.println("domain is not in Data Base!!");
	         }
	      }
	      
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	}
}
