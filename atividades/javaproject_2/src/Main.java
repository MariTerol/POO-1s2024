package atividades.javaproject_2.src;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register Author");
            System.out.println("2. Register Fiction Author");
            System.out.println("3. Register Non-Fiction Author");
            System.out.println("4. Register Book");
            System.out.println("5. Register Fiction Book");
            System.out.println("6. Register Non-Fiction Book");
            System.out.println("7. List Authors");
            System.out.println("8. List Books");
            System.out.println("9. Update Author");
            System.out.println("10. Delete Author");
            System.out.println("11. Update Book");
            System.out.println("12. Delete Book");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    registerAuthor();
                    break;
                case "2":
                    registerFictionAuthor();
                    break;
                case "3":
                    registerNonFictionAuthor();
                    break;
                case "4":
                    registerBook();
                    break;
                case "5":
                    registerFictionBook();
                    break;
                case "6":
                    registerNonFictionBook();
                    break;
                case "7":
                    listAuthors();
                    break;
                case "8":
                    listBooks();
                    break;
                case "9":
                    updateAuthor();
                    break;
                case "10":
                    deleteAuthor();
                    break;
                case "11":
                    updateBook();
                    break;
                case "12":
                    deleteBook();
                    break;
                case "13":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }
        }
    }

    private static void registerAuthor() {
        System.out.print("Author's name: ");
        String authorName = scanner.nextLine();
        Library.registerAuthor(authorName);
        System.out.println("Author registered successfully!");
    }

    private static void registerFictionAuthor() {
        System.out.print("Fiction author's name: ");
        String authorName = "[Fiction] " + scanner.nextLine();
        Library.registerAuthor(authorName);
        System.out.println("Fiction author registered successfully!");
    }

    private static void registerNonFictionAuthor() {
        System.out.print("Non-Fiction author's name: ");
        String authorName = "[Non-Fiction] " + scanner.nextLine();
        Library.registerAuthor(authorName);
        System.out.println("Non-Fiction author registered successfully!");
    }

    private static void registerBook() {
        System.out.print("Book title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Available authors:");
        List<Author> authors = Library.listAuthors();
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.print("Author ID: ");
        int authorId = Integer.parseInt(scanner.nextLine());
        Library.registerBook(bookTitle, authorId);
        System.out.println("Book registered successfully!");
    }

    private static void registerFictionBook() {
        System.out.print("Fiction book title: ");
        String bookTitle = "[Fiction] " + scanner.nextLine();
        System.out.println("Available authors:");
        List<Author> authors = Library.listAuthors();
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.print("Author ID: ");
        int authorId = Integer.parseInt(scanner.nextLine());
        Library.registerBook(bookTitle, authorId);
        System.out.println("Fiction book registered successfully!");
    }

    private static void registerNonFictionBook() {
        System.out.print("Non-Fiction book title: ");
        String bookTitle = "[Non-Fiction] " + scanner.nextLine();
        System.out.println("Available authors:");
        List<Author> authors = Library.listAuthors();
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.print("Author ID: ");
        int authorId = Integer.parseInt(scanner.nextLine());
        Library.registerBook(bookTitle, authorId);
        System.out.println("Non-Fiction book registered successfully!");
    }

    private static void listAuthors() {
        System.out.println("List of authors:");
        List<Author> authorList = Library.listAuthors();
        for (Author author : authorList) {
            System.out.println(author);
        }
    }

    private static void listBooks() {
        System.out.println("List of books:");
        List<Book> bookList = Library.listBooks();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    private static void updateAuthor() {
        System.out.print("Author ID to update: ");
        int authorId = Integer.parseInt(scanner.nextLine());
        System.out.print("New author name: ");
        String newName = scanner.nextLine();
        Library.updateAuthor(authorId, newName);
    }

    private static void deleteAuthor() {
        System.out.print("Author ID to delete: ");
        int authorId = Integer.parseInt(scanner.nextLine());
        Library.deleteAuthor(authorId);
    }

    private static void updateBook() {
        System.out.print("Book ID to update: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        System.out.print("New book title: ");
        String newTitle = scanner.nextLine();
        System.out.print("New author ID: ");
        int newAuthorId = Integer.parseInt(scanner.nextLine());
        Library.updateBook(bookId, newTitle, newAuthorId);
    }

    private static void deleteBook() {
        System.out.print("Book ID to delete: ");
        int bookId = Integer.parseInt(scanner.nextLine());
        Library.deleteBook(bookId);
    }
}

