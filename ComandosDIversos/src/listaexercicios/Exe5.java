package listaexercicios;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		/*
		 * Ler um número inteiro e exibir o seu sucessor
		 */

		Scanner sc = new Scanner(System.in);
		
		int sucessor;

		System.out.print("Digite um número qualquer: ");
		int n1 = sc.nextInt();

		// Sucessor
		sucessor = n1 + 1;
		
		System.out.print("O Sucessor do número digitado é: " + sucessor);
		
		sc.close();
	}

}
