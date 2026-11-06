package listaVetores;

import java.util.Scanner;

public class BuscareemVetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], num, contagem, i;
		a = new int [TAM];
		contagem = 0;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		System.out.print("\nA = ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+ "  ");
		}
		
		System.out.println("\nDigite o número que deseja encontrar no vetor A :");
		num = ler.nextInt();
		
		for (i=0; i<TAM; i++) {
			if (num == a[i]) {
				contagem++;
			System.out.println("O número " +num+ " está no vetor A e está na " +(i+1)+ "o posição" );
			}
		}
		if (contagem==0) {
			System.out.println("O número " +num+ " NÃO está no vetor A");
		}
		
		ler.close();
	}
}
