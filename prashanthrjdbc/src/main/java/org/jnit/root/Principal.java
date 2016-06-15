package org.jnit.root;

import java.io.Serializable;

public class Principal implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ID;
	private String name;
	private int PhoneNo;

	private College College;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.PhoneNo = phoneNo;
	}

	public College getCollege() {
		return College;
	}

	public void setCollege(College college) {
		this.College = college;
	}

}
