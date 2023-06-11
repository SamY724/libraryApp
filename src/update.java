import java.sql.*;
import java.util.Scanner;

public class update {

	public static void updateByNumber(int bookNo) {

		System.out.println("\nUpdate book: Title(1) - Subject(2) - Page Count(3) - Current Page(4)\n");

		Scanner scanner = new Scanner(System.in);

		int updateOption = scanner.nextInt();

		scanner.nextLine();

		switch (updateOption) {

			case 1: {

				System.out.println("\nPlease enter the new title: \n");

				String newTitle = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET title = '%s'\n"
						+ "WHERE book_id = %d;\n", newTitle, bookNo);

				update.updateInformation(query);

				break;

			}

			case 2: {

				System.out.println("\nPlease enter the new subject: \n");

				String newSubject = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET subject = '%s' \n"
						+ "WHERE book_id = %d;\n", newSubject, bookNo);

				update.updateInformation(query);

				break;

			}

			case 3: {

				System.out.println("\nPlease enter the new page count: \n");

				int newCount = scanner.nextInt();

				String query = String.format("UPDATE book_records\n"
						+ "SET page_count = %d \n"
						+ "WHERE book_id = %d;\n", newCount, bookNo);

				update.updateInformation(query);

				break;

			}

			case 4: {

				System.out.println("\nPlease enter the current page: \n");

				String currentPage = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET current_page = %d \n"
						+ "WHERE book_id = %d;\n", currentPage, bookNo);

				update.updateInformation(query);

				break;

			}

			// Handle invalid choices
			default: {

				System.out.println("\nInvalid choice, please select one of the options provided: \n");
				update.updateByNumber(bookNo);
				break;

			}

		}

	}

	public static void updateByTitle(String bookTitle) {

		System.out.println("\nUpdate book: Title(1) - Subject(2) - Page Count(3) - Current Page(4)\n");

		Scanner scanner = new Scanner(System.in);

		int updateOption = scanner.nextInt();

		scanner.nextLine();

		switch (updateOption) {

			case 1: {

				System.out.println("\nPlease enter the new title: \n");

				String newTitle = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET title = '%s'\n"
						+ "WHERE title = '%s';\n", newTitle, bookTitle);

				update.updateInformation(query);

				break;

			}

			case 2: {

				System.out.println("\nPlease enter the new subject: \n");

				String newSubject = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET subject = '%s' \n"
						+ "WHERE title = '%s';\n", newSubject, bookTitle);

				update.updateInformation(query);

				break;

			}

			case 3: {

				System.out.println("\nPlease enter the new page count: \n");

				int newCount = scanner.nextInt();

				String query = String.format("UPDATE book_records\n"
						+ "SET page_count = %d \n"
						+ "WHERE title = '%s';\n", newCount, bookTitle);

				update.updateInformation(query);

				break;

			}

			case 4: {

				System.out.println("\nPlease enter the current page: \n");

				String currentPage = scanner.nextLine();

				String query = String.format("UPDATE book_records\n"
						+ "SET current_page = %d \n"
						+ "WHERE title = '%s';\n", currentPage, bookTitle);

				update.updateInformation(query);
				break;

			}

			// Handle invalid choices
			default: {
				System.out.println("\nInvalid choice, please select one of the options provided: \n");
				update.updateByTitle(bookTitle);
				break;

			}
		}

	}

	public static void updateInformation(String query) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println(String.format("\nUpdating book: \n"));

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(query);

			System.out.println(String.format("\nUpdated book successfully!\n"));

		} catch (Exception e) {
			System.out.println(e);
		}

		// Checking for further updates

		System.out.println("Do you wish to update this book further (Y) (N)?");

		String updateAgain = scanner.nextLine();

		String lowerCaseInput = updateAgain.toLowerCase();

		if (lowerCaseInput.equals("yes")) {
			update.updateByTitle(null);
		} else {
			librarySys.main(null);
		}

	}

}
