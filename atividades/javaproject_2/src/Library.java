package atividades.javaproject_2.src;

import java.util.List;

public class Library {
    public static void registerAuthor(String name) {
        Author author = new Author(name);
        author.save();
    }

    public static void registerBook(String title, int authorId) {
        Book book = new Book(title, authorId);
        book.save();
    }

    public static List<Author> listAuthors() {
        return Author.list();
    }

    public static List<Book> listBooks() {
        return Book.list();
    }
}
