import java.util.Scanner;

public class librarySys {

	public static void main(String[] args) {

		// Main code of library system, comprising the main menu and relevant calls to
		// functions/modules

		System.out.println("Syber Library System online, Please select an option:\n");
		System.out.println("1 - Retrieve\n");
		System.out.println("2 - Remove\n");
		System.out.println("3 - Insert\n");
		System.out.println("4 - Update\n");
		System.out.println("5 - Power Down\n");

		Scanner scanner = new Scanner(System.in);

		String choice = scanner.nextLine();

		switch (choice) {

			// Read

			case "1": {

				System.out.println("\nRetrieve by number (1), by title (2), retrieve all (3)\n");

				int retrievalMethod = scanner.nextInt();

				scanner.nextLine();

				if (retrievalMethod == 1) {
					System.out.println("Please enter book id number:\n");
					int bookNo = scanner.nextInt();
					retrieve.retrieveByNumber(bookNo);

				} else if (retrievalMethod == 2) {
					System.out.println("Please enter the book title:\n");
					String bookTitle = scanner.nextLine();
					retrieve.retrieveByTitle(bookTitle);

				} else if (retrievalMethod == 3) {
					System.out.println("Retrieving all known books in the Syber library");
					retrieve.retrieveAll();

				} else {
					System.out.println("Invalid selection");
					librarySys.main(null);
				}

				break;
			}

			// Delete

			case "2": {

				System.out.println("Remove by book number (1) or title (2)?\n");

				int removalMethod = scanner.nextInt();

				scanner.nextLine();

				if (removalMethod == 1) {

					System.out.println("\nPlease enter the book number to remove:\n");

					int bookNo = scanner.nextInt();

					remove.removeById(bookNo);

				} else if (removalMethod == 2) {

					System.out.println("Please enter the book title to remove:");

					String bookTitle = scanner.nextLine();

					remove.removeByTitle(bookTitle);

				} else {
					System.out.println("\nInvalid choice\n");
					librarySys.main(null);
				}

				break;
			}

			// Create

			case "3": {

				System.out.println("\nUpload single book (1) or upload multiple books (2)\n");

				int uploadMethod = scanner.nextInt();

				if (uploadMethod == 1) {
					insert.insertSingle();

				} else if (uploadMethod == 2) {
					System.out.println("\nHow many books will be uploaded?\n");
					int amount = scanner.nextInt();
					insert.insertMultiple(amount);

				} else {
					System.out.println("\nInvalid choice\n");
					librarySys.main(null);
				}

				break;
			}

			// Update

			case "4": {

				System.out.println("\nUpdate by book number (1) or by book title (2\n");

				int updateMethod = scanner.nextInt();

				if (updateMethod == 1) {

					System.out.println("\nPlease enter the book number to update:\n");

					int bookNo = scanner.nextInt();

					update.updateByNumber(bookNo);

				} else if (updateMethod == 2) {

					System.out.println("Please enter the book title to update:\n");

					String bookTitle = scanner.nextLine();

					update.updateByTitle(bookTitle);

				} else {
					System.out.println("\nInvalid choice\n");
					librarySys.main(null);
				}

				break;
			}

			// Including option to exit program for good measure

			case "5": {
				System.out.println("\nSyber Library System offline");
				scanner.close();
				break;
			}

			// Option to handle an invalid option

			default:
				System.out.println("Invalid selection, please enter your choice from the menu options: \n");
				librarySys.main(null);
				break;
		}

	}

}
