package org.jnit.root;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Books implements Serializable {
	private static final long serialVersionUID = 1L;

	private int BookId;
	private String BookTitle;

	private List<Authors> authors = new ArrayList<>();

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Books [BookId=" + BookId + ", BookTitle=" + BookTitle + ", authors=" + authors + "]";
	}

}
