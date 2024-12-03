import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testconcatenarNumeroTexto(){
        //1.-Arrange
        int num1 = 2;
        String texto1 = "zanahorias";
        String resulEsperado = "2 zanahorias";


        //2.- Act
        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(num1, texto1);

        //3.-Assert
        Assert.assertEquals(resulEsperado, resultadoReal);
    }

    @Test
    public void testbooleanComoTexto() {
        //1.-Arrange
        boolean valor = true;
        String resulEsperado = "verdadero";


        //2.- Act
        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);

        //3.-Assert
        Assert.assertEquals(resulEsperado, resultadoReal);
    }

    @Test
    public void testconcatenarTextos() {
        //1.- Arrange
        String texto1 = "buenos";
        String texto2 = "días";
        String resultadoEsperado = "buenos días";

        //2.-Act
        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);

        //3.- Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testdescripcionNumero(){
        //1.- Arrange
        int num1 = 5;
        String resultadoEsperado = "El número es positivo";

        //2.- Act
        String resultadoReal = OperacionesMixtas.descripcionNumero(num1);

        //3.- Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
