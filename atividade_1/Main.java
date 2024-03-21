package atividade_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NumA:");
        double numA = scanner.nextDouble();

        System.out.println("NumB:");
        double numB = scanner.nextDouble();
        
        Calculadora Calc = new Calculadora(numA, numB);

        System.out.println("NumA: " + Calc.numA);
        System.out.println("numB: " + Calc.numB);
        System.out.println("Soma: " + Calc.somar());
        System.out.println("Subtrair: " + Calc.subtrair());
        System.out.println("Multiplicar: " + Calc.multiplicar());
        System.out.println("Dividir: " + Calc.dividir());
        
        System.out.println("Digite um número para verificar se é primo:");
        int n = scanner.nextInt();

    
        if (Calc.verificarNumeroPrimo(n)) {
            System.out.println(n + " = True");
        } else {
            System.out.println(n + " = False");
        }

    }
    
}
