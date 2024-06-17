package atividades.javaproject_2.src;

public class FictionBook extends Book {
    public FictionBook(String title, int authorId) {
        super(title, authorId);
    }

    @Override
    public String toString() {
        return "[Fiction] " + super.toString();
    }
}
