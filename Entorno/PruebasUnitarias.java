import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasUnitarias {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(3, 2);
        assertEquals(5, resultado, "La suma de 3 y 2 debe ser 5");
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 y 3 debe ser 2");
    }
}
