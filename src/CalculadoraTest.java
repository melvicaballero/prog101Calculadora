import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
    public void calculadora_sumar_correcto() {
		Calculadora mini = new Calculadora();
        int product = mini.addWithDelim("1,2,3");
        int exp = 6;
        assertEquals(exp,product);
    }

    @Test
    public void calculadora_sumar_incorrecto()  {
    	Calculadora mini = new Calculadora();
        int product = mini.addWithDelim("1,2,3");
        int exp = 9;
        assertNotEquals(exp,product);
    }
    
    @Test
    public void calculadora_sumarvacio_correcto()  {
    	Calculadora mini = new Calculadora();
        int product = mini.addWithDelim("");
        int exp = 0;
        assertEquals(exp,product);
    }
    
    @Test
    public void calculadora_sumar1a5_correcto()  {
    	Calculadora mini = new Calculadora();
        int product = mini.addWithDelim("1,2,3,4,5");
        int exp = 15;
        assertEquals(exp,product);
    }


}
