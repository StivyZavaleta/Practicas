public class Easalaxcomi extends Empleados implements Interfaz{

    public Easalaxcomi(String nombre, float salario, float horas, double comision){
	   super(nombre, salario, horas, comision);
    }  

	public void datos(){ 
		System.out.println("\n\n     [ Empleado Asalariado por Comision ]\n" + "\n Los empleados asalariados por comision, reciben\n" + " un salario base mas un porcentaje de sus ventas.\n");   	
	} 

	public void pago(){
		double suma = salario + comision;

		System.out.println("\n TOTAL = " + suma);
		System.out.println("\n     > Pago recibido <\n");
	}	

    public Easalaxcomi(){
        this.nombre = "";
        this.salario = 0;
        this.horas = 0;
        this.comision = 0;       
    } 
}