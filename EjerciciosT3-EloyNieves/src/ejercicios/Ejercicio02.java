package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = 0,i = 0,cont = 0;
		System.out.println("eset");
		//
		num = sc.nextInt();
		
		for(i=2;i<num;i++){
		//
		System.out.println("tset");
		num = sc.nextInt();
		cont++;
		}
		
		System.out.println(cont);
	}

}
