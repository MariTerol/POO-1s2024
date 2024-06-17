package atividades.javaproject_2.src;

public class FictionAuthor extends Author {
    public FictionAuthor(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "[Fiction] " + super.toString();
    }
}
