import java.sql.*;
import java.util.Scanner;

public class remove {

	public static void removeById(int bookNo) {

		String query = String.format("delete from book_records where book_id=%d", bookNo);

		try {
			System.out.println(String.format("\nRemoving book with id: %d", bookNo));

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(query);

			System.out.println(String.format("\nRemoved book: %d successfully!\n", bookNo));

		} catch (Exception e) {
			System.out.println(e);
		}

		exit();
	}

	public static void removeByTitle(String bookTitle) {

		String query = String.format("delete from book_records where title='%s'", bookTitle);

		try {

			System.out.println(String.format("\nRemoving book with title: %s....\n", bookTitle));

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			int rs = stmt.executeUpdate(query);

			System.out.println(String.format("\nRemoved book: %s successfully!\n", bookTitle));

		} catch (Exception e) {
			System.out.println(e);
		}

		exit();

	}

	public static void exit() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nPress enter to return to the main menu\n");

		scanner.nextLine();

		librarySys.main(null);

	}

}
