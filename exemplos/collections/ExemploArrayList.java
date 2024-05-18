package exemplos.collections;

import java.util.ArrayList;

public class ExemploArrayList {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Mariana");
        nomes.add("Enrique");
        nomes.add("Bruno");

        System.out.println(nomes.get(0));

        for (String nome : nomes) {
            System.out.println(nome);
        }
    
        if(nomes.contains("Mariana")){
            System.out.println("Esta na lista!");
        }else{
            System.out.println("Nao esta na lista!");
        }


        nomes.remove("Bruno");

        if(nomes.contains("Bruno")){
            System.out.println("Esta na lista!");
        }else{
            System.out.println("Nao esta na lista!");
        }

        nomes.clear();
        if (nomes.isEmpty()) {
            System.out.println("A lista esta vazia!");
        }

    }

}
