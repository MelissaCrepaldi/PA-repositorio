package lista4DecisaoComposta;

import java.util.Scanner;

public class GastoMédio {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double disP, capT, gastM;
		System.out.println("Entre com o valor da distância percorrida");
		disP = ler.nextDouble();
		System.out.println("Entre com o valor da capacidade do tanque de combustível");
		capT = ler.nextDouble();
		gastM = disP/capT;
		System.out.println("O gasto médio é de " +gastM+ "km/L");
		if (gastM >=10 ) {
			System.out.println("O carro é econômico");
		}
		else {
			System.out.println("O carro não é econômico");
		}
		ler.close();
		

	}
}