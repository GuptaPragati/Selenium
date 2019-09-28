package databaseTesting;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import microsoft.sql.DateTimeOffset;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String username="";
		String pass="";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=myDb;integratedSecurity=true";
		Connection con=DriverManager.getConnection(url, username, pass);
		Statement smt=con.createStatement();
		/*
		 * Scanner sc = new Scanner( System.in ); System.out.print("Enter numbers: ");
		 * String input = sc.nextLine(); String[] num=input.split(","); for ( int i = 0;
		 * i < num.length; i++ ) { System.out.println(num[i]); }
		 */
		 Scanner sc = new Scanner( System.in );
		List<Object> l=new ArrayList<>();
		System.out.print("Enter the values: ");
		while (sc.hasNext()) {
			
		l.add(sc);
	        if (sc.hasNextInt())
	            System.out.println(sc.nextInt());
	        else 
	            sc.next();
		}
		/*
		 * smt.executeUpdate("CREATE TABLE Title (\r\n" + "	WORKER_REF_ID INT,\r\n" +
		 * "	WORKER_TITLE VARCHAR(25),\r\n" + "	AFFECTED_FROM DATETIME,\r\n" +
		 * "	FOREIGN KEY (WORKER_REF_ID)\r\n" +
		 * "		REFERENCES Worker(WORKER_ID))");
		 */
		/*
		 * boolean flag=true; while(flag=true) { Scanner sc=new Scanner(System.in);
		 * System.out.println("enter the  datetime: "); System.out.println(); String
		 * dateTime=sc.nextLine();
		 * System.out.println("enter the Bonus WORKER_REF_ID: "); System.out.println();
		 * int id=sc.nextInt(); System.out.println("enter the Bonus WORKER_TITLE: ");
		 * System.out.println(); String pos=sc.nextLine();
		 * smt.executeUpdate(String.format("Insert into Title values(%d,%s,%d)",id,pos,
		 * dateTime)); System.out.println("Do you want to add one more record(Y/N): ");
		 * String option=sc.next(); if(option.equalsIgnoreCase("Y")) { continue; } else
		 * { flag=false; break; } }
		 */	}

}
