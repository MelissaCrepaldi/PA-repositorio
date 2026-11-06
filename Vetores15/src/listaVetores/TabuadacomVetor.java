package listaVetores;

import java.util.Scanner;

public class TabuadacomVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAN = 5;
		int a[], i, num;
		a = new int [TAN];
		
		for (i = 0; i < TAN; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i = 0; i < TAN; i++) {
            System.out.println("\n--->>>> Tabuada do " + a[i] + " <<<<---");
           
            for (num = 1; num <= 10; num++) {
                System.out.println(a[i] + " x " + num + " = " + (a[i] * num));
            }
        }
		
		ler.close();
	}
}
