package aulas.aula4;

import java.util.ArrayList;

public class Livraria {

    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();

    }

    public void CadastrarLivro(Livro livro){
        this.livros.add(livro);

    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public String listarLivros(){
        String listarLivros = "";

        for(Livro l : this.livros){
            listarLivros += l.id + " - " + l.titulo + "\n";
        }
        return listarLivros;
    }

    public String detalharLivros(int id){
        String detalharLivros = "Livro nao encontrado.\n"; 

        for(Livro livro : livros){
           if (livro.id == id) {
            detalharLivros = livro.toString();
           } 
        }


        return detalharLivros;
    }

    
}
