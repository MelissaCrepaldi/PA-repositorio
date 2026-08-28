package lista3;

import java.util.Scanner;

public class Guloseimas {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double qnt_SalgadosH, qnt_SalgadosM, qnt_SalgadosT, qnt_DocesH, qnt_DocesM, qnt_DocesT , qnt_Bolo, qnt_Convidados, grama, quilo, ml_H, ml_M, bebidaH, bebidaM, qnt_BebidaH, qnt_BebidaM, qnt_BebidaT;
		int qnt_H, qnt_M;
		
		System.out.println("insira a quantidade de convidados masculinos");
		qnt_H = ler.nextInt();
		System.out.println("insira a quantidade de convidadas femininas");
		qnt_M = ler.nextInt();
		qnt_SalgadosH = qnt_H*15;
		qnt_SalgadosM = qnt_M*10;
		qnt_SalgadosT = qnt_SalgadosH + qnt_SalgadosM;
		
		
		qnt_DocesH = qnt_H*6;
		qnt_DocesM = qnt_M*8;
		qnt_DocesT = qnt_DocesH + qnt_DocesM;
		
		
		grama = 100;
		quilo = grama/1000;
		qnt_Convidados = qnt_H + qnt_M;
		qnt_Bolo = qnt_Convidados * quilo;
		
		
		ml_H = 600;
		ml_M = 500;
		bebidaH = ml_H/1000;
		bebidaM = ml_M/1000;
		qnt_BebidaH = qnt_H * bebidaH;
		qnt_BebidaM = qnt_M * bebidaM;
		qnt_BebidaT = qnt_BebidaH + qnt_BebidaM;
		
		
		System.out.println("LISTA DE COMPRAS PARA A FESTA");
		System.out.println("A quantidade a ser comprada: ");
		System.out.println("em SALGADO é " +qnt_SalgadosT + " unidades");
		System.out.println("em DOCES é " +qnt_DocesT + " unidades");
		System.out.println("em BOLO é " +qnt_Bolo + " kilos");
		System.out.println("em BEBIDA é " +qnt_BebidaT + " litros");
		
		
	}

}
