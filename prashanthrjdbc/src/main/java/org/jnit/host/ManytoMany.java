package org.jnit.host;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jnit.root.Authors;
import org.jnit.root.Books;

public class ManytoMany {
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
				"Qwerty12369*");
		return conn;
	}

	public static Books getBookswithAuthors(int ID) {
		Books books = new Books();
		try {
			Connection conn = getConnection();
			List<Authors> Authors1 = new ArrayList<>();
			String query = " select b.BookTitle, a.AuthorFullName from javatraining.Books b join AuthorBook ab on b.BookID = ab.BookID join Authors a on a.AuthorID = ab.AuthID where a.AuthorID = ?;";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, ID);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				books.setBookTitle(rs.getString("BookTitle"));
				Authors authors = new Authors();
				authors.setAuthorFullName(rs.getString("AuthorFullName"));
				Authors1.add(authors);
				books.setAuthors(Authors1);
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;

	}

	public static void main(String[] args) {
		Books b = getBookswithAuthors(2);
		System.out.println(b.getBookTitle());
		System.out.println(b.getAuthors());
	}
}
