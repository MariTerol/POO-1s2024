import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register Author");
            System.out.println("2. Register Book");
            System.out.println("3. List Authors");
            System.out.println("4. List Books");
            System.out.println("5. Update Author");
            System.out.println("6. Delete Author");
            System.out.println("7. Update Book");
            System.out.println("8. Delete Book");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    registerAuthor();
                    break;
                case "2":
                    registerBook();
                    break;
                case "3":
                    listAuthors();
                    break;
                case "4":
                    listBooks();
                    break;
                case "5":
                    updateAuthor();
                    break;
                case "6":
                    deleteAuthor();
                    break;
                case "7":
                    updateBook();
                    break;
                case "8":
                    deleteBook();
                    break;
                case "9":
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
