public class MiniRobot2 extends Robot implements Interfaz{

    public MiniRobot2(String nombre){
	   super(nombre);
    }  
	
	public void datos(){ 
           System.out.println("\n\t     [ DESCRIPCION ]\n\n El mini robot ayudante 2 es un Robot Chef\n" + " capaz de cocinar a la temperatura adecuadan\n" + " pero terrible con cuchillos o para servir.\n");   	
	} 

	public void cocinar(){
	    System.out.println("\n > Cocinar");	
	}

    public MiniRobot2(){
        this.nombre = "";
    } 
}
