import java.sql.*;
import java.util.Scanner;

public class retrieve {

	public static void retrieveAll() {

		try {

			System.out.println("Retrieving All Books: \n");

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book_records");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		exit();

	}

	public static void retrieveByNumber(int bookNo) {

		// Crafting SQL query to retrieve book by given book number, which corresponds
		// to the primary key book_id
		String query = String.format("select * from book_records where book_id=%d", bookNo);

		try {

			System.out.println("Retrieving book: " + bookNo + "\n");

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// Returning query results
			while (rs.next())
				System.out.println(
						"Title: " + rs.getString(2) +
								"\nSubject: " + rs.getString(3) +
								"\nPage Count: " + rs.getInt(4) +
								"\nCurrent Page: " + rs.getInt(5));
			con.close();
		} catch (Exception e) {
			System.out.println("Warning: " + e);
		}

		exit();

	}

	public static void retrieveByTitle(String bookTitle) {

		String query = String.format("select * from book_records where title='%s'", bookTitle);

		try {

			System.out.println("Retrieving book: " + bookTitle + "\n");

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// Returning query results
			while (rs.next())
				System.out.println(
						"Title: " + rs.getString(2) +
								"\nSubject: " + rs.getString(3) +
								"\nPage Count: " + rs.getInt(4) +
								"\nCurrent Page: " + rs.getInt(5));
			con.close();
		} catch (Exception e) {
			System.out.println("Warning:" + e);
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
