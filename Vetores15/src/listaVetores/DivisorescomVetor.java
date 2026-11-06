package listaVetores;

import java.util.Scanner;

public class DivisorescomVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN=10;
		int a[], i, m, num;
		a = new int[TAN];
		
		for (i = 0; i < TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i = 0; i < TAN; i++) {
			num = a[i];
			System.out.println(" ");
			System.out.println("Número do Vetor: " + num);
            System.out.print("Divisores até " + num + ": ");
            
           
            for (m = 1; m <= num; m++) {
                if (num % m == 0) {
                    System.out.print(m + " ");
                }
            }
            System.out.println();
            
		}
		ler.close();
	}
}
