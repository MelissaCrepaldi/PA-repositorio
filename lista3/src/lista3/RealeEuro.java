package lista3;

import java.util.Scanner;
	
public class RealeEuro {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		double euro, cotacao, valorReal;
		
		System.out.println("insira o valor em euro");
		euro = ler.nextDouble();
		System.out.println("insira o valor da cotação");
		cotacao = ler.nextDouble ();
		valorReal = euro * cotacao;
		System.out.println("O valor em real é " +valorReal);
}
}