package exerciciosLista02;

import java.util.Scanner;

public class Exercicio01MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da 1° Nota:");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o valor ddo peso da sua 1° Nota:");
		int peso1 = sc.nextInt();
		
		System.out.println("Digite o valor da 2° Nota:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite o valor ddo peso da sua 2° Nota:");
		int peso2 = sc.nextInt();
		
		System.out.println("Digite o valor da 3° Nota:");
		float nota3 = sc.nextFloat();
		System.out.println("Digite o valor ddo peso da sua 3° Nota:");
		int peso3 = sc.nextInt();
		
		//1° Maneira
		
		float soma = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3);
		float peso = peso1 + peso2 + peso3;
		float mediaPonderada = soma/peso;
		System.out.println("A média ponderada dos números digitados é :" + mediaPonderada);
		sc.close();
		
		//2° Maneira
		
		float mediaPonderadaF = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1 + peso2 + peso3);
		System.out.println("A média ponderada dos números digitados é :" + mediaPonderadaF);

		

	}

}
