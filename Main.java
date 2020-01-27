package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");

		Statement stat = conn.createStatement();
		ResultSet result = stat.executeQuery("select * from products");
		while (result.next()) {
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " "
					+ result.getString(4));
		}
	}

}
