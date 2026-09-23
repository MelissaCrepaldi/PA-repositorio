package doWhile;

import java.util.Scanner;

public class FatorialDo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, fator = 1, i;
		
		System.out.println("Insira o número a ser fatorado :");
		num= ler.nextInt();
		i = num;
		
		do {
			fator = fator * i;
			i = i - 1;
		} while ( i > 0 );

		System.out.println("O fatorial de " +num+ "! é: " +fator);
		
		ler.close();
	}
}
