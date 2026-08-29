package listaAntesFerias;

import java.util.Scanner;

public class senhaAprovada {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		String senha, senhaUsu;
		
		System.out.println("Insira sua senha");
		senhaUsu = ler.next();
		
		if (senhaUsu.equalsIgnoreCase("undertalegoat67")) {
			System.out.println("Acesso permitido");
		}
		
		else {
			System.out.println("Acesso Negado");
		}
		
		ler.close();
		}
}
