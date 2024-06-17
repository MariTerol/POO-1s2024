package atividades.javaproject_2.src;

public class NonFictionAuthor extends Author {
    public NonFictionAuthor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "[Non-Fiction] " + super.toString();
    }
}
