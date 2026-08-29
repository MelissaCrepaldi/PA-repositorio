package lista5SimplesCeE;

import java.util.Scanner;

public class ValorPeixe {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		double kilo, valor;
		int quantidadeP; 
		
		System.out.println("Insira a quantidade de peixes");
		quantidadeP = ler.nextInt();
		
		System.out.println("Quanto é o kilo?");
		kilo = ler.nextDouble();
		
		if (kilo <10) {
			valor = kilo*12.00;
			System.out.println("O valor a ser pago é " +valor);
		}
		
		else {
			valor = kilo*10.00;
			System.out.println("O valor a ser pago é " +valor);
		}
		
		ler.close();
	}
}
