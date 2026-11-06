package listaVetores;

import java.util.Scanner;

public class ParescomVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAN=10;
		int a[], i, i2, num;
		a = new int[TAN];
		
		for (i = 0; i < TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i = 0; i < TAN; i++) {
			num = a[i];
			System.out.println(" ");
			System.out.println("Número do Vetor: " + num);
            System.out.print("Pares de 0 até " + num + ": ");
            
           
            for (i2 = 0; i2 <= num; i2++) {
                if (i2 % 2 == 0) {
                    System.out.print(i2 + " ");
                }
            }
            System.out.println();
		}
		ler.close();
	}
}
