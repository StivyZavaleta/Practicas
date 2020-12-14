public class Empleados implements Interfaz{

	String nombre;
    float salario, horas;
	double comision;

	public Empleados(String nombre, float salario, float horas, double comision){
		this.nombre = nombre;
		this.salario = salario;
		this.horas = horas;	
		this.comision = comision;						
	}      

	public void datos(){
	    System.out.println("\n Tipos de empleados");
	}
    
	public void pago(){
	    System.out.println("\n Pago recibido");
	}	

	public void setNombre(String nombre){this.nombre = nombre;}
	public String getNombre(){return nombre;}

	public void setHoras(float horas){this.horas = horas;}
	public float getHoras(){return horas;}	

	public void setComision(double comision){this.comision = comision;}
	public double getComision(){
		salario= 1300;
		comision = salario*.30;
		return comision;
	}

	public void setSalario(float salario){this.salario = salario;}
	public float getSalario(){
		salario = 1300;	

		if(horas > 0){
			salario = salario + (80*horas);
		}
		else{
			salario = 1300;
		}
		return salario;
	}

    public Empleados(){
        this.nombre = "";
        this.salario = 0;
        this.horas = 0;
        this.comision = 0;
    } 
}