package exemplos.exception.banco.exceptions;

public class ValorDepositoInvalidoException extends Exception{
    
    public ValorDepositoInvalidoException(){
        super("Valor invalido, tente um numero positivo!");
    }

}
