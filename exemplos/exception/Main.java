package exemplos.exception;

import exemplos.exception.banco.Banco;

public class Main {
    
    public static void main(String[] args) {
        
        Banco UCBank = new Banco();

        UCBank.abrirConta("Conta 1");
        UCBank.depositar("Conta 1", 10.0);
    }

}
