package atividades.javaproject_2.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Library {
    public static void registerAuthor(String name) {
        Author author = new Author(name);
        author.save();
    }

    public static void registerFictionAuthor(String name) {
        FictionAuthor author = new FictionAuthor(name);
        author.save();
    }

    public static void registerNonFictionAuthor(String name) {
        NonFictionAuthor author = new NonFictionAuthor(name);
        author.save();
    }

    public static void registerBook(String title, int authorId) {
        Book book = new Book(title, authorId);
        book.save();
    }

    public static void registerFictionBook(String title, int authorId) {
        FictionBook book = new FictionBook(title, authorId);
        book.save();
    }

    public static void registerNonFictionBook(String title, int authorId) {
        NonFictionBook book = new NonFictionBook(title, authorId);
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
                String name = rs.getString("name");
                if (name.startsWith("[Fiction]")) {
                    db.close();
                    return new FictionAuthor(name.substring("[Fiction] ".length()));
                } else if (name.startsWith("[Non-Fiction]")) {
                    db.close();
                    return new NonFictionAuthor(name.substring("[Non-Fiction] ".length()));
                } else {
                    db.close();
                    return new Author(name);
                }
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
                String title = rs.getString("title");
                int authorId = rs.getInt("author_id");
                if (title.startsWith("[Fiction]")) {
                    db.close();
                    return new FictionBook(title.substring("[Fiction] ".length()), authorId);
                } else if (title.startsWith("[Non-Fiction]")) {
                    db.close();
                    return new NonFictionBook(title.substring("[Non-Fiction] ".length()), authorId);
                } else {
                    db.close();
                    return new Book(title, authorId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
        return null;
    }
}
