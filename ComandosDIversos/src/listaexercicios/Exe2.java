package listaexercicios;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {

		/*
		 * Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do
		 * mesmo.
		 */

		Scanner sc = new Scanner(System.in);
		
		int area;
		int perimetro;

		System.out.println("Digite o numero do primeiro lado: ");
		int lado1 = sc.nextInt();
		System.out.println("Digite o numero do segundo lado: ");
		int lado2 = sc.nextInt();

		// Cálculo da Área e Perímetro
		area = lado1 * lado2;
		perimetro = 2 * (lado1 + lado2);

		System.out.println("A área do quadrado é de: " + area);
		System.out.println("O perímetro do quadrado é de: " + perimetro);

		sc.close();
	}

}
