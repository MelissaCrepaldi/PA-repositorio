package listaVetores;

import java.util.Scanner;

public class PareImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN=20;
		int a[], b[], i, pares, impares;
		a = new int [TAN];
		b = new int [TAN];
		i = 0;
		pares = 0;
		impares = TAN - 1;
		
		for (i=0; i<TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAN; i++) {
			if (a[i] % 2 == 0) {
				b[pares] = a[i];
				pares++;
			} 
			else {
				b[impares] = a[i];
				impares--;
			}
		
		}
		
		System.out.println("\nVetor B (com pares e impares) = ");
		for (i=0; i<TAN; i++) {
		    System.out.print(b[i] + "  ");
		}
		ler.close();
	}
}
