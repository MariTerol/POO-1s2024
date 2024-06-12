package atividades.javaproject_2.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private int authorId;

    public Book(String title, int authorId) {
        this.title = title;
        this.authorId = authorId;
    }

    public void save() {
        Database db = new Database();
        db.execute("INSERT INTO book (title, author_id) VALUES (?, ?)", new Object[]{title, authorId});
        db.close();
    }

    public static List<Book> list() {
        Database db = new Database();
        ResultSet rs = db.query("SELECT book.id, book.title, author.name FROM book JOIN author ON book.author_id = author.id", new Object[]{});
        List<Book> books = new ArrayList<>();
        try {
            while (rs.next()) {
                Book book = new Book(rs.getString("title"), rs.getInt("author_id"));
                book.id = rs.getInt("id");
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.close();
        return books;
    }

    public void update(String newTitle, int newAuthorId) {
        this.title = newTitle;
        this.authorId = newAuthorId;
        Database db = new Database();
        db.execute("UPDATE book SET title = ?, author_id = ? WHERE id = ?", new Object[]{newTitle, newAuthorId, id});
        db.close();
    }

    public void delete() {
        Database db = new Database();
        db.execute("DELETE FROM book WHERE id = ?", new Object[]{id});
        db.close();
    }

    @Override
    public String toString() {
        return id + " - " + title;
    }
}
