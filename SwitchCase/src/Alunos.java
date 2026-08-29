import java.util.Scanner;

public class Alunos {
	public static void main(String [] args) {

		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Insira a idade do aluno");
		idade = ler.nextInt();
		switch(idade) {
			case 6:
				System.out.println("A categoria do aluno é 'dente de leite'");
				break;
			case 7:
				System.out.println("A categoria do aluno é 'júnior'");
				break;
			case 8:
				System.out.println("A categoria do aluno é 'júnior max'");
				break;
			case 9:
				System.out.println("A categoria do aluno é 'júnior master'");
				break;
			case 10:
				System.out.println("A categoria do aluno é 'master'");
				break;
			default:
				System.out.println("Categoria Inválida");
		}
		
		ler.close();
	}
}
