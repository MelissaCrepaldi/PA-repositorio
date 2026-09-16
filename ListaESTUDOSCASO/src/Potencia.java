import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int expoente, base, resultado =1, i = 0;
		
		System.out.println("Insira a base :");
		base = ler.nextInt();
		System.out.println("Insira o expoente : ");
		expoente = ler.nextInt();
		
		while ( i < expoente ) {
			resultado = resultado * base;
			
			i = i + 1;
		}
		
		System.out.println("O número " +base+ " elevado à " +expoente+ " é igual à " +resultado);
		
		ler.close();
	}
}
