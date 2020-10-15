/*Practica 3 - POO
  Stivy Zavaleta 1263277
1. Crear una clase llamada "Persona" que contenga un nombre, CURP, y RFC.
2. Implementar un algoritmo para calcular el CURP y RFC de una persona física.
3. Investigar las reglas oficiales para calcular el CURP y RFC a partir de los datos de una persona tales como:
   Nombre(s), Apellido Paterno, Apellido Materno, Fecha de Nacimiento.
4. Los últimos 3 caracteres del RFC correspondiente a la homoclave se generarán de manera aleatoria.
5. Los últimos 2 caracteres del CURP se generarán de manera aleatoria.
6. El programa deberá de solicitar los datos necesarios como nombre y fecha de nacimiento para poder generar el CURP y RFC.
7. El programa deberá crear y mostrar 3 objetos:
	Para el objeto 1 solo se generará el CURP.
	Para el objeto 2 solo se generará el RFC.
	Para el objeto 3 se generarán ambos datos (CURP Y RFC).*/

import java.util.*; //Libreria de Scanner

public class Personas {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int opcion ;
	boolean salir = false;
	char letra14 = 0, letra15 = 0, letra16 = 0;
	String nombre2 = " ", apepaterno2 = " ", apematerno2 = " ", ano2, mes2, dia2, sexo2, estado2, curp2, rfc2;
	
		//Objeto 1
		Persona per1 = new Persona(" "," "," "," "," "," "," "," "," "," ");
		
		//Objeto 2
		Persona per2 = new Persona(" "," "," "," "," "," "," "," "," "," ");
		
		//Objeto 3
		Persona per3 = new Persona(" "," "," "," "," "," "," "," "," "," ");
	
		//Numeros aleatorios para curp y rfc		
		int numero = (int) (Math.random()*9+1);
		String n = String.valueOf(numero);
		char letra17 = n.charAt(0);
        
		numero = (int) (Math.random()*9+1);
		String b = String.valueOf(numero);
		char letra18 = b.charAt(0);
	
		int num = (int) (Math.random()*9+1);
		String m = String.valueOf(num);
		char c14 = m.charAt(0);
        
		num = (int) (Math.random()*9+1);
		String a = String.valueOf(num);        
		char c15 = a.charAt(0);
						
		num = (int) (Math.random()*9+1);
		String c = String.valueOf(num);
		char c16 = c.charAt(0);
		//Fin de los numeros aleatorios
	
