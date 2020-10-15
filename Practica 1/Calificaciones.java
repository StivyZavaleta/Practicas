/*Practica 1 - POO
  Stivy Zavaleta 1263277
	Hacer un menú que contenga las siguientes las siguientes opciones.
	1 Captura de nombre y calificaciones	
	2 Imprimir calificaciones y promedio de calificaciones	
	3 Imprimir calificaciones y calificación más baja
	4 Imprimir calificaciones y calificación más alta
	5 Salir */

import java.util.*; //Libreria de Scanner

public class Calificaciones { //Mi class main
	public static void main (String args[]) { 
	
	String nombre;
	int calif[] = new int[7], suma = 0, opcion, mayor = 0, menor = 99999;
	float promedio;
	boolean salir = false;
	Scanner sc = new Scanner (System.in); 
		
		System.out.print("\nNombre del Alumno: ");
		nombre = sc.nextLine(); //Captura el nombre
	
		System.out.print("\nIngrese calificaciones\n");
	
		System.out.print("\nEcuaciones Diferenciales: ");
		calif[0] = sc.nextInt();
	
		System.out.print("Circuitos: ");
		calif[1] = sc.nextInt();
	
		System.out.print("Matematicas Avanzadas: ");
		calif[2] = sc.nextInt();
	
		System.out.print("Mediciones Electricas y Electronicas: ");
		calif[3] = sc.nextInt();
	
		System.out.print("Taller de Sistema Operativo Unix: ");
		calif[4] = sc.nextInt(); //Captura las calificaciones
		
		System.out.print("Programacion Estructurada: ");
		calif[5] = sc.nextInt();
		
		System.out.print("Ingles V: ");
		calif[6] = sc.nextInt();
		
		for(int i = 0; i < calif.length; i++){
			suma += calif[i]; //Suma la calificaciones (los arreglos)
		} 
	
	while(!salir){ //Mientras no se eliga la opcion de salir se seguira ejecutando el menu
	
		System.out.println("\n1. Datos del Alumno\n" + "2. Promedio de calificaciones\n" 
		+ "3. Calificacion mas baja\n" + "4. Calificacion mas alta\n" + "5. Salir" + "\n");
		opcion = sc.nextInt(); //Se captura el numero que se teclee en opcion
		
			switch(opcion){ //Inicia el menu
				case 1: System.out.println("\nAlumno: " + nombre);
						System.out.println("Calificaciones: \n" + "		Ecuaciones Diferenciales: " + calif[0] + "\n" 
						+ "		Circuitos: " + calif[1] + "\n" + "		Matematicas Avanzadas: " + calif[2] + "\n" 
						+ "		Mediciones Electricas y Electronicas: " + calif[3] + "\n" + "		Taller de Sistema Operativo Unix: " + calif[4] + "\n" + "		Programacion Estructurada: " + calif[5] + "\n" + "		Ingles V: " + calif[6]);
						break; //Imprime los datos del Alumno (su nombre y sus calificaciones)
			
				case 2: System.out.println("\nCalificaciones: \n" + "		Ecuaciones Diferenciales: " + calif[0] + "\n" 
						+ "		Circuitos: " + calif[1] + "\n" + "		Matematicas Avanzadas: " + calif[2] + "\n" 
						+ "		Mediciones Electricas y Electronicas: " + calif[3] + "\n" + "		Taller de Sistema Operativo Unix: " + calif[4] + "\n" + "		Programacion Estructurada: " + calif[5] + "\n" + "		Ingles V: " + calif[6]);
						
						promedio = (suma/calif.length);
						
						System.out.println("\nSu promedio es: " + promedio);
						break; //Imprime el promedio
			
				case 3: System.out.println("\nCalificaciones: \n" + "		Ecuaciones Diferenciales: " + calif[0] + "\n" 
						+ "		Circuitos: " + calif[1] + "\n" + "		Matematicas Avanzadas: " + calif[2] + "\n" 
						+ "		Mediciones Electricas y Electronicas: " + calif[3] + "\n" + "		Taller de Sistema Operativo Unix: " + calif[4] + "\n" + "		Programacion Estructurada: " + calif[5] + "\n" + "		Ingles V: " + calif[6]);
						
						for (int i = 0; i < calif.length; i++){
							if(calif[i] < menor){
								menor = calif[i];
							}
						}
						
						System.out.println("\nLa calificacion mas baja es: " + menor);
						break;
					
							
				
				case 4: System.out.println("\nCalificaciones: \n" + "		Ecuaciones Diferenciales: " + calif[0] + "\n" 
						+ "		Circuitos: " + calif[1] + "\n" + "		Matematicas Avanzadas: " + calif[2] + "\n" 
						+ "		Mediciones Electricas y Electronicas: " + calif[3] + "\n" + "		Taller de Sistema Operativo Unix: " + calif[4] + "\n" + "		Programacion Estructurada: " + calif[5] + "\n" + "		Ingles V: " + calif[6]);
				
						for (int i = 0; i < calif.length; i++){
							if(calif[i] > mayor){
								mayor = calif[i];
							}
						}
						
						System.out.println("\nLa calificacion mas alta es: " + mayor);
						break;
						
				case 5: salir = true;
						break;
				
				default: System.out.println("\nElige una opcion entre 1 y 5");
			}
		
		}
	
		sc.close();
	} 

}