package lista2;

import java.util.Scanner; 

public class Prestação {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		Double valor, taxa, taxaCompleta, tempoTaxado, valor_2, tempo, prestacao; 
		
		System.out.println("Entre com o valor original");
		valor = ler.nextDouble();
		System.out.println("Entre com o valor da taxa");
		taxa = ler.nextDouble();
		System.out.println("Entre com o intervalo de tempo");
		tempo = ler.nextDouble(); 
		taxaCompleta = taxa/100;
		tempoTaxado = taxaCompleta*tempo;
		valor_2 = valor*tempoTaxado;
		prestacao = valor+valor_2;
		System.out.println("O valor da prestação é = "+prestacao);
				
		
		}

}
