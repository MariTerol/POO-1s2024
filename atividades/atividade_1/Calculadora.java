package atividades.atividade_1;

public class Calculadora {

    Double numA;
    Double numB;

      
    public Calculadora(double numA, double numB){
        this.numA = numA;
        this.numB = numB;
    }

    Double somar(){

        return numA + numB;

    }

    Double subtrair(){

        return numA - numB;

    }

    Double multiplicar(){

        return numA * numB;

    }

    Double dividir(){

        return numA / numB;

    }

    public boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
