package listaVetores;

import java.util.Scanner;

public class InterseçãocomVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i, j, k;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		k = 0;
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor B");
			b[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					c[i] = a[i];
					k++;
				} 
				
				else {
					System.out.print("não há ");
				}
				
			}
		}
		for (i = 0; i < k; i++) {
            System.out.print(c[i] + "  ");
        }
		ler.close();
	}

}
