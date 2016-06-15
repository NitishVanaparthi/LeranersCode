package org.jnit.host;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jnit.root.College;

public class JdbcMain {
	public static void getCollegedata() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
					"Qwerty12369*");
			String query = "select * from College";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("ID"));
				System.out.println(rs.getString("NAME"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertCollege(College College) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
					"Qwerty12369*");
			String query = "insert into College(NAME,ADDRESS) values(?,? )";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, College.getNAME());
			pst.setString(2, College.getADDRESS());

			int noOfRowsEffected = pst.executeUpdate();
			System.out.println(noOfRowsEffected);
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		College college = new College();
		college.setNAME("UCM");
		college.setADDRESS("MISSOURI");
		insertCollege(college);
	}
}
