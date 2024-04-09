package atividades.atividade_2;

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

    public String detalharLivros(int id){
        StringBuilder detalharLivros = new StringBuilder();

        for (Livro l: this.livros) {
            if(l.id == id){
                detalharLivros.append("ID do livro: ").append(l.id).append("\n");
                detalharLivros.append("Título: ").append(l.titulo).append("\n");
                detalharLivros.append("Autor: ").append(l.nomeAutor).append("\n");
                detalharLivros.append("Ano Publicado: ").append(l.anoPublicado).append("\n");
                detalharLivros.append("Editora: ").append(l.editora).append("\n");
                break;
            }
        }
        if(detalharLivros.length()==0){
            return "Nenhum livro encontrado com o ID "+id+".";
        }else{
            return detalharLivros.toString();
        }
    }

}