	while(!salir){
			
		System.out.println("\nFAVOR DE LLENAR LAS RESPUESTAS CON MAYUSCULAS, GRACIAS");	
		System.out.println("\n1. Imprimir CURP\n" + "2. Imprimir RFC\n" + "3. Imprimir CURP y RFC\n" + "4. Salir" + "\n");
		opcion = sc.nextInt();
		
		switch(opcion){ //Inicia el menu
				case 1: sc.nextLine();
						System.out.print("\nIngresa nombre: ");
						nombre2 = sc.nextLine();
						per1.setNombre(nombre2);
		
						System.out.print("\nIngresa apellido paterno: ");
						apepaterno2 = sc.nextLine();
						per1.setApepaterno(apepaterno2);
		
						System.out.print("\nIngresa apellido materno: ");
						apematerno2 = sc.nextLine();
						per1.setApematerno(apematerno2);
		
						System.out.print("\nIngresa fecha de nacimiento\n ");
						System.out.print("\nAno: ");
						ano2 = sc.nextLine();
						per1.setAno(ano2);
						System.out.print("\nMes: ");
						mes2 = sc.nextLine();
						switch(mes2){
							case "ENERO": mes2 = "01"; break;
							case "FEBRERO": mes2 = "02"; break;
							case "MARZO": mes2 = "03"; break;
							case "ABRIL": mes2 = "04"; break;
							case "MAYO": mes2 = "05"; break;
							case "JUNIO": mes2 = "06"; break;
							case "JULIO": mes2 = "07"; break;
							case "AGOSTO": mes2 = "08"; break;
							case "SEPTIEMBRE": mes2 = "09"; break;
							case "OCTUBRE": mes2 = "10"; break;
							case "NOVIEMBRE": mes2 = "11"; break;
							case "DICIEMBRE": mes2 = "12"; break;
							default: System.out.println("El mes esta incorrecto, intente de nuevo");
						}		
						per1.setMes(mes2);
						System.out.print("\nDia: ");
						dia2 = sc.nextLine();
						per1.setDia(dia2);
		
						System.out.print("\nSexo: ");
						sexo2 = sc.nextLine();
						per1.setSexo(sexo2);
		
						System.out.print("\nEstado de nacimiento: ");
						estado2 = sc.nextLine();
						switch(estado2){
							case "AGUAS CALIENTES": estado2 = "AS"; break;
							case "BAJA CALIFORNIA": estado2 = "BC"; break;
							case "BAJA CALIFORNIA SUR": estado2 = "BS"; break;
							case "CAMPECHE": estado2 = "CC"; break;
							case "COAHUILA": estado2 = "CL"; break;
							case "COLIMA": estado2 = "CM"; break;
							case "CHIAPAS": estado2 = "CS"; break;
							case "CHIHUAHUA": estado2 = "CH"; break;
							case "DISTRITO FEDERAL": estado2 = "DF"; break;
							case "DURANGO": estado2 = "DG"; break;
							case "GUANAJUATO": estado2 = "GT"; break;
							case "GUERRERO": estado2 = "GR"; break;
							case "HIDALGO": estado2 = "HG"; break;
							case "JALISCO": estado2 = "JC"; break;
							case "ESTADO DE MEXICO": estado2 = "MC"; break;
							case "MICHOACAN": estado2 = "MN"; break;
							case "MORELOS": estado2 = "MS"; break;
							case "NAYARIT": estado2 = "NT"; break;
							case "NUEVO LEON": estado2 = "NL"; break;
							case "OAXACA": estado2 = "OC"; break;
							case "PUEBLA": estado2 = "PL"; break;
							case "QUERETARO": estado2 = "QT"; break;
							case "QUINTANA ROO": estado2 = "QR"; break;
							case "SAN LUIS POTOSI": estado2 = "SP"; break;
							case "SINALOA": estado2 = "SL"; break;
							case "SONORA": estado2 = "SR"; break;
							case "TABASCO": estado2 = "TC"; break;
							case "TAMAULIPAS": estado2 = "TS"; break;
							case "TLAXCALA": estado2 = "TL"; break;
							case "VERACRUZ": estado2 = "VZ"; break;
							case "YUCATAN": estado2 = "YN"; break;
							case "ZACATECAS": estado2 = "ZS"; break; 
							default: System.out.println("El estado esta incorrecto, intente de nuevo");
						}
						per1.setEstado(estado2);
						
						//Creacion de curp
						curp2 = apepaterno2.trim().substring(0,2);
						curp2 = curp2.concat(apematerno2.trim().substring(0,1));
						curp2 = curp2.concat(nombre2.trim().substring(0,1));
						curp2 = curp2.concat(ano2.substring(2,4));
						curp2 = curp2.concat(mes2);
						curp2 = curp2.concat(dia2);
						curp2 = curp2.concat(sexo2.trim().substring(0,1));
						curp2 = curp2.concat(estado2);
						per1.setCurp(curp2);
						
						//letras faltantes de la curp
						for (int i = 1; i < apepaterno2.length(); i++) {
						char l = apepaterno2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra14 = l;
							}
						}
			
						for (int i = 1; i < apematerno2.length(); i++) {
						char l = apematerno2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra15 = l;
							}
						}
						
