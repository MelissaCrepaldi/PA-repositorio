package forParai4;

import java.util.Scanner;

public class LerPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num;
		int qntpares = 0;
		int i = 0;
		
		for (i = 1; i<=10; i++) {
			System.out.println("Escolha um número : ");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				qntpares++;
			}
			
		}
		
		System.out.println("A quantidade de pares é de " +qntpares+ " pares digitados");
	}
}
