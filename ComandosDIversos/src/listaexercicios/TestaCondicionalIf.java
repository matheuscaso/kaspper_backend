package listaexercicios;

public class TestaCondicionalIf {

	public static void main(String[] args) {
		System.out.println("Testando os comandos Condicionais");
		System.out.println("---------------------------------");
		int idade = 15;
		boolean pais = true;
		
		// se a idade for maior que 18 , pode entrar!
		// "SE" "ENTÃO" "SENÃO"
		if (idade >= 18 && pais == true) {
			System.out.println("Pode Entrar!");
		}else {
			System.out.println("Não pode Entrar - vai pra Disney");
		
		}
		
		if (pais = true) {
			System.out.println("Se está com o papai pode entrar!");
		}
	}

}
