package listaAntesFerias;

import java.util.Scanner;

public class Gols {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int golsA, golsB;
		
		System.out.println("Quantos gols o Brasil marcou?");
		golsA = ler.nextInt();
		
		System.out.println("Quantos gols o time figurante marcou?");
		golsB = ler.nextInt();
		
		if (golsA > golsB) {
			System.out.println("O Brasil ganhou de " +golsA + " - " +golsB);
		}
		
		else if (golsA < golsB) {
			System.out.println("O time figurante ganhou de " +golsB + " - " +golsA);
		}
		
		else {
			System.out.println("Houve empate de " +golsA+ " - " +golsB);
		}
		
		ler.close();
	}
}
