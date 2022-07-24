package listaexercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exe7 {

	public static void main(String[] args) {

		/*
		 * Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos,
		 * meses e dias.
		 */

		 final int diasAno = 365;
	     final int diasMes = 30;
	     int ano, mes, dias, idadeEmDias;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua Idade em dias: ");
		
		idadeEmDias = sc.nextInt();
				
		//CALCULO
		ano = idadeEmDias / diasAno;
		mes = ((idadeEmDias % diasAno) / diasMes);
		dias = ((idadeEmDias % diasAno) % diasMes );
		
		JOptionPane.showMessageDialog(null, "Sua idade em anos é de: " + ano);
		JOptionPane.showMessageDialog(null, "Sua idade em meses é de: " + mes);
		JOptionPane.showMessageDialog(null, "Sua idade em dias é de: " + dias);
		

		sc.close();
	}

}
