public class Ecomision extends Empleados implements Interfaz{

    public Ecomision(String nombre, float salario, float horas, double comision) {
	   super(nombre, salario, horas, comision);
    }  

	public void datos(){
           System.out.println("\n\n\t [ Empleado por Comision ]\n" + "\n Los empleados por comision, reciben un\n" + " porcentaje de sus ventas.\n");   	
	} 

	public void pago(){
	    System.out.println("\n    > Pago recibido <\n");
	}	

    public Ecomision(){
        this.nombre = "";
        this.salario = 0;
        this.horas = 0;
        this.comision = 0;        
    } 
}