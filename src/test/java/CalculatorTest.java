import cl.praxis.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{
    Calculator calc = new Calculator();


    @Test
    void sumar() {

        double valor= calc.sumar(30,2);
        assertEquals(32,valor);
    }

    @Test
    void restar() {
        assertEquals(56, calc.restar(60,4));
    }

    @Test
    void multiplicar() {
        assertEquals(200, calc.multiplicar(20,10));
    }

    @Test
    void dividir() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
                calc.dividir(10, 0));
        assertEquals("No se divide entre 0", exception.getMessage());
        assertEquals(4, calc.dividir(20,5));
    }

    @Test
    void getValor1() {
        calc.setValor1(4);
        assertEquals(4, calc.getValor1());
    }

    @Test
    void setValor1() {
        calc.setValor1(3);
        assertEquals(3, calc.getValor1());
    }

    @Test
    void getValor2() {
        calc.setValor2(1);
        assertEquals(1, calc.getValor2());
    }

    @Test
    void setValor2() {
        calc.setValor2(2);
        assertEquals(2, calc.getValor2());
    }

    @Test
    public void constructorConCalculadora(){
        Calculator cal= new Calculator(6,8) ;
        assertTrue(cal instanceof Calculator);

    }

    @Test
    public void constructorSinCalculadora(){
        Calculator cal = new Calculator() ;
        assertTrue(cal instanceof Calculator);

    }
}