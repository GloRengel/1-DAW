import org.junit.Assert;
import org.junit.Test;

public class TemperaturaConverterTest {
    @Test
    public void testCelsiusToFahrenheit(){
        //Creamos el test para que pase el test la función
        //Nos devuelve 0
        //1.- Arrange
        double celsius = 20;
        double resultadoEsperado = 68;
        double tolerateDelta = 0.000001;

        //2.-ACt
        double resultadoReal = TemperaturaConverter.celsiusToFahrenheit(celsius);

        //3.- Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal, tolerateDelta);
    }
}
