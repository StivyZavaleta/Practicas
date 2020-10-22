/*Practica 4 - POO
  Stivy Zavaleta 1263277
	1. Crear una clase que implemente un personaje del videojuego "Angry Birds". Considere que tipo de atributos y metodos debería tener.
	2. Crear una instancia de 3 "pájaros" y organícelos en un arreglo.
	3. Piense en las características generales que tendría un personaje de pájaro e implemente una clase padre llamada Pájaro.
	4. Implementar subclases para los diferentes personajes considerando sus ataques. Los métodos pueden simplemente imprimir un mensaje en la consola.
	5. Haga un programa para probar sus clases. Tenga en cuenta cómo las subclases pueden usar tanto sus propios métodos como los métodos de su superclase. */

import java.util.*;

public class AngryBirds {
    public static void main(String[] args) {
		
		Random ran = new Random(); //Genera numeros aleatorios.
		
		Mensaje msn = new Mensaje(); 
		
		Amarillo arregloAmarillo[] = new Amarillo[6]; //Primer instancia.
			arregloAmarillo[0] = new Amarillo("Chuck","","","",0,0);
			arregloAmarillo[1] = new Amarillo("","Amarillo","","",0,0);
			arregloAmarillo[2] = new Amarillo("","","Normal","",0,0);
			arregloAmarillo[3] = new Amarillo("","","","Aceleracion",0,0);
			arregloAmarillo[4] = new Amarillo("","","","",30,0);
			arregloAmarillo[5] = new Amarillo("","","","",0,ran.nextInt(200));
			
		Negro arregloNegro[] = new Negro[6]; //Segunda instancia.
			arregloNegro[0] = new Negro("Bomb","","","",0,0);
			arregloNegro[1] = new Negro("","Negro","","",0,0);
			arregloNegro[2] = new Negro("","","Grande","",0,0);
			arregloNegro[3] = new Negro("","","","Explosion",0,0);
			arregloNegro[4] = new Negro("","","","",70,0);
			arregloNegro[5] = new Negro("","","","",0,ran.nextInt(300));
			
		Verde arregloVerde[] = new Verde[6]; //Tercera instancia.
			arregloVerde[0] = new Verde("Hal","","","",0,0);
			arregloVerde[1] = new Verde("","Verde","","",0,0);
			arregloVerde[2] = new Verde("","","Grande","",0,0);
			arregloVerde[3] = new Verde("","","","Boomerang",0,0);
			arregloVerde[4] = new Verde("","","","",50,0);
			arregloVerde[5] = new Verde("","","","",0,ran.nextInt(400));

		msn.Mensaje(); //Se imprime el mensaje
			
		System.out.println( "\n     _____________________" +
							"\n\n\tEL PAJARO VELOZ!" +
							"\n     _____________________" +
							"\n\n Nombre: " + arregloAmarillo[0].getNombre() + 
							"\n Color: " + arregloAmarillo[1].getColor() + 
							"\n Tamano: " + arregloAmarillo[2].getTamano() +
							"\n Poder: " + arregloAmarillo[3].getPoder() +
							"\n Dano: " + arregloAmarillo[4].getDano() +
							"\n Alcance: " + arregloAmarillo[5].getAlcance() + " metros");	
							
		System.out.println( "\n     _____________________" +
							"\n\n      EL PAJARO EXPLOSIVO!" +
							"\n     _____________________" +
							"\n\n Nombre: " + arregloNegro[0].getNombre() + 
							"\n Color: " + arregloNegro[1].getColor() + 
							"\n Tamano: " + arregloNegro[2].getTamano() +
							"\n Poder: " + arregloNegro[3].getPoder() +
							"\n Dano: " + arregloNegro[4].getDano() +
							"\n Alcance: " + arregloNegro[5].getAlcance() + " metros");

		System.out.println( "\n     _____________________" +
							"\n\n     EL PAJARO QUE VUELVE!" +
							"\n     _____________________" +
							"\n\n Nombre: " + arregloVerde[0].getNombre() + 
							"\n Color: " + arregloVerde[1].getColor() + 
							"\n Tamano: " + arregloVerde[2].getTamano() +
							"\n Poder: " + arregloVerde[3].getPoder() +
							"\n Dano: " + arregloVerde[4].getDano() +
							"\n Alcance: " + arregloVerde[5].getAlcance() + " metros");		
	}
}	

class Pajaro { //Clase padre
	String nombre, color, tamano, poder;
	int dano, alcance;
	public Pajaro(String nombre, String color, String tamano, String poder, int dano, int alcance){
		this.nombre = nombre;
		this.color = color;
		this.tamano = tamano;
		this.poder = poder;
		this.dano = dano;
		this.alcance = alcance;	
	}
	public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
	public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }
	public String getPoder() { return poder; }
    public void setPoder(String poder) { this.poder = poder; }
	public int getDano() { return dano; }
	public void setDano(int dano) { this.dano = dano; }			
	public int getAlcance() { return alcance; }
    public void setAlcance(int alcance) { this.alcance = alcance; }	
}

class Amarillo extends Pajaro { //Clase hija del pajaro amarillo.
	public Amarillo(String nombre, String color, String tamano, String poder, int dano, int alcance){
		super(nombre, color, tamano, poder, dano, alcance);
	}		
}	

class Negro extends Pajaro { //Clase hija del pajaro negro.
	public Negro(String nombre, String color, String tamano, String poder, int dano, int alcance){
		super(nombre, color, tamano, poder, dano, alcance);
	}
}

class Verde extends Pajaro { //Clase hija del pajaro verde.
	public Verde(String nombre, String color, String tamano, String poder, int dano, int alcance){
		super(nombre, color, tamano, poder, dano, alcance);
	}
}

class Mensaje{	
	public void Mensaje(){
				System.out.println("\n\t\t  > ANGRY BIRDS <" + 
									"\n\n Estos son algunos de los personajes disponibles en el juego." + 
									"\n Estan divididos por color, tamano, poder, dano y alcance" +
									"\n El alcance es aleatorio en cada juego, aprovecha eso!");
	}
}