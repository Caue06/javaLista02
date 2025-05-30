package exerciciosLista02;

import java.util.Scanner;

public class Exercicio02JurosCompostos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do capital inicial: ");
		float capitalInicial = sc.nextFloat();
		
		System.out.println("Digite o valor do juros anuais:");
		float jurosAnuais = sc.nextFloat();
		
		System.out.println("Digite o número de anos:");
		float numerosAnos = sc.nextFloat();
		
		double valorFinal = capitalInicial * Math.pow(1 + jurosAnuais / 100 ,numerosAnos);
		System.out.printf("O valor final é: %.2f" , valorFinal);
		sc.close();
	}

}
