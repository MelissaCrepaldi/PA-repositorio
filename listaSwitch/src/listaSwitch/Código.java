package listaSwitch;

import java.util.Scanner;

public class Código {
	public static void main(String [] args) {
		Scanner read = new Scanner (System.in);
		int codigo;
		System.out.println("Informe o código do produto");
		
		codigo = read.nextInt();
		switch(codigo) {
			case 1:
				System.out.println(" DESCRIÇÃO : Cachorro-quente – VALOR : R$ 8.00");
				break;
			case 2:
				System.out.println(" DESCRIÇÃO : Cheeseburger – VALOR : R$ 12.00");
				break;
			case 3:
				System.out.println(" DESCRIÇÃO : X-Salada – VALOR : R$ 15.00");
				break;
			case 4:
				System.out.println(" DESCRIÇÃO : Misto Quente – VALOR : R$ 11.00");
				break;
			case 5:
				System.out.println(" DESCRIÇÃO : Pão na chapa – VALOR : R$ 6.00");
				break;
			default:
				System.out.println("Código Inválido");
		}
		
		read.close();
	}
}
