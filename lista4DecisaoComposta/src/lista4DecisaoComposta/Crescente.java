package lista4DecisaoComposta;

import java.util.Scanner;

public class Crescente {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double a, b, c;
		
		System.out.println("Sabe como é, Insira o primeiro valor:");
		a = ler.nextDouble();
		System.out.println("Insira o segundo valor:");
		b = ler.nextDouble();
		System.out.println("Insira o terceiro valor:");
		c = ler.nextDouble();
		
		if (a <= b && b <= c) {
			System.out.println("A ordem é " + a + " , " + b + " , " +c);
		}
		else if (a <= c && c <= b) {
			System.out.println("A ordem é " + a + " , " + c + " , " +b);
		}
		else if (b <= c && c <= a) {
			System.out.println("A ordem é " + b + " , " + c + " , " +a);
		}
		else if (b <= a && a <= c) {
			System.out.println("A ordem é " + b + " , " + a + " , " +c);
		}
		else if (c <= a && a <= b) {
			System.out.println("A ordem é " + c + " , " + a + " , " +b);
		}
		else  {
			System.out.println("A ordem é " + c + " , " + b + " , " +a);
		}
		
		ler.close();
	}
}
