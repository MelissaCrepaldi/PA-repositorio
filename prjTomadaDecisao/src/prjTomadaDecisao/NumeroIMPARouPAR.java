package prjTomadaDecisao;

import java.util.Scanner;

public class NumeroIMPARouPAR {
	public static void main(String [] args) {
		Scanner read = new Scanner (System.in);
		int nI, resto;
		
		System.out.println("Insira o número inteiro"); 
		nI = read.nextInt();
		resto = nI % 2;
		if (resto == 0){
			System.out.println("O número é par(logo, do bem)");
		}
		else {
			System.out.println("O número é ímpar(logo, do mal)");
		}
		
		read.close();
	}

}
