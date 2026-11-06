package listaVetores;

import java.util.Scanner;

public class PalindromoemVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], i, j, contador;
		j = TAM -1;
		contador = 0;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i] != a[j]) {
				contador++;
			}
			
			j--;
		}
		
		if (contador == 0) {
			System.out.println("O número é um palíndromo :0");
		}
		
		else {
			System.out.println("O número NÃO é um palíndromo >:0");
		}
		
		ler.close();
	}
}
