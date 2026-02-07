package library;

import javax.sql.rowset.CachedRowSet;

public class LibraryService {

	private CachedRowSet books;

	public LibraryService(LibraryDAO dao) throws Exception {
		this.books = dao.getBooks();
	}

	// Add Book
	public void addBook(int id, String title, String author) throws Exception {
		books.moveToInsertRow();
		books.updateInt(1, id);
		books.updateString(2, title);
		books.updateString(3, author);
		books.updateBoolean(4, true);
		books.insertRow();
		books.moveToCurrentRow();
		System.out.println("Book added successfully");
	}

	// Remove Book
	public void removeBook(int id) throws Exception {
		books.beforeFirst();
		while (books.next()) {
			if (books.getInt(1) == id) {
				books.deleteRow();
				System.out.println("Book removed successfully");
				return;
			}
		}
		System.out.println("Book not found");
	}

	// Search Book
	public void searchBook(int id) throws Exception {
		books.beforeFirst();
		while (books.next()) {
			if (books.getInt(1) == id) {
				System.out.println("ID: " + books.getInt(1) + ", Title: " + books.getString(2) + ", Author: "
						+ books.getString(3) + ", Status: " + (books.getBoolean(4) ? "Available" : "Issued"));
				return;
			}
		}
		System.out.println("Book not found");
	}

	// Check Availability
	public void checkAvailability(int id) throws Exception {
		books.beforeFirst();
		while (books.next()) {
			if (books.getInt(1) == id) {
				System.out.println(books.getBoolean(4) ? "Book is available" : "Book is issued");
				return;
			}
		}
		System.out.println("Book not found");
	}

	// List Books
	public void listBooks() throws Exception {
		books.beforeFirst();
		while (books.next()) {
			System.out.println(books.getInt(1) + " | " + books.getString(2) + " | " + books.getString(3) + " | "
					+ (books.getBoolean(4) ? "Available" : "Issued"));
		}
	}

	// Issue Book
	public void issueBook(int id) throws Exception {
		books.beforeFirst();
		while (books.next()) {
			if (books.getInt(1) == id && books.getBoolean(4)) {
				books.updateBoolean(4, false);
				books.updateRow();
				System.out.println("Book issued");
				return;
			}
		}
		System.out.println("Book not available");
	}

	// Return Book
	public void returnBook(int id) throws Exception {
		books.beforeFirst();
		while (books.next()) {
			if (books.getInt(1) == id) {
				books.updateBoolean(4, true);
				books.updateRow();
				System.out.println("Book returned");
				return;
			}
		}
	}
}
