package listaexercicios;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {

		/*
		 * Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o
		 * seu perímetro
		 */

		Scanner sc = new Scanner(System.in);

		int area;
		int perimetro = 0;

		System.out.println("Digite o numero da base: ");
		int b = sc.nextInt();
		System.out.println("Digite o numero da altura: ");
		int h = sc.nextInt();
		
		//Cálculo da Área e Perímetro
		area = b * h;
		perimetro = 2 * (b + h);
		
		System.out.println("A base do retângulo é de: " + area);
		System.out.println("O Perímetro do retângulo é de: " + perimetro);
		
		sc.close();
	}

}
