package lista5SimplesCeE;

import java.util.Scanner;

public class IdadeNadador {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int aa, an, id;
		
		System.out.println("Entre com o ano de nascimento");
		an = ler.nextInt();
		System.out.println("Entre com o ano atual");
		aa = ler.nextInt();
		id = aa - an;
		System.out.println("Sua idade é " +id+ " anos");
		
		if (id<8) {
			System.out.println("Você é Infatil");
		}
		else if (id<13) {
			System.out.println("Você é JuvenilA");
		}
		else if (id<17) {
			System.out.println("Você é JuvenilB");
		}
		else {
			System.out.println("Você é Adulto");
		}
		
		ler.close();
	}
}

