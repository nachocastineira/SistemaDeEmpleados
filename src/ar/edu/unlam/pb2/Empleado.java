/* •••• Encontrar la jerarquia de clases adecuada para un Sistema de empleados con las siguientes caracteristicas ••••
 
Se solicita realizar un sistema de empleados que almcenene el nombre, salario, fecha de cumpleaños.  El organigrama de la empresa determina que esta organizada
en diferentes departamentos. siendo que cada departamento esta administrado por un gerente, quienes a su vez tienen una cochera asignada. 
El director de la empresa, ademas de tener su conchera, recibe un extra a sus salario para los gatos del vechiculo. */

package ar.edu.unlam.pb2;

public class Empleado {
	
	// Atributos//
	private String nombre;
	private Double salario;
	private Integer fechaDeNacimiento;
	
	public Empleado (String nombre, Double salario, Integer fechaDeNacimiento)
	{
		this.nombre = nombre;
		this.salario = salario;
		this.fechaDeNacimiento = fechaDeNacimiento;			
	}
	
	// Get y Set//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}
