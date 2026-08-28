package lista4DecisaoComposta;

import java.util.Scanner;

public class FaixaIdade {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int aa, an, id;
		
		System.out.println("Entre com o ano de nascimento");
		an = ler.nextInt();
		System.out.println("Entre com o ano atual");
		aa = ler.nextInt();
		id = aa - an;
		System.out.println("Sua idade é " +id+ " anos");
		
		if (id<10) {
			System.out.println("Você é Criança, aproveite");
		}
		else if (id<18) {
			System.out.println("Você é Adolescente, se prepara");
		}
		else if (id<60) {
			System.out.println("Você é Adulto, sinto muito");
		}
		else {
			System.out.println("Você é Idoso");
		}
		
		ler.close();
	}
}

