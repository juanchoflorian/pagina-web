package Pruebatecnica;

import java.util.Scanner;

public class SegundoArchivoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Recolecciondatos= new Scanner(System.in);
		int resultado=0;
		
		System.out.println("Cantidad de numeros a ingresar Recuerde que debe ser mayor a 3 ");
		int cantidadnumeros=Recolecciondatos.nextInt();
		
		while(cantidadnumeros<3) {
			
			System.out.println("ERROR Recuerde que debe ser mayor a 3 ");
			cantidadnumeros=Recolecciondatos.nextInt();
			
		}
		
		int cadenanumero[]=new int[cantidadnumeros];
		
		System.out.println("Escriba los numeros ");
		
		for(int i=0;i<cantidadnumeros;i++) {
			
			cadenanumero[i]=Recolecciondatos.nextInt();
			
		}
		
		
		
			
			for(int i=0;i<cantidadnumeros;i++) {
				
				resultado=resultado + cadenanumero[i];
				
				if(resultado==cadenanumero[cadenanumero.length-1]) {
					
					System.out.println(i+1);
			}
		}
		
			
	}

}
