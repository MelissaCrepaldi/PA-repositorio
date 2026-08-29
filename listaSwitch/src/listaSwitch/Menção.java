package listaSwitch;

import java.util.Scanner;

public class Menção {
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		String mencao;
		
		System.out.println("Insira a menção do aluno");
		mencao = read.next();
		
		switch(mencao) {
		case ("MB"):
			System.out.println("MB significa 'Excelente Desempenho'");
			break;
		
		case ("B"):
			System.out.println("B significa 'Bom Desempenho'");
			break;
		
		case ("R"):
			System.out.println("R significa 'Desempenho Regular'");
			break;
			
		case ("I"):
			System.out.println("Desempenho Insatisfatório");
			break;
			
		default:
			System.out.println("Menção inválida");
		}
		
		read.close();
	}
}
