import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1;
		int anoA, anoN, id;
		
		while (i < 7) {
			System.out.println("Insira o " +i+ "o ano de nascimento");
			anoN = ler.nextInt();
			System.out.println("Insira o " +i+ "o ano atual");
			anoA = ler.nextInt();
			id = anoA - anoN;
			System.out.println("O usuário possui " +id+ " anos");
			
			if (id <18) {
				System.out.println("O " +i+ "o usuário é menor de idade");
			}
			
			else {
				System.out.println("O " +i+ "o usuário é maior de idade");
			}
			
		i = i + 1;
		}
	}
}

