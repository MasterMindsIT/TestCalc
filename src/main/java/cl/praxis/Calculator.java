package cl.praxis;

public class Calculator {
    private double valor1;
    private double valor2;

    public  double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public  double restar(double valor1, double valor2 ){
        return valor1 - valor2;
    }

    public  double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public  double dividir(double valor1, double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            throw new ArithmeticException("No se divide entre 0");
        }
    }

    public Calculator() {
    }

    public Calculator(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }



}