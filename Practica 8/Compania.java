/*Practica 7 - POO
  Stivy Zavaleta 1263277
Una compañía paga a sus empleados por semana los empleados son de cuatro tipos:
- Empleados asalariados que reciben un salario semanal fijo, sin importar el número de horas
  trabajadas.
- Empleados por horas, que reciben un sueldo por hora y pago por tiempo extra, por todas las horas
  trabajadas que excedan 40 horas.
- Empleados por comisión, que recién un porcentaje de sus ventas.
- Empleados asalariados por comisión, que reciben un salario base más un porcentaje de sus
  ventas.
Para este periodo de pago, la compañía ha decidido recompensar a los empleados asalariados por
comisión, agregando un 10% a sus salarios base. La compañía desea implementar una aplicación en Java
que realice sus cálculos de nómina en forma polimórfica. */

import java.util.Scanner;

public class Compania{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
	
    boolean salir = false;
    int opcion;
      
    Empleados emp1 = new Easalariado();  
    Empleados emp2 = new Exhoras();  
    Empleados emp3 = new Ecomision();     
    Empleados emp4 = new Easalaxcomi();

	System.out.print("\n\t _______________________");
	System.out.print("\n\n\t     >   COMPANIA   <");	
	System.out.print("\n\t _______________________");
	System.out.print("\n _______________________________________");
	System.out.print("\n\n");

		while(!salir){ 
			 System.out.println("\n\t [ EMPLEADOS ]\n");
			 System.out.println(" 1. Empleado asalariado.");
			 System.out.println(" 2. Empleado por horas.");
			 System.out.println(" 3. Empleado por comision.");
			 System.out.println(" 4. Empleado asalariado por comision.");
			 System.out.println(" 5. Salir.");          

				 System.out.print("\n Seleccione su tipo de empleado: ");
				 opcion = sc.nextInt();
				 sc.nextLine();

					switch(opcion){ 
						case 1: if (emp1 instanceof Empleados)
								((Empleados) emp1 ).datos();

								System.out.print("\nIngrese su nombre: ");  
								Scanner nom1 = new Scanner(System.in);
								emp1.setNombre(nom1.next());

								System.out.print("\n\n");

								System.out.println("\t [ PAGO ]");
								System.out.println("\n Nombre: " + emp1.getNombre());
								System.out.println("\n Salario de la semana: " + emp1.getSalario());              
								emp1.pago();
								
								break; 

					   case 2: if (emp2 instanceof Empleados)
							   ((Empleados) emp2 ).datos();

							   System.out.print("\nIngrese su nombre: ");  
							   Scanner nom2 = new Scanner(System.in);
							   emp2.setNombre(nom2.next());
							   
							   System.out.print("\n\n");

							   System.out.println("\t [ PAGO ]");
							   System.out.println("\n Nombre: " + emp2.getNombre());
							   System.out.print("\nIngresa numero de horas trabajadas: ");  
							   Scanner hour = new Scanner(System.in);
							   emp2.setHoras(hour.nextFloat());
							   System.out.println("\n Salario de la semana: " + emp2.getSalario());              
							   emp2.pago();
							   
							   break;

					   case 3: if (emp3 instanceof Empleados)
							   ((Empleados) emp3 ).datos();

							   System.out.print("\nIngrese su nombre: ");  
							   Scanner nom3 = new Scanner(System.in);
							   emp3.setNombre(nom3.next());

							   System.out.print("\n\n");

							   System.out.println("\t [ PAGO ]");
							   System.out.println("\n Nombre: " + emp3.getNombre());
							   System.out.println("\n Comision: " + emp3.getComision());              
							   emp3.pago();
							   
							   break; 

					   case 4: if (emp4 instanceof Empleados)
							   ((Empleados) emp4 ).datos();

							   System.out.print("\nIngrese su nombre: ");  
							   Scanner nom4 = new Scanner(System.in);
							   emp4.setNombre(nom4.next());

							   System.out.print("\n\n");

							   System.out.println("\t [ PAGO ]");
							   System.out.println("\n Nombre: " + emp4.getNombre());
							   System.out.println("\n Salario: " + emp4.getSalario());              
							   System.out.println("\n Comision: " + emp4.getComision());                         
							   emp4.pago();
							
							   break; 

					   case 5: salir = true; 
							   break;

					   default: System.out.println("Favor de elejir una opcion entre 1 y 5");
					}
		}
	}
}