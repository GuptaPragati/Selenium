package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String username="";
		String pass="";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=myDb;integratedSecurity=true";
		Connection con=DriverManager.getConnection(url, username, pass);
		Statement smt=con.createStatement();
		ResultSet r=smt.executeQuery("select * from Worker");
		while(r.next())
		{
			System.out.println(r.getInt(1)+"..........."+r.getString(2)+".............."+r.getString(3)+"..............."+r.getInt(4)+"............."+r.getTimestamp("JOINING_DATE")+".............."+r.getString(6));
			System.out.println();
		}
		

	}

}
