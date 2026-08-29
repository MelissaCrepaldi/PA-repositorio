package lista5SimplesCeE;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double ano, resto;
		
		System.out.println("Insira o ano");
		ano = ler.nextDouble();
		resto = ano % 4;
		if (resto==0) {
			System.out.println("O ano de " +ano + " é um ano bissexto");
		}
		else {
			System.out.println("O ano de " +ano+ " NÃO é um ano bissexto");
		}
		
		ler.close();
	}
}
