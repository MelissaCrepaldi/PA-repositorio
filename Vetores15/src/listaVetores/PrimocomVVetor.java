package listaVetores;

import java.util.Scanner;

public class PrimocomVVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN=10;
		int a[], i, i2, num, divisores;
		a = new int[TAN];
		divisores = 0;
		//basico ne
		for (i = 0; i < TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		//verificando
		System.out.println("--Indicando números primos--");
		for (i = 0; i<TAN; i++) {
			num = a[i];
			divisores = 0;
		
			for (i2 = 1; i2 <= num; i2++) {
				if (num % i2 == 0) {
					divisores++; 
				}
				
			}
			
			if (divisores == 2) {
				System.out.println("O número " + num + " É um número primo");
			}
			else {
				System.out.println("O número " + num + " NÃO é um número primo");
			}
	}
		ler.close();
	}
}
