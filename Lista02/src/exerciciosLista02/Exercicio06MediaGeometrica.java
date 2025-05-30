package exerciciosLista02;

import java.util.Scanner;

public class Exercicio06MediaGeometrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo numero:");
		float numero2 = sc.nextFloat();
		System.out.println("Digite o terceiro numero:");
		float numero3 = sc.nextFloat();
		
		double mediaGeometrica = Math.cbrt(numero1 * numero2 * numero3);
		
		System.out.println("A media Geometrica dos numeros digitados é: " + mediaGeometrica);
		
		sc.close();
	}

}
