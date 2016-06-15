package org.jnit.root;

import java.io.Serializable;

public class AuthorBooks implements Serializable {
	private static final long serialVersionUID = 1L;

	private int AuthID;
	private int BookID;
	private Books Books;
	private Authors Authors;

	public int getAuthID() {
		return AuthID;
	}

	public void setAuthID(int authID) {
		AuthID = authID;
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public Books getBooks() {
		return Books;
	}

	public void setBooks(Books books) {
		Books = books;
	}

	public Authors getAuthors() {
		return Authors;
	}

	public void setAuthors(Authors authors) {
		Authors = authors;
	}

	@Override
	public String toString() {
		return "AuthorBooks [AuthID=" + AuthID + ", BookID=" + BookID + ", Books=" + Books + ", Authors=" + Authors
				+ "]";
	}

}
