import java.util.Scanner;

public class Fibonacci {
		public static void main (String [] args) {
			Scanner ler = new Scanner (System.in);
			int n, antes = 0, atual = 1, i = 0, proximo;
					
			System.out.println("Insira o termo :");
			n = ler.nextInt();
			
			while (i <= n) {
				proximo = antes + atual;
				
				System.out.print(antes+ ", ");
				
				antes = atual;
				atual = proximo;
				i = i + 1;
			}
		
			ler.close();
		}
}
