package aulas.aula4;

public class Livro {
    
    public int id;
    public String titulo;
    public String nomeAutor;
    public String anoPublicado;
    public String editora;

    public Livro(int id, String titulo, String nomeAutor, String anoPublicado, String editora){

        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.anoPublicado = anoPublicado;
        this.editora = editora;

    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", nomeAutor='" + getNomeAutor() + "'" +
            ", anoPublicado='" + getAnoPublicado() + "'" +
            ", editora='" + getEditora() + "'" +
            "}";
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getAnoPublicado() {
        return this.anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


}
