package library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		LibraryDAO dao = new LibraryDAOImpl();
		LibraryService service = new LibraryService(dao);

		while (true) {
			System.out.println("Library book manager");
			System.out.println("\n1.Add Book\n2.Remove Book\n3.Search Book\n4.List Books"
					+ "\n5.Issue Book\n6.Return Book\n7.Check Availability\n8.Exit");

			System.out.print("Choose: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				service.addBook(id, title, author);
				break;

			case 2:
				System.out.print("Book ID: ");
				service.removeBook(sc.nextInt());
				break;

			case 3:
				System.out.print("Book ID: ");
				service.searchBook(sc.nextInt());
				break;

			case 4:
				service.listBooks();
				break;

			case 5:
				System.out.print("Book ID: ");
				service.issueBook(sc.nextInt());
				break;

			case 6:
				System.out.print("Book ID: ");
				service.returnBook(sc.nextInt());
				break;

			case 7:
				System.out.print("Book ID: ");
				service.checkAvailability(sc.nextInt());
				break;

			case 8:
				sc.close();
				System.exit(0);
			}
		}
	}
}
