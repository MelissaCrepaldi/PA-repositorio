package listaVetor;

import java.util.Scanner;

public class QuadradoDeA {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int SS=10;
		int a[], b[], i;
		a = new int[SS];
		b = new int [SS];
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i] * a[i];
		}
		
		System.out.print("\nB = ");
		for (i=0; i<SS; i++) {
			System.out.print(b[i]+ "  ");
		}
		
	}
}
