package listaVetor;

import java.util.Scanner;

public class TrocarVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int SS=10;
		int a[], b[], i;
		a = new int[SS];
		b = new int [SS];
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		System.out.print("\nB = ");
		for (i=0; i<SS; i++) {
			b[0] = a[9];
			b[1] = a[8];
			b[2] = a[7];
			b[3] = a[6];
			b[4] = a[5];
			b[5] = a[4];
			b[6] = a[3];
			b[7] = a[2];
			b[8] = a[1];
			b[9] = a[0];
			System.out.print(b[i]+ "  ");
		}
		
	}
}
