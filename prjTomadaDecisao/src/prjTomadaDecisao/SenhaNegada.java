package prjTomadaDecisao;

import java.util.Scanner;

public class SenhaNegada {
 public static void main(String []args) {
 	Scanner read = new Scanner (System.in);
 	String senha, senhaUsu;
 	
 	System.out.println("Insira sua senha");
 	senhaUsu = read.next();
 	
 	if(senhaUsu.equalsIgnoreCase("undertaleGoat123")) {
 		System.out.println("Acesso permitido");
 	}
 	
 	else {
 		System.out.println("Acesso negado.");
 	}
 	
 	System.out.println("Tente Novamente");
 	senhaUsu = read.next();
 	
 	if(senhaUsu.equals("undertaleGoat123")) {
 		System.out.println("Acesso permitido");
 	}
 	
 	else {
 		System.out.println("Acesso negado. Tente Novamente mais tarde");
 	}
 	
 	read.close();
}
}