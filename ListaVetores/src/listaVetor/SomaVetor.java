package listaVetor;

import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int SS = 10;
		int a[], b[], c[], i;
		a = new int[SS];
		b = new int[SS];
		c = new int[SS];

		for (i=0; i<SS; i++) {
			System.out.println("Digite o " +(i+1)+ "o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<SS; i++) {
			System.out.println("Digite o " +(i+1)+ "o valor do vetor B");
			b[i] = ler.nextInt();
			c[i] = a[i]+b[i];
		}
		
		System.out.print("\nC = ");
		for (i=0; i<SS; i++) {
			System.out.print(c[i]+ "  ");
		}
	}
}
