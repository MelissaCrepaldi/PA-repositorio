import java.util.Scanner;

public class Mencao {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		String mencao;
		System.out.println("Insira a menção do aluno");
		mencao = ler.next();
		
		switch(mencao) {
		case ("MB"):
			System.out.println("'MB' quer dizer 'Excelente Desempenho'");
			break;
		
		case ("B"):
			System.out.println("'B' quer dizer 'Bom Desempenho'");
			break;
		
		case ("R"):
			System.out.println("'R' quer dizer 'Desempenho Regular'");
			break;
			
		case ("I"):
			System.out.println("'I' quer dizer Desempenho Insatisfatório");
			break;
			
		default:
			System.out.println("Menção inválida");
		}
	}
}
