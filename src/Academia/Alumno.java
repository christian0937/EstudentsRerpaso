package Academia;
import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Alumno {

	private int numeroAlumno;
	private int nivel ;
	private String nombre;
	private int edad ;
	private double promedio;
	private String turno;
	private List <String> servicios;
	private Uniformes uniformes;
	public Alumno(int numeroAlumno, int nivel, String nombre, int edad, double promedio, String turno,
			List<String> servicios, Uniformes uniformes) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nivel = nivel;
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
		this.turno = turno;
		this.servicios = servicios;
		this.uniformes = uniformes;
	}
	public int getNumeroAlumno() {
		return numeroAlumno;
	}
	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public List<String> getServicios() {
		return servicios;
	}
	public void setServicios(List<String> servicios) {
		this.servicios = servicios;
	}
	public Uniformes getUniformes() {
		return uniformes;
	}
	public void setUniformes(Uniformes uniformes) {
		this.uniformes = uniformes;
	}




} 