						for (int i = 1; i < nombre2.length(); i++) {
						char l = nombre2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra16 = l;
							}
						}
						
						System.out.println("\nSu CURP es: " + per1.getCurp().toUpperCase() + letra14 + letra15 + letra16 + letra17 + letra18 +"\n");
						break;
				
				case 2: sc.nextLine();
						System.out.print("\nIngresa nombre: ");
						nombre2 = sc.nextLine();
						per2.setNombre(nombre2);
		
						System.out.print("\nIngresa apellido paterno: ");
						apepaterno2 = sc.nextLine();
						per2.setApepaterno(apepaterno2);
						
						System.out.print("\nIngresa apellido materno: ");
						apematerno2 = sc.nextLine();
						per2.setApematerno(apematerno2);
						
						System.out.print("\nIngresa fecha de nacimiento \n");
						System.out.print("\nAno: ");
						ano2 = sc.nextLine();
						per2.setAno(ano2);
						System.out.print("\nMes: ");
						mes2 = sc.nextLine();
						switch(mes2){
							case "ENERO": mes2 = "01"; break;
							case "FEBRERO": mes2 = "02"; break;
							case "MARZO": mes2 = "03"; break;
							case "ABRIL": mes2 = "04"; break;
							case "MAYO": mes2 = "05"; break;
							case "JUNIO": mes2 = "06"; break;
							case "JULIO": mes2 = "07"; break;
							case "AGOSTO": mes2 = "08"; break;
							case "SEPTIEMBRE": mes2 = "09"; break;
							case "OCTUBRE": mes2 = "10"; break;
							case "NOVIEMBRE": mes2 = "11"; break;
							case "DICIEMBRE": mes2 = "12"; break;
							default: System.out.println("El mes esta incorrecto, intente de nuevo");
						}
						per1.setMes(mes2);
						System.out.print("\nDia: ");
						dia2 = sc.nextLine();
						per2.setDia(dia2);	
						
						//Creacion del rfc
						rfc2 = apepaterno2.trim().substring(0,2);
						rfc2 = rfc2.concat(apematerno2.trim().substring(0,1));
						rfc2 = rfc2.concat(nombre2.trim().substring(0,1));
						rfc2 = rfc2.concat(ano2.substring(2,4));
						rfc2 = rfc2.concat(mes2);
						rfc2 = rfc2.concat(dia2);
						per2.setRfc(rfc2);
						
						System.out.println("\nSu RFC es: " + per2.getRfc().toUpperCase() + c14 + c15 + c16 + "\n");
						
						break;
				
				case 3: sc.nextLine();
						System.out.print("\nIngresa nombre: ");
						nombre2 = sc.nextLine();
						per3.setNombre(nombre2);
						
						System.out.print("\nIngresa apellido paterno: ");
						apepaterno2 = sc.nextLine();
						per3.setApepaterno(apepaterno2);
						
						System.out.print("\nIngresa apellido materno: ");
						apematerno2 = sc.nextLine();
						per3.setApematerno(apematerno2);
						
						System.out.print("\nIngresa fecha de nacimiento \n");
						System.out.print("\nAno: ");
						ano2 = sc.nextLine();
						per3.setAno(ano2);
						System.out.print("\nMes: ");
						mes2 = sc.nextLine();
						switch(mes2){
							case "ENERO": mes2 = "01"; break;
							case "FEBRERO": mes2 = "02"; break;
							case "MARZO": mes2 = "03"; break;
							case "ABRIL": mes2 = "04"; break;
							case "MAYO": mes2 = "05"; break;
							case "JUNIO": mes2 = "06"; break;
							case "JULIO": mes2 = "07"; break;
							case "AGOSTO": mes2 = "08"; break;
							case "SEPTIEMBRE": mes2 = "09"; break;
							case "OCTUBRE": mes2 = "10"; break;
							case "NOVIEMBRE": mes2 = "11"; break;
							case "DICIEMBRE": mes2 = "12"; break;
							default: System.out.println("El mes esta incorrecto, intente de nuevo");
						}
						per3.setMes(mes2);
						System.out.print("\nDia: ");
						dia2 = sc.nextLine();
						per3.setDia(dia2);
						
						System.out.print("\nSexo: ");
						sexo2 = sc.nextLine();
						per3.setSexo(sexo2);
						
						System.out.print("\nEstado de nacimiento: ");
						estado2 = sc.nextLine();
						switch(estado2){
							case "AGUAS CALIENTES": estado2 = "AS"; break;
							case "BAJA CALIFORNIA": estado2 = "BC"; break;
							case "BAJA CALIFORNIA SUR": estado2 = "BS"; break;
							case "CAMPECHE": estado2 = "CC"; break;
							case "COAHUILA": estado2 = "CL"; break;
							case "COLIMA": estado2 = "CM"; break;
							case "CHIAPAS": estado2 = "CS"; break;
							case "CHIHUAHUA": estado2 = "CH"; break;
							case "DISTRITO FEDERAL": estado2 = "DF"; break;
							case "DURANGO": estado2 = "DG"; break;
							case "GUANAJUATO": estado2 = "GT"; break;
							case "GUERRERO": estado2 = "GR"; break;
							case "HIDALGO": estado2 = "HG"; break;
							case "JALISCO": estado2 = "JC"; break;
							case "ESTADO DE MEXICO": estado2 = "MC"; break;
							case "MICHOACAN": estado2 = "MN"; break;
							case "MORELOS": estado2 = "MS"; break;
							case "NAYARIT": estado2 = "NT"; break;
							case "NUEVO LEON": estado2 = "NL"; break;
							case "OAXACA": estado2 = "OC"; break;
							case "PUEBLA": estado2 = "PL"; break;
							case "QUERETARO": estado2 = "QT"; break;
							case "QUINTANA ROO": estado2 = "QR"; break;
							case "SAN LUIS POTOSI": estado2 = "SP"; break;
							case "SINALOA": estado2 = "SL"; break;
							case "SONORA": estado2 = "SR"; break;
							case "TABASCO": estado2 = "TC"; break;
							case "TAMAULIPAS": estado2 = "TS"; break;
							case "TLAXCALA": estado2 = "TL"; break;
							case "VERACRUZ": estado2 = "VZ"; break;
							case "YUCATAN": estado2 = "YN"; break;
							case "ZACATECAS": estado2 = "ZS"; break; 
							default: System.out.println("El estado esta incorrecto, intente de nuevo");
						}
						per3.setEstado(estado2);
										
						//Creacion de curp
						curp2 = apepaterno2.trim().substring(0,2);
						curp2 = curp2.concat(apematerno2.trim().substring(0,1));
						curp2 = curp2.concat(nombre2.trim().substring(0,1));
						curp2 = curp2.concat(ano2.substring(2,4));
						curp2 = curp2.concat(mes2);
						curp2 = curp2.concat(dia2);
						curp2 = curp2.concat(sexo2.trim().substring(0,1));
						curp2 = curp2.concat(estado2);
						per3.setCurp(curp2);
						
						//Creacion de rfc
						rfc2 = apepaterno2.trim().substring(0,2);
						rfc2 = rfc2.concat(apematerno2.trim().substring(0,1));
						rfc2 = rfc2.concat(nombre2.trim().substring(0,1));
						rfc2 = rfc2.concat(ano2.substring(2,4));
						rfc2 = rfc2.concat(mes2);
						rfc2 = rfc2.concat(dia2);
						per3.setRfc(rfc2);
						
						for (int i = 1; i < apepaterno2.length(); i++) {
						char l = apepaterno2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra14 = l;
							}
						}	
							
						for (int i = 1; i < apematerno2.length(); i++) {
						char l = apematerno2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra15 = l;
							}
						}
										
						for (int i = 1; i < nombre2.length(); i++) {
						char l = nombre2.charAt(i);
						if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
						letra16 = l;
							}
						}
						
						System.out.println("\nCURP: " + per3.getCurp().toUpperCase() + letra14 + letra15 + letra16 + letra17 + letra18);
				
						System.out.println("RFC: " + per3.getRfc().toUpperCase() + c14 + c15 + c16 + "\n");
						break;
				
				case 4: salir = true;
						break;
						
				default: System.out.println("\nElige una opcion entre 1 y 4");		
			}	
		}	
			sc.close();
	}  
}

