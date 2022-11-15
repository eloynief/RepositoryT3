package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num= 0, line = 0, space = 0, aster = 0;
		System.out.println("pon un numero");
		//numero de filas
		num = sc.nextInt();
		
		/*Comando for el cual aumentará el numero de líneas hasta que la variable "line"
		sea mayor que num*/
		for(line=1;line<=num;line++) {
			
			/*Este comando hace que haga print de un espacio mientas que
			"space" sea menor que la resta de num y "line"*/
			for(space=0;space<num-line;space++) {
				System.out.print(" ");	
			}
			/*Este comando hace print de un asterisco con espacio cuando la
			variable "aster" es menor que "line"*/
			for(aster=1;aster<=line;aster++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
