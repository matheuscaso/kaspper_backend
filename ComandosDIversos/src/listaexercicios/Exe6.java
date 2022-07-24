package listaexercicios;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {

		/*
		 * Ler dois números inteiros e exibir o quociente e o resto da divisão inteira
		 * entre eles.
		 */

		Scanner sc = new Scanner(System.in);

		int n1;
		int n2 ;
		int resto;
		double quociente;
		

		System.out.println("Digite 2 números aleatórios: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		// Quociente e Resto
		quociente = (n1 / n2);
		resto = n1 % n2;

		System.out.println("O quociente dos números é de: " + quociente);
		System.out.println("O resto dos números é de: " + resto);

		sc.close();
	}

}
