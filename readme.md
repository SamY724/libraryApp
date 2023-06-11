# Library System

This project is a simple library system that I have used to manage the few books in my collection, it is able to Create, Read, Update, and Delete books from the collection.

I contemplated creating a suitable GUI for this project afterward, but due to time constraints this won't be happening. The uploaded version of this project of course has the MySQL credentials for my account removed, for obvious reasons.

# Prerequisites

Please note this system is designed with a very specific database schema in mind, and in order to utilise the project, the correct schema will of course be needed to implement this project successfully.

Whilst I do not intend to include the contents of the database for distribution, I am able to provide the relevant schema:

## Database Schema

```sql
CREATE TABLE `book_records` (
`book_id` int NOT NULL AUTO_INCREMENT,
`title` varchar(50) DEFAULT NULL,
`subject` varchar(20) DEFAULT NULL,
`page_count` int DEFAULT NULL,
`current_page` int DEFAULT NULL,
PRIMARY KEY (`book_id`)
);
```

Before you begin, ensure you have met the following requirements:

    You have installed the latest version of Java.

    You have a Windows/Linux/Mac machine.

    You have installed Eclipse IDE.

    You have installed MySQL.

# Installing LibrarySystem

To install and configure the library system:

## Setting up Java and Eclipse

    Download and install the Java SE Development Kit (version may vary, so choose the appropriate version).

    Download and install Eclipse IDE.

    During installation, choose the Eclipse IDE for Java Developers option.

    Once Eclipse is installed, open it and select a directory as your workspace.

## Setting up MySQL

    Download and install MySQL.

    During the installation, take note of the root password. You will need it to connect to the database.
    Start MySQL. In a terminal or command prompt, you can generally do this with the following command: mysql -u root -p. Enter your root password when prompted.

## Importing The Project Into Eclipse

    In Eclipse, go to File -> Import.

    In the import source, navigate to General -> Existing Projects into Workspace.

    Choose "Select archive file" and click the "Browse" button to locate your project file.

    After selecting the file, make sure the project you want to import is checked in the projects list.

    Click Finish.

## Connecting to the MySQL Database

    In Eclipse, open the database perspective (Window -> Perspective -> Open Perspective -> Database Development).

    In the "Database Connections" view, right-click and choose "New".

    Fill in the necessary information for your MySQL server (usually the host is localhost, the user is root, and the password is the one you set during MySQL installation).

    Test the connection and finish the setup.

You now have the necessary environment to run library system

Additionally, when encountering the following lines of code in the insert/remove/retrieve/update java files:

```java
Connection con = DriverManager.getConnection(
					URL:"",
                    User:"",
                    Password:"");

```

This is where the you must add the necessary database information to connect

## License

[MIT]
(https://choosealicense.com/licenses/mit/)
