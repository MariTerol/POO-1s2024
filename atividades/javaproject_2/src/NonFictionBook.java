package atividades.javaproject_2.src;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, int authorId) {
        super(title, authorId);
    }

    @Override
    public String toString() {
        return "[Non-Fiction] " + super.toString();
    }
}
