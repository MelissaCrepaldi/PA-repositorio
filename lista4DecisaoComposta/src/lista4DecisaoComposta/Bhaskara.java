package lista4DecisaoComposta;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, b2, delta, bMenos, deltaRaiz, raiz1, raiz2;
		
		System.out.println("insira o valor de A"); //coloque o 1o valor
		a = ler.nextDouble();
		System.out.println("insira o valor de B");
		b = ler.nextDouble();
		System.out.println("insira o valor de C");
		c = ler.nextDouble();
		b2 = b *b;
		delta = b2 -4*a*c;
		System.out.println("seu valor de delta é " +delta);
		
		
		if(delta > 0) { //Conta 2 raízes
			System.out.println("POSSUI DUAS RAÍZES REAIS :");
		
			bMenos = b *(-1);
			deltaRaiz = Math.sqrt(delta);
			raiz1 = (bMenos + deltaRaiz) / (2*a);
			
			System.out.println("A primeira raíz real é " +raiz1);
			
			raiz2 = (bMenos - deltaRaiz) / (2*a);
			
			System.out.println("A segunda raíz real é " +raiz2);
		}
		
		else if (delta == 0) { //Conta 1 raiz
			System.out.println("POSSUI APENAS UMA RAÍZ REAL");
			
			bMenos = b *(-1);
			deltaRaiz = Math.sqrt(delta);
			raiz1 = (bMenos + deltaRaiz) / (2*a);
			
			System.out.println("A raíz real é " +raiz1);
			
		}
		else { //nao tem
			System.out.println("NÃO POSSUI RAÍZES REAIS");
		}
		
		ler.close();
	}
}
