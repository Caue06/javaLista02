package exerciciosLista02;

import java.util.Scanner;

public class Exercicio07EquacaoQuadratica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A da equação quadratica:");
		float numero1 = sc.nextFloat();
		System.out.println("Digite o valor de B da equação quadratica:");
		double numero2 = sc.nextFloat();
		System.out.println("Digite o valor de C da equação quadratica:");
		float numero3 = sc.nextFloat();
		
		double delta = Math.pow(numero2, 2.0) - 4 * numero1 * numero3;
		
		System.out.println(delta);
		
		if(delta > 0) {
			System.out.println("Possui duas raizes");
		}else if(delta == 0){
			System.out.println("Possui uma raiz");
		}else {
			System.out.println("Não possui raizes");
		}
		
		sc.close();
	}

}
