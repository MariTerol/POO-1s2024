package exemplos.exception.banco;

import java.util.ArrayList;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeConta){
        ContaCorrente conta = new ContaCorrente();
        this.contas.add(conta);
    }

    public void depositar(String nomeConta, Double ValorDeposito){
        
        for (ContaCorrente conta : contas) {
            if (conta.getNomeConta().equals(nomeConta)) {
                conta.setSaldo(conta.getSaldo() + ValorDeposito);
            }
        }

    }

}
