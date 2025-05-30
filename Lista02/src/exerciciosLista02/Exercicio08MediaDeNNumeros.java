package exerciciosLista02;

import java.util.Scanner;

public class Exercicio08MediaDeNNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números que dejesa fazer a media:");
		int quantidadeNumeros = sc.nextInt();
		int soma = 0;
		
		for(int contadora = 1; contadora <= quantidadeNumeros; contadora++) {
			System.out.println("Digite um numero:");
			float numeros = sc.nextFloat();
			soma+= numeros;
		}
		
		float media = soma / quantidadeNumeros;
		
		System.out.println("A média dos numeros digitados é: " + media);
		sc.close();
	}

}
