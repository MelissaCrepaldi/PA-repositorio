package lista2;

import java.util.Scanner;

public class MediaA {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		Double nota1, nota2, nota3, nota4, soma, mediaA;
		
		System.out.println("Entre com a 1o nota");
		nota1 = ler.nextDouble();
		System.out.println("Entre com a 2o nota");
		nota2 = ler.nextDouble();
		System.out.println("Entre com a 3o nota");
		nota3 = ler.nextDouble();
		System.out.println("Entre com a 4o nota");
		nota4 = ler.nextDouble();
		soma = nota1+nota2+nota3+nota4;
		mediaA = soma/4;
		System.out.println(" média aritmética é = "+mediaA);
	}
}
