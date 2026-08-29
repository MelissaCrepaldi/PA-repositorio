package listaSwitch;

import java.util.Scanner;

public class Idade {
	public static void main(String [] args) {
		Scanner read = new Scanner (System.in);
		int idade;
		System.out.println("Informe a idade do aluno");
		
		idade = read.nextInt();
		switch(idade) {
			case 6:
				System.out.println("A categoria do aluno é dente de leite");
				break;
			case 7:
				System.out.println("A categoria do aluno é júnior");
				break;
			case 8:
				System.out.println("A categoria do aluno é júnior max");
				break;
			case 9:
				System.out.println("A categoria do aluno é júnior master");
				break;
			case 10:
				System.out.println("A categoria do aluno é máster");
				break;
			default:
				System.out.println("categoria inválida");
		}
		
		read.close();
	}
}
