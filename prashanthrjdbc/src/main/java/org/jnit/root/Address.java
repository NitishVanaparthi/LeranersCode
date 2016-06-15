package org.jnit.root;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	private int address_id;
	private String street_address_1;
	private String street_address_2;
	private String zip_code;
	private String country;
	private int user_id;

	public User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getStreet_address_1() {
		return street_address_1;
	}

	public void setStreet_address_1(String street_address_1) {
		this.street_address_1 = street_address_1;
	}

	public String getStreet_address_2() {
		return street_address_2;
	}

	public void setStreet_address_2(String street_address_2) {
		this.street_address_2 = street_address_2;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", street_address_1=" + street_address_1 + ", street_address_2="
				+ street_address_2 + ", zip_code=" + zip_code + ", country=" + country + ", user_id=" + user_id
				+ ", user=" + user + "]";
	}

}
