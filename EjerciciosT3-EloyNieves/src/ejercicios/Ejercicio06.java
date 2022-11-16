package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= 0, line = 0, repetir = 0;
		System.out.println("pon un numero");
		//numero de filas
		num = sc.nextInt();
		
		while(num>0&&num<20) {
		/*Comando for el cual sirve para tanto como para activar los
		los comandos de dentro como el número de líneas*/
		for(line=1;line<=num;line++) {
			/*Este comando hace que los números se repitan*/
			for(repetir=0;repetir<line;repetir++) {
				System.out.print(line);
			}
			//este print servirá para aumentar las líneas
			System.out.println();
		}break;
			
		}
	}

}
