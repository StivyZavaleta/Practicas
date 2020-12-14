public class Robot implements Interfaz{
	
	String nombre;

	public Robot(String nombre){
		this.nombre = nombre;
	}      

	public void datos(){
		System.out.println("\n\t\t[ DESCRIPCION ]\n\n Magnum Opus es un Robot Chef capaz de cortar,\n" +" picar  verduras y carne, cocinar un buen guiso\n" +" con los ingredientes y servirlo en un tazon.\n");		
	}

	public void picar(){ 
	    System.out.println("\n > Preparar ingredientes");
	}
 	
	public void cocinar(){   
	    System.out.println("\n > Cocinar");	
	}

	public void servir(){  
	    System.out.println("\n > Servir platillo");	
	}

	public void setNombre(String nombre){this.nombre = nombre;}
	public String getNombre(){return nombre;}

    public Robot(){
		this.nombre = "";
    } 
}
