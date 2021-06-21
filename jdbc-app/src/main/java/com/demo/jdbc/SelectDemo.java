package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		String Select_SQL = "select empno,name,salary,address,dno from myemp where empno=?";
		try {

			// Load the driver
			 Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empdb", "root", "root");

			pst = conn.prepareStatement(Select_SQL);
			pst.setInt(1, 102);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("EMPNO");
				String name = rs.getString("NAME");
				String city = rs.getString("ADDRESS");
				double salary = rs.getDouble("SALARY");
				System.out.println(id + " " + name + " " + city + " " + salary);
			}

		} catch (SQLException ex) {
			System.out.println("Exception : " + ex);
			ex.printStackTrace();
		} catch (Exception e) {
			System.out.println("Driver could not be Found..");

		}

		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
