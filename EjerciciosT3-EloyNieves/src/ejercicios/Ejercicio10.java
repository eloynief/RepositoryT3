package ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variable para guardar un número entero
		int num, uni, dec, cent, mill;

		// Creación de scanner
		Scanner sc = new Scanner(System.in);

		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");

		// Comando para introducir el primer número
		num = sc.nextInt();

		uni = num % 10;
		dec = num / 10;
		cent = num / 100;
		mill = num / 1000;

		if (num >= 0 && num < 10) {
			System.out.print("El número introducido es capicúo");
		} else if (num >= 10 && num < 100 && dec % 10 == uni) {
			System.out.print("El número introducido es capicúo");
		} else if (num >= 100 && num < 1000 && cent % 10 == uni) {
			System.out.print("El número introducido es capicúo");
		} else if (num >= 1000 && num < 10000 && mill % 10 == uni && cent % 10 == dec % 10) {
			System.out.print("El número introducido es capicúo");
		} else if (num < 0 || num >= 10000) {
			System.out.print("El número introducido no es válido");
		} else {
			System.out.print("El número introducido no es capicúo");
		}
		// cierre de scanner
		sc.close();
	}

}
