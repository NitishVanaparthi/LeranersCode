package org.jnit.root;

import java.io.Serializable;

public class College implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ID;
	private String NAME;
	private String ADDRESS;

	private Principal Principal;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	@Override
	public String toString() {
		return "College [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + "]";

	}

	public static void setPrincipal(Principal p) {
	}

	public Principal getPrincipal() {
		return Principal;
	}

}
