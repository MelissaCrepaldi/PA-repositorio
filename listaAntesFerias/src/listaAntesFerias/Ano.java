package listaAntesFerias;

import java.util.Scanner;

public class Ano {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int anoNasc, idade;
		
		System.out.println("Insira seu ano de nascimento");
		anoNasc = ler.nextInt();
		
		if (anoNasc >= 1900 && anoNasc <= 2026) {
			idade = 2026 - anoNasc;
			
			System.out.println("Sua idade é " +idade);
		}
		
		else {
			System.out.println("O ano digitado está inválido");
		}
		
		ler.close();
	
	}
}
