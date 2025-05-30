package exerciciosLista02;

import java.util.Scanner;

public class Exercicio03ConversaoDeMoedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que dejesa converter:");
		float real = sc.nextFloat();
		
		System.out.println("Digite o valor do dolar vigente:");
		float dolar = sc.nextFloat();
		
		System.out.println("Digite o valor do euro vigente:");
		float euro = sc.nextFloat();
		
		System.out.println("Digite o valor da libra vigente:");
		float libra = sc.nextFloat();
		
		float conversorDolar = real / dolar;
		float conversorEuro = real / euro;
		float conversorLibra = real / libra;
		
		System.out.printf("O valor convertido em dolar: US$%.2f \n" , conversorDolar);
		System.out.printf("O valor convertido em euro: EUR%.2f \n" , conversorEuro);
		System.out.printf("O valor convertifo em libra: GBP%.2f \n" , conversorLibra);
		
		sc.close();
		}

}
