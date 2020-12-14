public class MiniRobot1 extends Robot implements Interfaz{

    public MiniRobot1(String nombre) {
	   super(nombre);
    }  
	
	public void datos(){
           System.out.println("\n\t\t[ DESCRIPCION ]\n\n El mini robot ayudante 1 es un Robot Chef\n" +" capaz de preparar la carne y las verduras, pero \n" +" completamente inutil para cocinarlo o servirlo.\n");   	
	} 

	public void picar(){
	    System.out.println("\n > Picar y preparar ingredientes");
	}

    public MiniRobot1(){
        this.nombre = "";
    } 
}
