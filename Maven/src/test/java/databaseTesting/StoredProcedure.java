package databaseTesting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedure {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String username="";
		String pass="";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=myDb;integratedSecurity=true";
		Connection con=DriverManager.getConnection(url, username, pass);
		CallableStatement cst=con.prepareCall("{call SelectWorkerSalary(?)}");
		cst.setInt(1, 3);
	//	cst.registerOutParameter(2, Types.INTEGER);
		ResultSet rs= cst.executeQuery();
		while(rs.next())//,rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6)  -%s-%s-%d-%s-%s 
		System.out.println(String.format("%d", rs.getInt(1)));
		con.close();

	}

}
