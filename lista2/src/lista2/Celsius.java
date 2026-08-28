package lista2;

import java.util.Scanner;

public class Celsius {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		Double c, f, f_menos;
		
		System.out.println("Entre com a temperatura em escala Fahrenheit");
		f = ler.nextDouble();
		f_menos = f-32;
		c = f_menos* 5/9;
		System.out.println("A temperatura em escala Celsius é " +c);
	
	}

}
