import java.sql.*;
import java.util.Scanner;

public class insert {

	public static void insertSingle() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nPlease enter book title: \n");
		String title = scanner.nextLine();

		System.out.println("\nPlease enter book subject area: \n");
		String subject = scanner.nextLine();

		System.out.println("\nPlease enter book page count: \n");
		int pageCount = scanner.nextInt();

		System.out.println("\nPlease enter current page: \n");
		int currentPage = scanner.nextInt();

		System.out.println("\nInserting new book: \n" + title);

		try {

			Connection con = DriverManager.getConnection(
					"",
					"",
					"");

			String query = "INSERT INTO book_records (title, subject, page_count, current_page) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, subject);
			pstmt.setInt(3, pageCount);
			pstmt.setInt(4, currentPage);
			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("Warning, upload failed: " + e);
			librarySys.main(null);
		}

		exit();

	}

	public static void insertMultiple(int amount) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter each book in sequential fashion: ");

		for (int i = 0; i < amount; i++) {

			System.out.println("\nPlease enter book title: \n");
			String title = scanner.nextLine();

			System.out.println("\nPlease enter book subject area: \n");
			String subject = scanner.nextLine();

			System.out.println("\nPlease enter book page count: \n");
			int pageCount = scanner.nextInt();

			System.out.println("\nPlease enter current page: \n");
			int currentPage = scanner.nextInt();

			System.out.println("\nInserting new book: \n" + title);

			try {

				Connection con = DriverManager.getConnection(
						"",
						"",
						"");

				String query = "INSERT INTO book_records (title, subject, page_count, current_page) VALUES (?, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, title);
				pstmt.setString(2, subject);
				pstmt.setInt(3, pageCount);
				pstmt.setInt(4, currentPage);
				pstmt.executeUpdate();

			} catch (Exception e) {
				System.out.println("Warning, upload failed: " + e);
				librarySys.main(null);
			}

			System.out.println("\nUpload Successful\n");

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
