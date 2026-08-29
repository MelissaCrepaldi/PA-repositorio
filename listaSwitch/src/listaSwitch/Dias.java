package listaSwitch;

import java.util.Scanner;

public class Dias {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("Entre com o mês correspondente em número");
		n = ler.nextInt();
		
		switch (n) {
		case 2:
			System.out.println("O mês possui 28 dias");
			break;
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("O mês possui 31 dias");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("O mês possui 30 dias");
			break;
		
		default:
			System.out.println("mês inválido");
		}
		
		ler.close();
	}
}
