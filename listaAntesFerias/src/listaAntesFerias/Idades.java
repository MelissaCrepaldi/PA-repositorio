package listaAntesFerias;

import java.util.Scanner;

public class Idades {
	 public static void main(String[] args) {

	        Scanner ler= new Scanner(System.in);

	        String nome1, nome2;
	        int idade1, idade2;

	        System.out.println("Digite o nome do primeiro usuário:");
	        nome1 = ler.next();

	        System.out.println("Digite a idade do primeiro usuário:");
	        idade1 = ler.nextInt();

	        System.out.println("Digite o nome do segundo usuário:");
	        nome2 = ler.next();

	        System.out.println("Digite a idade do segundo usuário:");
	        idade2 = ler.nextInt();

	        if (idade1 > idade2) {

	            System.out.println("Mais velho: " + nome1 + " - " + idade1 + " anos");
	            System.out.println("Mais novo: " + nome2 + " - " + idade2 + " anos");

	        } else if (idade2 > idade1) {

	            System.out.println("Mais velho: " + nome2 + " - " + idade2 + " anos");
	            System.out.println("Mais novo: " + nome1 + " - " + idade1 + " anos");

	        } else {

	            System.out.println("Os dois têm a mesma idade.");

	        }

	        ler.close();
	    }
}
