package org.jnit.root;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Authors implements Serializable {

	private static final long serialVersionUID = 1L;
	private int AuthorID;
	private String AuthorFullName;
	private String AuthorMiddleName;
	private String AuthorLastName;

	private List<Books> books = new ArrayList<>();

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}

	public String getAuthorFullName() {
		return AuthorFullName;
	}

	public void setAuthorFullName(String authorFullName) {
		AuthorFullName = authorFullName;
	}

	public String getAuthorMiddleName() {
		return AuthorMiddleName;
	}

	public void setAuthorMiddleName(String authorMiddleName) {
		AuthorMiddleName = authorMiddleName;
	}

	public String getAuthorLastName() {
		return AuthorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		AuthorLastName = authorLastName;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Authors [AuthorID=" + AuthorID + ", AuthorFullName=" + AuthorFullName + ", AuthorMiddleName="
				+ AuthorMiddleName + ", AuthorLastName=" + AuthorLastName + ", books=" + books + "]";
	}

	{

	}

}
