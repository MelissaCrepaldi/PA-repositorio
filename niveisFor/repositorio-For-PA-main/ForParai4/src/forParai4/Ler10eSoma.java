package forParai4;

import java.util.Scanner;

public class Ler10eSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num;
		int soma = 0;
		int i = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Escolha um número : ");
			num = ler.nextInt();
			soma = soma + num;
		}
		System.out.println(soma+ " é a soma ");
	}
}
