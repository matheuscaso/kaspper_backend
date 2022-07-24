package listaexercicios;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		// Converter um inteiro informado menor que 32 para sua representação em binário

		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para a converter em binário: ");

		n1 = sc.nextInt();
		
		intParaBinario(n1);
		
		sc.close();
	}
		public static void intParaBinario(int n) {
			if ( n > 0 ) {
				intParaBinario (n / 2);
				System.out.println(n % 2);
			}
		}

	

}
