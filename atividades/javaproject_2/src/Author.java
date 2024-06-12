package atividades.javaproject_2.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private int id;
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void save() {
        Database db = new Database();
        db.execute("INSERT INTO author (name) VALUES (?)", new Object[]{name});
        db.close();
    }

    public static List<Author> list() {
        Database db = new Database();
        ResultSet rs = db.query("SELECT * FROM author", new Object[]{});
        List<Author> authors = new ArrayList<>();
        try {
            while (rs.next()) {
                Author author = new Author(rs.getString("name"));
                author.id = rs.getInt("id");
                authors.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.close();
        return authors;
    }

    public void update(String newName) {
        this.name = newName;
        Database db = new Database();
        db.execute("UPDATE author SET name = ? WHERE id = ?", new Object[]{newName, id});
        db.close();
    }

    public void delete() {
        Database db = new Database();
        db.execute("DELETE FROM author WHERE id = ?", new Object[]{id});
        db.close();
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
