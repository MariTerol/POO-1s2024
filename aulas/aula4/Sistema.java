package aulas.aula4;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op = 0;
        Livraria livraria = new Livraria();


        while (op != 4) {
            System.out.println("1 - Adicionar livro\n2 - Listar livros\n3 - Detalhar livro\n4 - Sair\n");
            op = sc.nextInt();

            switch (op) {
                case 1: 
                    System.out.println("Adicionando livro\n");
                    Livro novoLivro = Sistema.criarLivro(sc); 
                    livraria.adicionarLivro(novoLivro); 
                    break;
            
                case 2:
                    System.out.println("Listando livro\n");
                    System.out.println(livraria.listarLivros());
                break;

                case 3:
                    System.out.println("Detalhando livro\n");
                    int id;
                    System.out.println("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println(livraria.detalharLivros(id));
                break;

                case 4:
                System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opcao invalida!");
                break;
            }
        }
        sc.close();
    }
    
    public static Livro criarLivro(Scanner sc){

        System.out.println("Livro adicionado\n");
        int id;
        String titulo;
        String nomeAutor;
        String anoPublicado;
        String editora;

        System.out.println("Informe o id do livro: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o titulo do livro: ");
        titulo = sc.nextLine();
        System.out.println("Informe o nome do autor: ");
        nomeAutor = sc.nextLine();
        System.out.println("Informe o ano publicado: ");
        anoPublicado = sc.nextLine();
        System.out.println("Informe a editora do livro: ");
        editora = sc.nextLine();

        Livro l = new Livro(id, titulo, nomeAutor, anoPublicado, editora);

        return l;
    }

}
