package ar.edu.unlam.pb2;

public class Director extends Empleado { //heredo la clase padre
	
	private String cochera;
	private Double salarioExtraParaGastosDeVehiculo;
	
	public Director (String nombre, Double salario, Integer fechaDeNacimiento, String cochera, Double salarioExtraParaGastosDeVehiculo)
	{
		super(nombre, salario, fechaDeNacimiento); //heredo contructor de la clase padre
		this.cochera = cochera;
		this.salarioExtraParaGastosDeVehiculo = salarioExtraParaGastosDeVehiculo;
	}

	// Get y Set//
	public String getCochera() {
		return cochera;
	}
	public void setCochera(String cochera) {
		this.cochera = cochera;
	}
	public Double getSalarioExtraParaGastosDeVehiculo() {
		return salarioExtraParaGastosDeVehiculo;
	}
	public void setSalarioExtraParaGastosDeVehiculo(
			Double salarioExtraParaGastosDeVehiculo) {
		this.salarioExtraParaGastosDeVehiculo = salarioExtraParaGastosDeVehiculo;
	}
	
	
	
	
	
	
}

