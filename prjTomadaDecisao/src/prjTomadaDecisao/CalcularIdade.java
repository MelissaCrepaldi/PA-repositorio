package prjTomadaDecisao;

import java.util.Scanner;

class CalcularIdade {
	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
	int anoAtual, anoNasc, idade;
	
	System.out.println("insira o ano atual");
	anoAtual = read.nextInt();
	System.out.println("Insira o ano de nascimento");
	anoNasc = read.nextInt();
	idade = anoAtual - anoNasc;
	System.out.println("A idade é " +idade);
	
	if(idade<18) {
		System.out.println("O indivíduo é menor de idade");
	}
	else {
		System.out.println("O indivíduo é maior de idade");
	}

	read.close();
}
}