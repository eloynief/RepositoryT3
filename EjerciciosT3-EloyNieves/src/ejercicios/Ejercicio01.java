package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = 0, min = 0, sec = 0, num = 0;
		
		//
		System.out.println("Introduce la cantidad de horas");
		
		//
		h = sc.nextInt();
		
		//
		System.out.println("Introduce la cantidad de minutos");
		
		//
		min = sc.nextInt();
		
		//
		System.out.println("Introduce la cantidad de segundos");
		
		//
		sec = sc.nextInt();
		
		//
		System.out.println("Introduce la cantidad de segundos para incrementar");
		
		//
		num = sc.nextInt();
		
		//
		if (sec >= 60||sec<0||min >= 60||min<0||h >= 24||h<0) {
			System.out.println("Error");
		}
		
		//
		else {
		sec=sec+num;
		//
		while (sec >= 60) {
			sec = sec - 60;
			min++;
			//
			if (min >= 60) {
				h++;
				min = min - 60;
				}
			//
			if (h>=24) {
				h = h-24;
				}
			
			}
		System.out.println(h + ":" + min + ":" + sec);
		}
		
		
	}

}
