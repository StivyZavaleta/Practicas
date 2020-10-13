/*Practica 1 - POO
  Stivy Zavaleta 1263277
  1. Crear una clase llamada "Estudiante" que contenga un nombre, identificación del estudiante, materia, calificación y estado.
  2. Si la calificación dada es inferior a 60, marque el estado del alumno como reprobado, caso contrario aprobado.
  3. Cree 5 objetos de estudiante ingresando sus datos en los argumentos del constructor.
  4. Utilizando el constructor y métodos creados en el punto anterior, solicitar al usuario los datos de 5 alumnos. El usuario deberá introducir los datos para cada alumno a capturar (nombre, identificación, materia, calificación y estado).
  5. Imprimir la información de los 10 alumnos (punto 3 y 4) */

import java.util.*;

public class Alumnos {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner (System.in); 
	
	String nombre2, materia2;
	int matricula2, calificacion2;

		Estudiante alu1 = new Estudiante("Stivy",1263277,"Programacion Estructurada",90,"Aprobado");
		
		Estudiante alu2 = new Estudiante("Brenda",1263288,"Programacion Estructurada",59,"Reprobado");
		
		Estudiante alu3 = new Estudiante("Mariela",1263366,"Programacion Estructurada",60,"Aprobado");
		
		Estudiante alu4 = new Estudiante("Noel",1263266,"Programacion Estructurada",55,"Reprobado");
		
		Estudiante alu5 = new Estudiante("Valeria",1263177,"Programacion Estructurada",71,"Aprobado");
	
		Estudiante alu6 = new Estudiante(" ",0," ",0," ");
		System.out.print("\nIngresa nombre: ");
		nombre2 = sc.nextLine();
		alu6.setNombre(nombre2);
		
		System.out.print("\nIngresa nombre de la materia: ");
		materia2 = sc.nextLine();
		alu6.setMateria(materia2);
		
		System.out.print("\nIngresa matricula: ");
		matricula2 = sc.nextInt();
		alu6.setMatricula(matricula2);
		
		System.out.print("\nIngresa calificacion: ");
		calificacion2 = sc.nextInt();
			if(calificacion2 >= 60){
				alu6.setEstado("Aprobado");
			}
			
			else{
				alu6.setEstado("Reprobado");
			}
		alu6.setCalificacion(calificacion2);
		
		Estudiante alu7 = new Estudiante(" ",0," ",0," ");
		sc.nextLine();
		System.out.print("\nIngresa nombre: ");
		nombre2 = sc.nextLine();
		alu7.setNombre(nombre2);
		
		System.out.print("\nIngresa nombre de la materia: ");
		materia2 = sc.nextLine();
		alu7.setMateria(materia2);
		
		System.out.print("\nIngresa matricula: ");
		matricula2 = sc.nextInt();
		alu7.setMatricula(matricula2);
		
		System.out.print("\nIngresa calificacion: ");
		calificacion2 = sc.nextInt();
			if(calificacion2 >= 60){
				alu7.setEstado("Aprobado");
			}
			
			else{
				alu7.setEstado("Reprobado");
			}
		alu7.setCalificacion(calificacion2);
		
		Estudiante alu8 = new Estudiante(" ",0," ",0," ");
		sc.nextLine();
		System.out.print("\nIngresa nombre: ");
		nombre2 = sc.nextLine();
		alu8.setNombre(nombre2);
		
		System.out.print("\nIngresa nombre de la materia: ");
		materia2 = sc.nextLine();
		alu8.setMateria(materia2);
		
		System.out.print("\nIngresa matricula: ");
		matricula2 = sc.nextInt();
		alu8.setMatricula(matricula2);
		
		System.out.print("\nIngresa calificacion: ");
		calificacion2 = sc.nextInt();
			if(calificacion2 >= 60){
				alu8.setEstado("Aprobado");
			}
			
			else{
				alu8.setEstado("Reprobado");
			}
		alu8.setCalificacion(calificacion2);
		
		Estudiante alu9 = new Estudiante(" ",0," ",0," ");
		sc.nextLine();
		System.out.print("\nIngresa nombre: ");
		nombre2 = sc.nextLine();
		alu9.setNombre(nombre2);
		
		System.out.print("\nIngresa nombre de la materia: ");
		materia2 = sc.nextLine();
		alu9.setMateria(materia2);
		
