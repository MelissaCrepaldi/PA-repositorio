package listaVetores;

import java.util.Scanner;

public class ZeroseUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN=10;
		int a[], b[], i, j;
		a = new int [TAN];
		b = new int [TAN];
		
		for (i = 0; i < TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAN; i++) {
			if (a[i] % 2 == 0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
		}
		
		System.out.println("\nVetor B = ");
		for (i=0; i<TAN; i++) {
		    System.out.print(b[i] + "  ");
		}
		ler.close();
	}
}
