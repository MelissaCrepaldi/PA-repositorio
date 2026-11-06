package listaVetores;

import java.util.Scanner;

public class FatorialcomVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int AND=15;
		int a[], b[], i, fatorial, num, i2;
		a = new int [AND];
		b = new int [AND];
		
		
		for (i = 0; i < AND; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
			
		}
		
		for (i = 0; i < AND; i++) {
            num = a[i];
            fatorial = 1;
            for (i2 = 1; i2 <= num; i2++) {
			
			fatorial = fatorial * i2;
			
            }
            b[i] = fatorial;
		}
		
		System.out.println("\nVetor B fatoriais = ");
		for (i=0; i<AND; i++) {
		    System.out.print(b[i] + "  ");
		}
		ler.close();
	}
}
