import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Empleados1Test {

	private Empleados1 Empleados1;
	private int resultado;
	private int id;
	private int nombre;
	private String apellidos;
	
	@Before
	public void createTest() {
		Empleados1 = new Empleados1 (1,"Antonio","Pérez","C/Laurel 2", 652147474);
	
	}

	@After	
	public void borraTest () {
		Empleados1 = null;
	}
	
	
	@Test
	// longitud
	public void testLongitud () {
		resultado = Empleados1.longitud();
		assertEquals (7, resultado);
	}
	
	@Test
	// mayuscula
	public void testMayuscula () {
		String resultado = Empleados1.mayuscula();
		assertEquals ("ANTONIO", resultado);
	}
	
	
	@Test
	// multiplicar
	public void testMultiplicar () {
		resultado = Empleados1.multiplicar();
		assertEquals (5, resultado);
	}
	
	
	
}
