package exerciciosLista02;

import java.util.Scanner;

public class Exercicio05MediaHarmonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o segundo numero:");
		float numero2 = sc.nextFloat();
		System.out.println("Digite o terceiro numero:");
		float numero3 = sc.nextFloat();
		
		float mediaHarmonica = 3 / ((1 / numero1) + (1 / numero2) + (1 / numero3));
		
		System.out.println("A media Harmonica dos numeros digitados é: " + mediaHarmonica);
		sc.close();
	}

}
