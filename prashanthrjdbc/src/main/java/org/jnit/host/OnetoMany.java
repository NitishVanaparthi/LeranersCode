package org.jnit.host;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jnit.root.Address;
import org.jnit.root.User;

public class OnetoMany {
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root",
				"Qwerty12369*");
		return conn;
	}

	public static User getUserwithAddress(int id) {
		User user = new User();
		try {
			Connection conn = getConnection();
			List<Address> address1 = new ArrayList<>();
			String query = "select u.username,a.street_address_1,a.country from javatraining.user u join javatraining.address a on u.user_id=a.user_id where u.user_id=?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				user.setUsername(rs.getString("username"));
				Address address = new Address();
				address.setStreet_address_1(rs.getString("street_address_1"));
				address.setCountry(rs.getString("country"));
				address1.add(address);
				user.setAddress(address);
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	public static void main(String[] args) {
		User u = getUserwithAddress(2);
		System.out.println(u.getUsername());
		System.out.println(u.getAddress());

	}
}
