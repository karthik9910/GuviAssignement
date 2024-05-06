package com.Task5.sqlConnectivety;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlConnection {
	
	Connection conn;
	Statement stm;
	
	// Method for create a table 
	public void createQuery() throws SQLException {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kone", "root", "root");
			stm=conn.createStatement();
			String query="create table empdetail "+
			"(empcode varchar(10), "+
			"empname varchar(255), "+
			"empage varchar(10), "+
			"esalary varchar(20))";
			stm.executeUpdate(query);
//			if(executeUpdate>0) {
//				System.out.println("Successfully created table in DB");
//			} else {
//				System.out.println("Not created!! Please check");
//			}
		} catch (SQLException e) {
			System.out.print(e);
		}
	}
	
	// Method for insert a query 
	public void insertQuery() throws SQLException {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kone", "root", "root");
			stm=conn.createStatement();
			ArrayList<Integer> empcode=new ArrayList<Integer>();
			ArrayList<String> empname=new ArrayList<String>();
			ArrayList<Integer> empage=new ArrayList<Integer>();
			ArrayList<Integer> esalary=new ArrayList<Integer>();
			empcode.add(101);
			empcode.add(102);
			empcode.add(103);
			empcode.add(104);
			empcode.add(105);
			empname.add("Jenny");
			empname.add("Jacky");
			empname.add("Joe");
			empname.add("John");
			empname.add("Shameer");
			empage.add(25);
			empage.add(30);
			empage.add(20);
			empage.add(40);
			empage.add(25);
			esalary.add(10000);
			esalary.add(20000);
			esalary.add(40000);
			esalary.add(80000);
			esalary.add(90000);
			for(int i=0;i<5;i++) {
				int executeUpdate = stm.executeUpdate("insert into empdetail(empcode, empname, empage, esalary) values('"+empcode.get(i)+"','"+empname.get(i)+"','"+empage.get(i)+"','"+esalary.get(i)+"')");
				if(executeUpdate >0) {
					System.out.println("Successfully inserted row " + i + " in table");
				} else {
					System.out.println("Not inserted!! Please check");
				}
			}
		} catch (SQLException e) {
			System.out.print(e);
		}
		
		
	}
	
	// Method for select a query 
	public void selectQuery() throws SQLException {
		try { 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kone", "root", "root");
			stm=conn.createStatement();
			ResultSet rs= stm.executeQuery("select * from empdetail");
			System.out.println("empcode" + "        "+ "empname"+"       "+ "empage"+"        "+"esalary");
			while(rs.next()) {
				String empcode = rs.getString("empcode");
				String empname = rs.getString("esalary");
				String empage = rs.getString("empage");
				String esalary = rs.getString("esalary");
				System.out.println(empcode + "            "+ empname+"          "+ empage+"             "+esalary);
				
			}
		}  catch (SQLException e) {
			System.out.print(e);
		}
		
	}

}

