package prueba01;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		//imprimir mensaje 
		System.out.println("Bienvenidos al curso 2020");
		
		//capturar valores de la consolsa
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre?: ");
		String nombre =sc.nextLine();
		System.out.println("Bienvenido "+nombre);
		
		sc.close();
	}

}