class Persona{
	
	String nombre, apepaterno, apematerno, ano, mes, dia, sexo, estado, curp, rfc;
	
		public Persona(String nombre, String apepaterno, String apematerno, String ano, String mes, String dia, String sexo, String estado, String curp, String rfc){
			this.nombre = nombre;
			this.apepaterno = apepaterno;
			this.apematerno = apematerno;
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
			this.sexo = sexo;
			this.estado = estado;
			this.curp = curp;
			this.rfc = rfc;
			
		}
		
		public String getNombre(){
				return nombre;
			}
			
		public void setNombre(String nombre){
				this.nombre = nombre; //recibe datos
			}
			
		public String getApepaterno(){
				return apepaterno;
			}
			
		public void setApepaterno(String apepaterno){
				this.apepaterno = apepaterno; 
			}
			
		public String getApematerno(){
				return apematerno;
			}
			
		public void setApematerno (String apematerno){
				this.apematerno = apematerno; 
			}
			
		public String getAno(){
				return ano;
			}
			
		public void setAno(String ano){
				this.ano = ano; 
			}
			
		public String getMes(){
				return mes;
			}
			
		public void setMes(String mes){
				this.mes = mes; 
			}
			
		public String getDia(){
				return dia;
			}
			
		public void setDia(String dia){
				this.dia = dia; //recibe datos
			}
			
		public String getSexo(){
				return sexo;
			}
		public void setSexo(String sexo){
				this.sexo = sexo;
			}
		
		public String getEstado(){
				return estado;
			}
			
		public void setEstado(String estado){
				this.estado = estado; 
			}
		
		public String getCurp(){
				return curp;
			}
			
		public void setCurp(String curp){
				this.curp = curp; 
			}
			
		public String getRfc(){
				return rfc;
			}
		public void setRfc(String rfc){
				this.rfc = rfc;
			}
}