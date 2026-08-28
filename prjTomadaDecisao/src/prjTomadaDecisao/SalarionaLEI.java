package prjTomadaDecisao;

import java.util.Scanner;

public class SalarionaLEI {
 public static void main(String [] args) {
	 Scanner read = new Scanner (System.in);
	 double valorS, valorSM;
	 
	 System.out.println("Insira o valor do salário");
	 valorS = read.nextDouble();
	 System.out.println("Insira o valor do salário mínimo na Lei");
	 valorSM = read.nextDouble();	 
	 
	 if (valorS<valorSM) {
		 System.out.println("O salário NÃO está dentro da lei");
		 System.out.println("Você recebe menos que merece. Mude de emprego ou exija mais");
	 }
	 else {
		 System.out.println("O salário está dentro da lei");
	 }
	 
	 read.close();
 }
}
