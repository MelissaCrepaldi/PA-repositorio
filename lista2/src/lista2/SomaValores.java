package lista2;

import java.util.Scanner;

public class SomaValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int v1, v2, soma;
		
		System.out.println("Entre com o 1o valor");
		v1 = ler.nextInt(); //leia(v1)
		System.out.println("Entre com o 2o valor");
		v2 = ler.nextInt(); //leia(v2)
		soma = v1+v2;
		System.out.println("A soma é = "+soma);
		}

}
