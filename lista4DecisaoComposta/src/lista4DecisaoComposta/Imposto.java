package lista4DecisaoComposta;

import java.util.Scanner;

public class Imposto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario, irpf;
		
		System.out.println("Quanto é o seu salário?");
		salario = ler.nextDouble();
		
		if (salario <= 1434.59) {
			System.out.println("Não tem desconto >:D");
		}
		else if (salario <= 2150.00) {
			irpf = (salario*(7.5/100)) - 107.59;
			System.out.printf("Seu desconto é %.2f\n", irpf);
		}
		else if (salario <= 2866.70) {
			irpf = (salario*(15.0/100)) - 268.84;
			System.out.printf("Seu desconto é %.2f\n", irpf);
		}
		else if (salario <= 3582.00) {
			irpf = (salario*(22.5/100)) - 483.84;
			System.out.printf("Seu desconto é %.2f\n", irpf);
		}
		else {
			irpf = (salario*(27.5/100)) - 662.94;
			System.out.printf("Seu desconto é %.2f\n", irpf);
		}
		ler.close();
	}
}
