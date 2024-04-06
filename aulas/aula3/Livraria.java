package aulas.aula3;

import java.util.ArrayList;

public class Livraria {

    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();

    }

    public void CadastrarLivro(Livro livro){
        this.livros.add(livro);

    }

    public String listarLivros(){
        String listarLivros = "";

        for(Livro l : this.livros){
            listarLivros += l.id + " - " + l.titulo + "\n";
        }
        return listarLivros;
    }

    
}