		System.out.print("\nIngresa matricula: ");
		matricula2 = sc.nextInt();
		alu9.setMatricula(matricula2);
		
		System.out.print("\nIngresa calificacion: ");
		calificacion2 = sc.nextInt();
			if(calificacion2 >= 60){
				alu9.setEstado("Aprobado");
			}
			
			else{
				alu9.setEstado("Reprobado");
			}
		alu9.setCalificacion(calificacion2);
		
		Estudiante alu10 = new Estudiante(" ",0," ",0," ");
		sc.nextLine();
		System.out.print("\nIngresa nombre: ");
		nombre2 = sc.nextLine();
		alu10.setNombre(nombre2);
		
		System.out.print("\nIngresa nombre de la materia: ");
		materia2 = sc.nextLine();
		alu10.setMateria(materia2);
		
		System.out.print("\nIngresa matricula: ");
		matricula2 = sc.nextInt();
		alu10.setMatricula(matricula2);
		
		System.out.print("\nIngresa calificacion: ");
		calificacion2 = sc.nextInt();
			if(calificacion2 >= 60){
				alu10.setEstado("Aprobado");
			}
			
			else{
				alu10.setEstado("Reprobado");
			}
		alu10.setCalificacion(calificacion2);
		
		alu1.imprimirDatos();
		alu2.imprimirDatos();
		alu3.imprimirDatos();
		alu4.imprimirDatos();
		alu5.imprimirDatos();
		
		System.out.print("\nNombre: " + alu6.getNombre() + "\n" + "Matricula: " + alu6.getMatricula() + "\n" + "Materia: " + alu6.getMateria() + "\n" + "Calificacion: " + alu6.getCalificacion() + "\n" + "Estado: " + alu6.getEstado() + "\n" + "\n");
		
		System.out.print("\nNombre: " + alu7.getNombre() + "\n" + "Matricula: " + alu7.getMatricula() + "\n" + "Materia: " + alu7.getMateria() + "\n" + "Calificacion: " + alu7.getCalificacion() + "\n" + "Estado: " + alu7.getEstado() + "\n" + "\n");
	
		System.out.print("\nNombre: " + alu8.getNombre() + "\n" + "Matricula: " + alu8.getMatricula() + "\n" + "Materia: " + alu8.getMateria() + "\n" + "Calificacion: " + alu8.getCalificacion() + "\n" + "Estado: " + alu8.getEstado() + "\n" + "\n");
		
		System.out.print("\nNombre: " + alu9.getNombre() + "\n" + "Matricula: " + alu9.getMatricula() + "\n" + "Materia: " + alu9.getMateria() + "\n" + "Calificacion: " + alu9.getCalificacion() + "\n" + "Estado: " + alu9.getEstado() + "\n" + "\n");
		
		System.out.print("\nNombre: " + alu10.getNombre() + "\n" + "Matricula: " + alu10.getMatricula() + "\n" + "Materia: " + alu10.getMateria() + "\n" + "Calificacion: " + alu10.getCalificacion() + "\n" + "Estado: " + alu10.getEstado() + "\n");
		
	}
}

class Estudiante {
		String nombre, materia, estado;
		int matricula, calificacion;

			public Estudiante(String nombre, int matricula, String materia, int calificacion, String estado){
				this.nombre = nombre;
				this.materia = materia;
				this.estado = estado;
				this.matricula = matricula;
				this.calificacion = calificacion;
			}
			
			public void imprimirDatos(){
				System.out.println("\nNombre: " + nombre + "\n" + "Matricula: " + matricula +"\n" +"Materia: " + materia + "\n" + "Calificacion: " + calificacion + "\n" + "Estado: " + estado + "\n" );
			}
			
			public String getNombre(){
				return nombre;
			}
			
			public void setNombre(String nombre){
				this.nombre = nombre; //recibe datos
			}
			
			public String getMateria(){
				return materia;
			}
			
			public void setMateria(String materia){
				this.materia = materia; 
			}
			
			public String getEstado(){
				return estado;
			}
			
			public void setEstado (String estado){
				this.estado = estado; 
			}
			
			public int getMatricula(){
				return matricula;
			}
			
			public void setMatricula(int matricula){
				this.matricula = matricula; 
			}
			
			public int getCalificacion(){
				return calificacion;
			}
			
			public void setCalificacion(int calificacion){
				this.calificacion = calificacion; 
			}
			
	}
