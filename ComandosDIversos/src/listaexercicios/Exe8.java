package listaexercicios;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {

		//Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
		// valor de temperatura em Fahrenheit e exibi-lo em Celsius
		 
		 
		double celsius, fahrenheit;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da temperatura em Fahrenheit: ");
		fahrenheit = sc.nextDouble();
		
		celsius = (5 * (fahrenheit - 32)) / 9;
		
		System.out.println("O valor convertido é : " + celsius +   " Celsius. ");
		
		sc.close();
		
	}

}
