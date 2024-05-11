package exemplos.polimorfismo;

public class Calculadora {

    public int somar(int a,int b){
        System.out.println("Somando int");
        return a+b;
    }
    
    public double somar(double a,double b){
        System.out.println("Somando double");
        return a+b;
    }
}
