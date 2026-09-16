import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		 int i=1, idade, f1=0, f2=0, f3=0, f4=0, f5 =0;
		 double p1, p2, p3, p4, p5;
		 
		 while (i < 11) {
			 System.out.println("Insira a idade da " +i+ "o pessoa");
			 idade = ler.nextInt();
			 
			 if (idade <= 15) {
				 f1 = f1 + 1;
			 }
			 else if (idade <=30) {
				 f2 = f2 + 1;
			 }
			 else if (idade <= 45) {
				 f3 = f3 + 1;
			 }
			 else if (idade <= 60) {
				 f4 = f4 + 1;	 
			 }
			 else {
				 f5 = f5 + 1;
			 }
			 
			 i = i + 1;
		 }
		 
		 	p1 = (f1/10.0) * 100;
		 	p2 = (f2/10.0) * 100;
		 	p3 = (f3/10.0) * 100;
		 	p4 = (f4/10.0) * 100;
		 	p5 = (f5/10.0) * 100;
		 	
		 	System.out.println("Quantidade na 1ª faixa - até 15 anos: " + f1);
		 	System.out.println("Porcentagem na 1ª faixa: " + p1 + "%");
		 	
		 	System.out.println("Quantidade na 2ª faixa - De 16 até 30 anos: " + f2);
		 	System.out.println("Porcentagem na 2ª faixa: " + p2 + "%");
		 	
		 	System.out.println("Quantidade na 3ª faixa - De 31 até 45 anos: " + f3);
		 	System.out.println("Porcentagem na 3ª faixa: " + p3 + "%");
		 	
		 	System.out.println("Quantidade na 4ª faixa - De 46 até 60 anos: " + f4);
		 	System.out.println("Porcentagem na 4ª faixa: " + p4 + "%");
		 	
		 	System.out.println("Quantidade na 5ª faixa - Acima de 61 anos: " + f5);
		 	System.out.println("Porcentagem na 5ª faixa: " + p5 + "%");
		 	
		 	ler.close();
	}
}
