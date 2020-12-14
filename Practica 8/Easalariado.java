public class Easalariado extends Empleados implements Interfaz{

    public Easalariado(String nombre, float salario, float horas, double comision) {
	   super(nombre, salario, horas, comision);
    }  

	public void datos(){
		System.out.println("\n\n\t [ Empleado Asalariado ]\n" + "\n Los empleados asalariados, reciben un salario semanal\n" + " fijo, sin importar el numero de horas trabajadas.\n");   	
	}  

	public void pago(){
	    System.out.println("\n    > Pago recibido <\n");
	}	

    public Easalariado(){
        this.nombre = "";
        this.salario = 0;
        this.horas = 0;
        this.comision = 0;       
    } 
}