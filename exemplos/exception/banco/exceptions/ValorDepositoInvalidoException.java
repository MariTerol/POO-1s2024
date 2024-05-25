package exemplos.exception.banco.exceptions;

public class ValorDepositoInvalidoException extends Exception{
    
    Public ValorDepositoInvalidoException(){
        super("Valor invalido, tente um numero positivo!");
    }

}
