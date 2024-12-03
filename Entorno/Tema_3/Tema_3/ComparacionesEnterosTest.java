import org.junit.Assert;
import org.junit.Test;

public class ComparacionesEnterosTest {
    @Test
    public void testSonIguales() {
        //Pasos a seguir para hacer los test
        //1.-Arrange - Preparar (Damos valores a las variables que hemos creado para el test)
        int num1 = 2;
        int num2 = 2;
        boolean resultadoEsperado = true;

        //2.-Act - Ejecutar y guardar(Ejecutamos la función y guardamos el resultado)
        boolean resultadoReal = ComparacionesEnteros.sonIguales(num1, num2);
        //Hemos ejecutado la función pero necesitamos guardar el resultado en un booleano
        
        //3.-Assert - Comparar(Comparamos si los resultado son iguales)
        //Usamos el Assert.assertEquals para comparar los dos booleanos.
        Assert.assertEquals(resultadoEsperado, resultadoReal);
        

    }

    @Test
    public void testesMayor() {
        //1.-Arrange
        int num1 = 2;
        int num2 = 3;
        boolean resultadoEsperado = false;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.esMayor(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testesMenor() {
        //1.-Arrange
        int num1 = 2;
        int num2 = 3;
        boolean resultadoEsperado = true;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.esMenor(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }


    @Test
    public void testesDivisible1() {
        //1.-Arrange
        int num1 = 6;
        int num2 = 3;
        boolean resultadoEsperado = true;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testesDivisible2() {
        //1.-Arrange
        int num1 = 6;
        int num2 = 0;
        boolean resultadoEsperado = true;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testsonAmbosPares() {
        //1.-Arrange
        int num1 = 6;
        int num2 = 3;
        boolean resultadoEsperado = false;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.sonAmbosPares(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testalMenosUnoPositivo1() {
        //1.-Arrange
        int num1 = 6;
        int num2 = -1;
        boolean resultadoEsperado = true;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testalMenosUnoPositivo2() {
        //1.-Arrange
        int num1 = -2;
        int num2 = -1;
        boolean resultadoEsperado = false;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    
    @Test
    public void testsumaEsPar1() {
        //1.-Arrange
        int num1 = 3;
        int num2 = 2;
        boolean resultadoEsperado = false;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testsumaEsPar2() {
        //1.-Arrange
        int num1 = 2;
        int num2 = 2;
        boolean resultadoEsperado = true;

        //2.-Act 
        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(num1, num2);

        //3.-Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
