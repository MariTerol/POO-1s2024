package exemplos.heranca;

import exemplos.heranca.empresa.Diretor;
import exemplos.heranca.empresa.Engenheiro;
import exemplos.heranca.empresa.Gerente;

public class Sistema {

    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("Joao", 123, 123456, "crea 1", "Orientação a Objeto", 2000.0);
        Engenheiro eng2 = new Engenheiro("Maria", 456, 456789, "crea 2", "POO", 1000.0);

        System.out.println("Engenheiros: ");
        System.out.println(eng1);
        System.out.println(eng2);

        Gerente ger1 = new Gerente("Enrique", 123456, 123, 10000.0, 7);

        System.out.println("\nGerentes: ");
        System.out.println(ger1);

        Diretor dir1 = new Diretor("Mariana", 741852, 741, 100000.0, 10);

        System.out.println("\nDiretores: ");
        System.out.println(dir1);

    }

    
}
