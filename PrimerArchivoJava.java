package Pruebatecnica;


import java.util.*;

public class PrimerArchivoJava{
	
	
	public static void main(String [] args) {
		//coleccion de datos
		Scanner Recolecciondatos= new Scanner(System.in);
		
		String coleccionconsulta[]= {"huy","xywz","hola","abc","prueba"};
		int coleccionrespuesta[]=new int[coleccionconsulta.length];
	
		System.out.println("Cantidad de cadenas a ingresar Recuerde que debe ser mayor a 3 ");
		int numerocadenasentrada=Recolecciondatos.nextInt();
		
		while(numerocadenasentrada<3) {
			
			System.out.println("ERROR Recuerde que debe ser mayor a 3 ");
			numerocadenasentrada=Recolecciondatos.nextInt();
			
		}
		
		String coleccionentrada[]=new String[numerocadenasentrada];
		
		
		for (int i=0;i<numerocadenasentrada;i++) {
			
			System.out.println("Ingrese la " + (i+1) + " cadena : ");
			coleccionentrada[i]=Recolecciondatos.next();
		}
		
		
		for(int i=0;i<coleccionconsulta.length;i++) {
			
			for(int j=0;j<coleccionentrada.length;j++) {
				
				if(coleccionconsulta[i].equals(coleccionentrada[j])) {
					
					coleccionrespuesta[i]+=1;
				}
			}
			
		}
		
		for(int i=0;i<coleccionrespuesta.length;i++) {
			
			System.out.print(coleccionrespuesta[i]);
		}
	}
}