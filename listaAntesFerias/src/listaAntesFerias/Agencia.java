package listaAntesFerias;

import java.util.Scanner;

public class Agencia {
	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int destino, periodo;
        double total;

        System.out.println("Escolha o seu destino:");
        System.out.println("1 - Ilhabela");
        System.out.println("2 - Fernando de Noronha");
        destino = ler.nextInt();

        System.out.println("Quantos dias?");
        periodo = ler.nextInt();

        if (destino == 1) {

            if (periodo <= 5) {
                total = periodo * 240;
            } else if (periodo <= 10) {
                total = (periodo * 220) + 130;
            } else {
                total = (periodo * 210) + 150;
            }

            System.out.println("Valor total: R$ " + total);

        } else if (destino == 2) {

            if (periodo <= 5) {
                total = (periodo * 400) + 100;
            } 
            else if (periodo <= 10) {
                total = (periodo * 410) + 150;
            } 
            else {
                total = (periodo * 420) + 200;
            }

            System.out.println("Valor total: R$ " + total);

        } else {

            System.out.println("Destino inválido.");

        }

        ler.close();
    }
}
