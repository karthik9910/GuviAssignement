package com.Task5.Service.impl;

import java.sql.SQLException;

import com.Task5.sqlConnectivety.SqlConnection;

public class EmployeeDetails {
	public static void main(String[] args) throws SQLException {
		SqlConnection callQuery=new SqlConnection();
		System.out.println("Create a Table");
		callQuery.createQuery();
		System.out.println("\n");
		System.out.println("Insert value in the Table");
		callQuery.insertQuery();
		System.out.println("\n");
		System.out.println("List all value in the table");
		callQuery.selectQuery();
	}

}
