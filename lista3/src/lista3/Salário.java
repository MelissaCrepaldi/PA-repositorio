package lista3;

import java.util.Scanner;

public class Salário {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double salarioAnterior, reajuste, reajuste_2, multiplicacao, salarioNovo;
		
		System.out.println("insira o valor do salário");
		salarioAnterior = ler.nextDouble();
		System.out.println("insira o reajuste");
		reajuste = 10;
		reajuste_2 = reajuste/100;
		multiplicacao = salarioAnterior*reajuste_2;
		salarioNovo = salarioAnterior+multiplicacao;
		System.out.println("O valor do novo salário é " +salarioNovo);
		
		
	}

}
