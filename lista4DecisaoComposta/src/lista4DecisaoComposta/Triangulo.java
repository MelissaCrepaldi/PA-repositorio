package lista4DecisaoComposta;

import java.util.Scanner;

public class Triangulo {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		double a, b, c;
		
		System.out.println("Insira o valor do primeiro lado(A)");
		a = ler.nextDouble();
		System.out.println("Insira o valor do segundo lado(B)");
		b = ler.nextDouble();
		System.out.println("Insira o valor do terceiro lado(C)");
		c = ler.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("As medidas formam um triângulo");
			
			if (a == b && b == c) {
				System.out.println("O triângulo é equilátero, os três lados são iguais");
			}
			
			else if (a != b && b != c&& a != c) {
				System.out.println("O triângulo é escaleno, os três lados são diferentes");
			}
			
			else {
				System.out.println("O triângulo é isósceles, dois lados são iguais, mas um é diferente");
			}
		}
		
		else {
			System.out.println("As medidas NÃO formam um triângulo");
		}
		
		ler.close();
	}
}
