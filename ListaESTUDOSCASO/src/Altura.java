import java.util.Scanner;

public class Altura {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		int ano;
		double alturaJ, alturaP;
		alturaJ = 134;
		alturaP = 145;
		
		System.out.println("Insira o ano que deseja");
		ano = ler.nextInt();
		
		while (alturaJ < alturaP) {
			alturaJ = alturaJ + 2.5;
			alturaP = alturaP + 2.0;
			
			ano = ano +1;
			
		}
		
		alturaJ = alturaJ / 100;
		
		System.out.println("João vai ser mais alto que Pedro no ano de " +ano+ " com a altura de " +alturaJ);		
		
		ler.close();
	}
}
