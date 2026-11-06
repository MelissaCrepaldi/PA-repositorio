package listaVetores;

import java.util.Scanner;

public class MaiorqueMenor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN = 10;
		int a[], b[], c[], i, j;
		a = new int [TAN];
		b = new int [TAN];
		c = new int [TAN];
		
		for (i=0; i<TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor B");
			b[i] = ler.nextInt();
		}
		
		for (i=0; i<TAN; i++) {
			if (a[i] > b[i]) {
				c[i] = 1; 
			}
			else if (a[i] == b[i]) {
				c[i] = 0;
			}
			else {
				c[i] = -1;
			}
		}
		
		System.out.println("\nVetor C = ");
		for (i=0; i<TAN; i++) {
		    System.out.print(c[i] + "  ");
		}
		ler.close();
	}
}
