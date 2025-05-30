package exerciciosLista02;

import java.util.Scanner;

public class Exercicio09Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		int base = sc.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = sc.nextInt();
		
		double potencia = Math.pow(base, expoente);
		
		System.out.println("A potencia é: " + potencia);
		sc.close();
		
	}

}
