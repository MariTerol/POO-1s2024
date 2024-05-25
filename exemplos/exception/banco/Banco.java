package exemplos.exception.banco;

import java.util.ArrayList;

import exemplos.exception.banco.exceptions.ContaIneException;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeConta){
        ContaCorrente conta = new ContaCorrente(nomeConta);
        this.contas.add(conta);
    }

    public void depositar(String nomeConta, Double ValorDeposito) throws Exception{

        if (ValorDeposito <= 0) {
            throw new Exception();
        }

        ContaCorrente contaDeposito = null;
        for (ContaCorrente conta : contas) {
            if (conta.getNomeConta().equals(nomeConta)) {
                contaDeposito = conta;
                conta.setSaldo(conta.getSaldo() + ValorDeposito);
            }
        }

        if (contaDeposito == null) {
            throw new ContaIneException();
        }

    }

}
