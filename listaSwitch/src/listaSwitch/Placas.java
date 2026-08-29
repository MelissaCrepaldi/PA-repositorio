package listaSwitch;

import java.util.Scanner;

public class Placas {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int p ;
		
		System.out.println("Insira o último número da placa do veículo");
		
		p = ler.nextInt();
		
		switch(p) {
		case 1:
		case 2:
			System.out.println("O veículo não pode andar nas Segundas-feiras ");
			break;
			
		case 3:
		case 4:
			System.out.println("O veículo não pode andar nas Terças-feiras ");
			break;
			
		case 5:
		case 6:
			System.out.println("O veículo não pode andar nas Quartas-feiras ");
			break;
			
		case 7:
		case 8:
			System.out.println("O veículo não pode andar nas Quintas-feiras");
			break;
			
		case 9:
		case 0:
			System.out.println("O veículo não pode andar nas Sextas-feiras");
			break;
			
		default:
			System.out.println("placa inválida");
			break;
		}
		
		ler.close();
	}
}
