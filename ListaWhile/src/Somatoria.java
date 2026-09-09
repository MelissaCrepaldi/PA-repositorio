import java.util.Scanner;

public class Somatoria {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int soma = 0;
		int i = 1;
		while (i <101) {
			soma = soma + i;
			i = i + 1;
		System.out.println(soma);
		}
	}
}
