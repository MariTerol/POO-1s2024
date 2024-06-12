package atividades.javaproject_2.src;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public static void updateAuthor(int authorId, String newName) {
        Author author = findAuthorById(authorId);
        if (author != null) {
            author.update(newName);
            System.out.println("Author updated successfully!");
        } else {
            System.out.println("Author not found!");
        }
    }

    public static void deleteAuthor(int authorId) {
        Author author = findAuthorById(authorId);
        if (author != null) {
            author.delete();
            System.out.println("Author deleted successfully!");
        } else {
            System.out.println("Author not found!");
        }
    }

    public static void updateBook(int bookId, String newTitle, int newAuthorId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.update(newTitle, newAuthorId);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public static void deleteBook(int bookId) {
        Book book = findBookById(bookId);
        if (book != null) {
            book.delete();
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    private static Author findAuthorById(int authorId) {
        Database db = new Database();
        ResultSet rs = db.query("SELECT * FROM author WHERE id = ?", new Object[]{authorId});
        try {
            if (rs.next()) {
                Author author = new Author(rs.getString("name"));
                author.id = rs.getInt("id");
                db.close();
                return author;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
        return null;
    }

    private static Book findBookById(int bookId) {
        Database db = new Database();
        ResultSet rs = db.query("SELECT * FROM book WHERE id = ?", new Object[]{bookId});
        try {
            if (rs.next()) {
                Book book = new Book(rs.getString("title"), rs.getInt("author_id"));
                book.id = rs.getInt("id");
                db.close();
                return book;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
        return null;
    }
}
