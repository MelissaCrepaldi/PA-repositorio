package lista3;

import java.util.Scanner;

public class LataDeTinta {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double comprimento, largura, area, q_l, quantidadeLatas;
		
		System.out.println("insira o valor do comprimento");
		comprimento = ler.nextDouble(); //insira o comprimento da parede
		System.out.println("insira o valor da largura");
		largura = ler.nextDouble(); //insira a largura da parede
		area = comprimento*largura;
		q_l = 3.8;
		quantidadeLatas = area/q_l;
		System.out.printf ("A quantidade de latas necessárias para a pintura da parede é %.2f" ,quantidadeLatas);
	}

}
