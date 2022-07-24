package listaexercicios;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {

		/*
		 * Dado os três lados de um triângulo determinar o perímetro do mesmo.
		 */

		Scanner sc = new Scanner(System.in);
		
		double perimetro;
		

		System.out.print("Digite o lado 1 do triângulo: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Digite o lado 2 do triângulo: ");
		int lado2 = sc.nextInt();
		
		System.out.print("Digite o lado 3 do triângulo: ");
		int lado3 = sc.nextInt();

		//Perímetro
		perimetro = lado1 + lado2 + lado3;
		
		System.out.print("O perímetro do triângulo é de: " + perimetro);
		

		sc.close();
	}

}
