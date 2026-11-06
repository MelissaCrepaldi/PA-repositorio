package forParai3;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, num, res;
		
		System.out.println("Insira um número inteiro : ");
		num = ler.nextInt();
		for (i = 1; i<=10; i++) {
			res = num * i;
			System.out.println(num+ " x " +i+ " = " +res);
		}
	}
}
