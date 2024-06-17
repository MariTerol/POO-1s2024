package atividades.javaproject_2.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTables {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject_2", "root", "root");
            
            Statement stmt = connection.createStatement();
            
            stmt.execute("CREATE TABLE IF NOT EXISTS author (" +
                         "id INT AUTO_INCREMENT PRIMARY KEY, " +
                         "name VARCHAR(255) NOT NULL)");
            
            stmt.execute("CREATE TABLE IF NOT EXISTS book (" +
                         "id INT NOT NULL AUTO_INCREMENT, " +
                         "title VARCHAR(255) NOT NULL, " +
                         "author_id INT NULL, " +
                         "PRIMARY KEY (id), " +
                         "FOREIGN KEY (author_id) REFERENCES author(id))");
                         
            System.out.println("Tables created successfully!");
            
            stmt.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
