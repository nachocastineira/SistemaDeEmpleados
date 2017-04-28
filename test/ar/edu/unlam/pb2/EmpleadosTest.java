package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadosTest {

	@Test
	public void testParaCrearUnObjetoEmpleado()
	{
		Empleado miEmpleado = new Empleado ("juan", 200.00, 1997);
		miEmpleado.setSalario(500.0);
		miEmpleado.setNombre("Lucas");
		assertEquals(miEmpleado.getSalario(), 500.0, 0.0);
		assertEquals(miEmpleado.getFechaDeNacimiento(), 1997, 0);
		assertEquals(miEmpleado.getNombre(), "Lucas");
	}
	
	@Test
	public void testParaCrearUnObjetoGerente()
	{
		Gerente miGerente = new Gerente ("juan", 200.00, 1997, "A1", "Contaduria");
		miGerente.setSalario(600.50);
		miGerente.setCochera("F6");
		assertEquals(miGerente.getSalario(), 600.50, 0);
		assertEquals(miGerente.getCochera(), "F6");
		assertEquals(miGerente.getDepartamentoAsignado(), "Contaduria");
	}
	
	@Test
	public void testParaCrearUnObjetoDirector()
	{
		Director miDirector = new Director ("Juan", 200.0, 1997, "A1", 75.0);
		miDirector.setSalario(1150.0);
		assertEquals(miDirector.getNombre(), "Juan");
		assertEquals(miDirector.getFechaDeNacimiento(), 1997, 0.0);
		assertEquals(miDirector.getSalario(), 1150.0, 0.0);
		assertEquals(miDirector.getSalarioExtraParaGastosDeVehiculo(), 75.0, 0.0);
	}

}
