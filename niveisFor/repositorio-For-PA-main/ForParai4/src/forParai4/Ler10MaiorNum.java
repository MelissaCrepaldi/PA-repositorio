package forParai4;

import java.util.Scanner;

public class Ler10MaiorNum {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, maiorValor, i;
		
		System.out.println("Escolha um número : ");
		num = ler.nextInt();
		maiorValor = num;

		for (i=2;i<=10;i++) {
			System.out.println("Escolha um número : ");
			num = ler.nextInt();
			
			if (num > maiorValor) {
				maiorValor = num;
			}
		}
		
		System.out.println(maiorValor+ " é o maior número digitado");
	}
}
