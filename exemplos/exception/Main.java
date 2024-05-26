package exemplos.exception;

import exemplos.exception.banco.Banco;
import exemplos.exception.banco.exceptions.ContaIneException;
import exemplos.exception.banco.exceptions.ValorDepositoInvalidoException;

public class Main {
    
    public static void main(String[] args) {
        
        Banco UCBank = new Banco();

        UCBank.abrirConta("Conta 1");

        try {
            UCBank.depositar("Conta 2", -10.0);
        } 
        catch (ContaIneException e) {
            System.out.println(e);
        }
        catch (ValorDepositoInvalidoException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Algo deu errado! Tente novamente.");
        }
    }

}
