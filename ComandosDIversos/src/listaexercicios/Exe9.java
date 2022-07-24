package listaexercicios;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {

		//Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
		//seu raio e sua altura.
		
		 double volume, raio, altura;
		 
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Digite o valor do raio: ");
		 raio = sc.nextDouble();
		 
		 System.out.print("Digite o valor da altura: ");
		 altura = sc.nextDouble();
		 
		 //Cálculo 
		 volume = Math.PI * (Math.pow(raio, 2)) * altura;
		 
		 System.out.println("O volume é de: " + volume + " UN");
		 
		 sc.close();
	}

}
