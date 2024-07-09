package Academia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
	
	static List<Alumno> alumnos = new ArrayList<Alumno>();
	static float  promPromedo;
	static double antProm;
	static int contarAlum;
	public static void main(String[] args) {
		List<String> servicios1 = new ArrayList<String>();
		servicios1.add("Autobus");
		servicios1.add("Comedor");

		List<String> servicios2 = new ArrayList<String>();
		servicios2.add("Autobus");

		List<String> servicios3 = new ArrayList<String>();
		servicios3.add("Comedor");

		List<String> torso1 = new ArrayList<String>();
		torso1.add("camisa");
		torso1.add("playera");

		List<String> torso2 = new ArrayList<String>();
		torso2.add("camisa");

		List<String> torso3 = new ArrayList<String>();
		torso3.add("playera");

		List<String> piernas1 = new ArrayList<String>();
		piernas1.add("pantalones");
		piernas1.add("tenis");

		List<String> piernas2 = new ArrayList<String>();
		piernas2.add("pantalones");

		List<String> piernas3 = new ArrayList<String>();
		piernas3.add("tenis");

		List<String> calzado1 = new ArrayList<String>();
		calzado1.add("zapatos");
		calzado1.add("tenis");

		List<String> calzado2 = new ArrayList<String>();
		calzado2.add("zapatos");

		List<String> calzado3 = new ArrayList<String>();
		calzado3.add("tenis");

		Uniformes uniforme1 = new Uniformes(torso1, piernas1, calzado1);
		Uniformes uniforme2 = new Uniformes(torso3, piernas3, calzado3);
		Uniformes uniforme3 = new Uniformes(torso2, piernas2, calzado2);

		Alumno estudiante1 = new Alumno(1, 2, "Juan", 9, 5.7, "Matutino", servicios1, uniforme1);
		alumnos.add(estudiante1);
		Alumno estudiante2 = new Alumno(2, 1, "Pedro",EdadAleatoria(), 8.9, "Matutino", servicios2, uniforme2);
		alumnos.add(estudiante2);
		Alumno estudiante3 = new Alumno(3, 2, "David", 7, 9.0, "Vespertino", servicios3, uniforme3);
		alumnos.add(estudiante3);
		Alumno estudiante4 = new Alumno(4, 3, "Jorge", 8, 6.0, "Matutino", servicios3, uniforme1);
		alumnos.add(estudiante4);

		for(Alumno alumno : alumnos) {
			
				System.out.print("Numero de alumno: ");
				System.out.println(alumno.getNumeroAlumno());
				System.out.print("Nivel: ");
				System.out.println(alumno.getNivel());
				System.out.print("Nombre: ");
				System.out.println(alumno.getNombre());
				System.out.print("Edad: ");
				System.out.println(alumno.getEdad());
				System.out.print("Promedio: ");
				System.out.println(alumno.getPromedio());
				System.out.print("Turno: ");
				System.out.println(alumno.getTurno());
				System.out.print("Servicios: ");
				System.out.println(alumno.getServicios());
				
				System.out.print("Uniformes: \n");
				System.out.print("Torso: ");
				System.out.println(alumno.getUniformes().getTorso());
				System.out.print("Piernas: ");
				System.out.println(alumno.getUniformes().getPiernas());
				System.out.print("Calzado: ");
				System.out.println(alumno.getUniformes().getCalzado());
				System.out.println("****************************\n");
				contarAlum = contarAlum + 1; 
				antProm = antProm + alumno.getPromedio();
				
				
		}
		promPromedo = (float) (antProm / contarAlum);
		System.out.print(promPromedo);
		
	}	
	public static int EdadAleatoria(){
		Random numeroAleatorio = new Random();
		int edad=11;
		int min = 7;
		int eAleatoria;
		eAleatoria = numeroAleatorio.nextInt(4);
	    edad = eAleatoria + min;
		return edad;
		
	}
	


}
