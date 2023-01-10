package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable para guardar un número entero
		int num=0, numi=0, dec=0, cent=0, mill=0;

		// Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pon un numero inicial");
		num = sc.nextInt();
		
		while(num!=0) {
			System.out.println("pon un numero");
			// Comando para introducir el primer número
			num = sc.nextInt();
			if(num<numi) {
				System.out.println("Fallo es menor");
			}
			numi=num;
		}
		// cierre de scanner
		sc.close();
	}
	static void main() {
		// TODO Auto-generated method stub
		// variable para guardar un número entero
		int num=0, numi=0, dec=0, cent=0, mill=0;

		// Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pon un numero inicial");
		num = sc.nextInt();
		
		while(num!=0) {
			System.out.println("pon un numero");
			// Comando para introducir el primer número
			num = sc.nextInt();
			if(num<numi) {
				System.out.println("Fallo es menor");
			}
			numi=num;
		}
		// cierre de scanner
		sc.close();
	}

}
