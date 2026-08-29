package lista5SimplesCeE;

import java.util.Scanner;

public class Exame {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1, n2, media, nE, mediaE;
		
		System.out.println("Quanto tirou na primeira prova(ou trabalho)?");
		n1 = ler.nextDouble();
		System.out.println("E quanto tirou na segunda prova(ou trabalho)?");
		n2 = ler.nextDouble();
		media = (n1 + n2) / 2;
		System.out.println("Sua média é " +media);
		
		if (media < 3) {
			System.out.println("Trago péssimas notícias. Você foi REPROVADO, boa sorte na próxima vez :(");
		}
		else if (media >= 6) {
			System.out.println("Parabéns! Você foi APROVADO! Se orgulhe do seu resultado e esforço");
		}
		else {
			System.out.println("Trago boas e más notícias. A má é que você não passou, MAS a boa notícia é que você fará um EXAME, uma segunda chance, boa sorte :)!");
			System.out.println("Quanto tirou no exame?");
			nE = ler.nextDouble();
			mediaE = (media + nE) / 2;
			System.out.println("Sua média é " +mediaE);
			
			if (mediaE >= 6) {
				System.out.println("PARABÉNS, você passou! APROVADO");
			}
			else {
				System.out.println("Infelizmente, você não passou :( está REPROVADO");
			}
		}
		ler.close();
	}
}
