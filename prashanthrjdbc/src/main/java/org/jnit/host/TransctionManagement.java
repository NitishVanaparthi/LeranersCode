package org.jnit.host;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransctionManagement {
	static Savepoint s = null;

	public static void insertintoBooks() {
		try {
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
					"Qwerty12369*");
			conn.setAutoCommit(false);
			String query = "insert into javatraining.college(ID,NAME,ADDRESS) values('11','UCM','Missouri')";
			String query1 = "insert into javatraining.college(ID,NAME,ADDRESS) values('22','UNT','Denton')";
			PreparedStatement pst = conn.prepareStatement(query);
			PreparedStatement pst1 = conn.prepareStatement(query1);
			pst.executeUpdate();
			s = conn.setSavepoint("save point");
			conn.commit();
			System.out.println("inserted values");
			pst1.executeUpdate();
			conn.rollback(s);
			pst1.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("roll back");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insertintoBooks();

	}

}
