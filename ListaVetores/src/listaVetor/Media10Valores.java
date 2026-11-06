package listaVetor;

import java.util.Scanner;

public class Media10Valores {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int SS = 10;
		int a[], media, soma, i;
		
		soma = 0;
		
		a = new int[SS];

		for (i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
			
			soma = soma + a[i];
		}
		
		media = soma/10;
		System.out.println("A media dos valores é: " +media);
		
	}
}
