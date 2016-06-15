package org.jnit.host;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class StoredProcedure {
	public static void UsingStoredProc() {

		try {
			java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
					"Qwerty12369*");
			String query = "call fetchBooks()";
			java.sql.CallableStatement cst = conn.prepareCall(query);
			java.sql.ResultSet rs = cst.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("BookID"));
				System.out.println(rs.getString("BookTitle"));
			}
			rs.close();
			cst.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UsingStoredProc();
	}

}
