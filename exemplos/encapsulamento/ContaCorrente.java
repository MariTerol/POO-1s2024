package exemplos.encapsulamento;

public class ContaCorrente {

    public int num;
    private double saldo;

    private ContaCorrente(){}

    public ContaCorrente(int numeroConta){
        this.num = numeroConta;
        this.saldo = 0;
    }


    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
