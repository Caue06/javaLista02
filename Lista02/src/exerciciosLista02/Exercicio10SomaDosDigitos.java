package exerciciosLista02;

import java.util.Scanner;

public class Exercicio10SomaDosDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		String numeroString = Integer.toString(numero);
		
		int soma = 0;

		for (int contadora = 0; contadora < numeroString.length(); contadora++) {
			char caracter = numeroString.charAt(contadora);
			int digito = Character.getNumericValue(caracter);
			soma += digito;
		}
		System.out.println("A soma dos digitos do valor digitado é: " + soma);
		sc.close();
	}

}
