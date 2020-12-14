public class Exhoras extends Empleados implements Interfaz{

    public Exhoras(String nombre, float salario, float horas, double comision) {
	   super(nombre, salario, horas, comision);
    }  
	
	public void datos(){
		System.out.println("\n\n\t [ Empleado por Horas ]\n" + "\n Los empleados por horas, reciben un sueldo\n" + " por hora y pago por tiempo extra, por todas\n" + " las horas trabajadas que excedan 40 horas. \n");   	
	} 

	public void pago(){
	    System.out.println("\n     > Pago recibido <\n");
	}	

    public Exhoras(){
        this.nombre = "";
        this.salario = 0;
        this.horas = 0;
        this.comision = 0;       
    } 
}