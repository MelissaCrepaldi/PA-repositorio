package prjTomadaDecisao;

import java.util.Scanner;

public class TimeVencedor {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int golA, golB;

		System.out.println("Quantos gols o Brasil marcou?");
		golA = read.nextInt();
		System.out.println("E quantos gols o país figurante marcou?");
		golB = read.nextInt();
		
		if (golB<golA) {
			System.out.println("O Brasil ganhou de " + golA + " - " + golB);
			
		}
		
		else {
			System.out.println("O País figurante ganhou de " + golB + " - " +golA);
			System.out.println("decepcionante...");
		}
		
		if (golA==golB)  {
			System.out.println("O Brasil e o país figurante empataram de " + golB + " - " + golA);
		}
		read.close();
	}
}
