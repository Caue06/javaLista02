package exerciciosLista02;

import java.util.Scanner;

public class Exercicio04AreaPerimetroTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° lado do Triangulo:");
		float lado1 = sc.nextFloat();
		System.out.println("Digite o 2° lado do Triangulo:");
		float lado2 = sc.nextFloat();
		System.out.println("Digite o 3° lado do Triangulo:");
		float lado3 = sc.nextFloat();
		
		System.out.println("Digite o valor da base do Triangulo:");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do Triangulo:");
		float altura = sc.nextFloat();
		
		float perimetro = lado1 + lado2 + lado3;
		float area = base * altura / 2;
		
		System.out.println("O valor do perimetro é: " + perimetro);
		System.out.println("O valor da area é: " + area);
		sc.close();
	}

}
