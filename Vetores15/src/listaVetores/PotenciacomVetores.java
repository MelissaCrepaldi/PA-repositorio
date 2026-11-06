package listaVetores;

import java.util.Scanner;

public class PotenciacomVetores {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN=11;
		int a[], i, pot;
		a = new int[TAN];
		pot = 1;
		
		for (i=0; i<TAN; i++) {
			a[i] = pot;
			pot = pot * 2;
			
		}
		
		System.out.println("Vetor A (potenciado teste) = ");
		for (i=0; i<TAN; i++) {
		    System.out.print(a[i] + ",  ");
		}
		ler.close();
	}
}
