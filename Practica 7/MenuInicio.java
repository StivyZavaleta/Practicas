/*Practica 7 - POO
  Stivy Zavaleta 1263277
1. Haz un menú en el que puedas seleccionar un robot para controlar y, después de eso, la acción que quieres
   que realice. Todos ellos prepararán el mismo plato y, como tal, deberás coordinarlos con cuidado. No se
   puede cocinar sin los ingredientes preparados y no se puede servir un plato que no esté cocido.
2. Si sigue el procedimiento correctamente (preparar ingredientes -> cocinar -> servir), imprimirá un mensaje
   que dice "¡Hurra! El plato estaba delicioso".
3. si se perdió uno de los primeros 2 pasos o si un robot hizo algo que no es capaz de imprimir un mensaje de
   error personalizado.*/

import java.util.Scanner; //Libreria Scanner
import java.util.InputMismatchException; //Libreria para no letras

public class MenuInicio{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false; //Salir del programa
		boolean salir2 = false; //Regresar 
		boolean salir3 = false; //Regresar    
		boolean salir4 = false; //Regresar        
		int opcion;

		Robot rob1 = new Robot("Magnum Opus");
		MiniRobot1 rob2 = new MiniRobot1("Robot ayudante 1");  
		MiniRobot2 rob3 = new MiniRobot2("Robot ayudante 2");  

		System.out.print("\n _______________________");
		System.out.print("\n\n   >   ROBOTS CHEF   <");	
	    System.out.print("\n _______________________");
	    System.out.print("\n\nPresiona ENTER para continuar...");	
	    sc.nextLine();

		while(!salir){  
			System.out.println("\n\t [ ROBOTS ]\n");
			System.out.println("1. Usar Magnum Opus");
			System.out.println("2. Usar Robot ayudante 1");
			System.out.println("3. Usar Robot ayudante 2");
			System.out.println("4. Salir de ROBOTS CHEF");     
			
			try{ 
				System.out.print("\nElije un robot: ");
				opcion = sc.nextInt();
				sc.nextLine();

				switch(opcion){ 
					case 1: System.out.print("\n ___________________");
							System.out.print("\n\n   > Magnum Opus <");
							System.out.print("\n ___________________");
							System.out.print("\n\n Presiona ENTER para conocer a Magnum Opus...");
							sc.nextLine();

							System.out.println("\n\t [ HABILIDAD ]");
							rob1.picar();	 
							rob1.cocinar();	
							rob1.servir();  
							
							if (rob1 instanceof Robot)
							((Robot) rob1 ).datos();

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir2){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

							    try{
									System.out.print("\n Elige una opcion: ");
									opcion = sc.nextInt();
									sc.nextLine();

									switch(opcion){ 
										case 1: System.out.println("\n " + rob1.getNombre() + " esta preparando los ingredientes...  ");   
												sc.nextLine();                 
												System.out.println("\n " + rob1.getNombre() + " esta cocinando... ");
												sc.nextLine();                       
												System.out.println("\n " + rob1.getNombre() + " esta sirviendo el platillo... ");
												sc.nextLine();    
												System.out.println("\n El platillo esta TERMINADO!!!  ");  
												System.out.println("\n HURRA!!! - El platillo estaba delicioso!");
											    System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                   
												break;
									
										case 2: salir2 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ //NO escribir letras//
										System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
										System.out.println("Presiona ENTER para continuar...");	
										sc.nextLine();
								}
							} 
							break;

					case 2: System.out.print("\n __________________________");
							System.out.print("\n\n      Robot Ayudante 1");
							System.out.print("\n __________________________");
						    System.out.print("\n\n Presiona ENTER para conocer al Robot Ayudante...");
						    sc.nextLine();
							
							System.out.println("\n\t [ HABILIDAD ]");
							rob2.picar();	 
							if (rob2 instanceof MiniRobot1)
							((MiniRobot1) rob2 ).datos(); 

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir3){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

								try{
									System.out.print("\n Elige una opcion: ");
									opcion = sc.nextInt();
									sc.nextLine();

									switch(opcion){ 
										case 1: System.out.println("\n " + rob2.getNombre() + " esta preparando los ingredientes...");   
												sc.nextLine();                 
												System.out.println("\n " + rob2.getNombre() + " solo puede picar!!");
												sc.nextLine();                       
												System.out.println("\n El platillo NO esta terminado!!!");
												System.out.println("\n Necesitamos ayuda!");
												System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                      
												break;
									
										case 2: salir3 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ //NO escribir letras//
									System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
									System.out.println("Presiona ENTER para continuar...");	
									sc.nextLine();
								}
							} 
							break;  

					case 3: System.out.print("\n __________________________");
					        System.out.print("\n\n      Robot Ayudante 2");
							System.out.print("\n __________________________");
						    System.out.print("\n\n Presiona ENTER para conocer al robot ayudante...");
						    sc.nextLine();

							System.out.println("\n\t [ HABILIDAD ]");
							rob3.cocinar();	  
							if (rob3 instanceof MiniRobot2)
							((MiniRobot2) rob3 ).datos(); 

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir4){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

							    try{
									System.out.print("\n Elige una opcion: ");
								    opcion = sc.nextInt();
								    sc.nextLine();

								    switch(opcion){ 
										case 1: System.out.println("\n " + rob3.getNombre() + " no puede preparar los ingredientes...  ");   
												sc.nextLine(); 
												System.out.println("\n " + rob3.getNombre() + " solo puede cocinar!!");
												sc.nextLine();  
												System.out.println("\n El platillo NO esta terminado!!");  
												System.out.println("\n Necesitamos ayuda!");
												System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                      
												break;
									
										case 2: salir4 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ //NO escribir letras//
									System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
									System.out.println("Presiona ENTER para continuar...");	
									sc.nextLine();
								}
							} 
							break;

					case 4: salir = true; 
							break;

					default: System.out.println("Favor de elegir una opcion entre 1 y 4");
				}
			}
			
			catch(InputMismatchException e){ //NO escribir letras//
				System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
				System.out.println("Presiona ENTER para continuar...");	
				sc.nextLine();
			}
		}
	}
} 