package lista4DecisaoComposta;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, alt, alt2, imc;
		
		System.out.println("Insira o valor do peso");
		peso = ler.nextDouble();
		System.out.println("Insira o valor da altura");
		alt = ler.nextDouble();
		alt2 = alt*alt;
		imc = peso / alt2;
		System.out.printf("Seu IMC é %.1f\n", imc);
		
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		}
		else if (imc<25) {
			 System.out.println("Peso normal");
		}
		else if (imc<30) {
			System.out.println("Excesso de peso");
		}
		else if (imc<35) {
			System.out.println("Obesidade (grau I)");
		}
		else if (imc<40) {
			System.out.println("Obesidade (grau II)");
		}
		else {
			System.out.println("Obesidade (grau III)");
		}
		ler.close();
		
		
	}
}
