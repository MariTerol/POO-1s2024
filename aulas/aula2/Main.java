package aulas.aula2;

public class Main {

    public static void main(String[] args) {
        
        Calculadora Calc = new Calculadora();
        Calc.numA = 2.0;
        Calc.numB = 2.0;
        Calc.somar(Calc.numA, Calc.numB);

        System.out.println("Soma: " + Calc.somar(2.0, 1.0));
        System.out.println("Subtrair: " + Calc.subtrair(6.0, 1.0));
        System.out.println("Multiplicar: " + Calc.multiplicar(2.0, 5.0));
        System.out.println("Dividir: " + Calc.dividir(5.0, 2.0));


    }
    
}
