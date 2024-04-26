package exemplos.encapsulamento;

public class Sistema {
    
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente(123);
        ContaCorrente c2 = new ContaCorrente(456);
        c2.setNum(123);
        c1.getSaldo();
        
    }

}
