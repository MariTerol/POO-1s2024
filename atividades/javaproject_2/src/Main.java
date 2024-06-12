package atividades.javaproject_2.src;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register Author");
            System.out.println("2. Register Book");
            System.out.println("3. List Authors");
            System.out.println("4. List Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Author's name: ");
                    String authorName = scanner.nextLine();
                    Library.registerAuthor(authorName);
                    System.out.println("Author registered successfully!");
                    break;
                case "2":
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
                    break;
                case "3":
                    System.out.println("List of authors:");
                    List<Author> authorList = Library.listAuthors();
                    for (Author author : authorList) {
                        System.out.println(author);
                    }
                    break;
                case "4":
                    System.out.println("List of books:");
                    List<Book> bookList = Library.listBooks();
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                    break;
                case "5":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }
        }
    }
}
