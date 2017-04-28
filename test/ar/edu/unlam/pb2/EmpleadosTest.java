package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadosTest {

	@Test
	public void testParaCrearUnObjetoEmpleado()  //testeo la clase padre Empleado
	{
		Empleado miEmpleado = new Empleado ("Juan", 200.00, 1997);
		miEmpleado.setSalario(500.0);  //seteo un nuevo valor al atributo Salario de la clase Empleado, reemplazando al declarado inicialmente
		miEmpleado.setNombre("Lucas");
		assertEquals(miEmpleado.getSalario(), 500.0, 0.0);  //comparo los valores con assertEquals
		assertEquals(miEmpleado.getFechaDeNacimiento(), 1997, 0);
		assertEquals(miEmpleado.getNombre(), "Lucas");
	}
	
	@Test
	public void testParaCrearUnObjetoGerente()  //testeo la subclase Gerente
	{
		Gerente miGerente = new Gerente ("Juan", 200.00, 1997, "A1", "Contaduria");
		miGerente.setSalario(600.50); //cambio el valor del salario
		miGerente.setCochera("F6");
		miGerente.setNombre("Mariano");
		miGerente.setFechaDeNacimiento(1986);
		assertEquals(miGerente.getNombre(), "Mariano");
		assertEquals(miGerente.getSalario(), 600.50, 0);  //verifico que el salario se cambio
		assertNotEquals(miGerente.getSalario(), 200.0, 0); //verifico que ambos resultando no son iguales, el salario fue reemplazado por un nuevo valor
		assertEquals(miGerente.getFechaDeNacimiento(), 1986, 0.0);
		assertEquals(miGerente.getCochera(), "F6");
		assertEquals(miGerente.getDepartamentoAsignado(), "Contaduria");
	}
	
	@Test
	public void testParaCrearUnObjetoDirector()  //testeo la subclase Director
	{
		Director miDirector = new Director ("Juan", 200.0, 1997, "A1", 75.0);
		miDirector.setSalario(1150.0);
		assertEquals(miDirector.getNombre(), "Juan");
		assertEquals(miDirector.getFechaDeNacimiento(), 1997, 0.0);
		assertEquals(miDirector.getSalario(), 1150.0, 0.0);
		assertEquals(miDirector.getCochera(), "A1");
		assertEquals(miDirector.getSalarioExtraParaGastosDeVehiculo(), 75.0, 0.0);
	}

}
