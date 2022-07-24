package listaexercicios;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {

		/*
		 * Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro
		 * da mesma.
		 */

		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14;
		double area;
		

		System.out.print("Digite o numero do raio: ");
		int raio = sc.nextInt();

		// Cálculo da Área e Perímetro
		area = (2 * pi) * raio;
		
		System.out.print("A área da circunferencia é de: " + area);
		

		sc.close();
	}

}
