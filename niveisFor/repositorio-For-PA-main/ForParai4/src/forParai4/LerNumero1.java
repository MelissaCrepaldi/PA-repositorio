package forParai4;

import java.util.Scanner;

public class LerNumero1 {
	public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in) ;
		 int i, num;
		 
		 System.out.println("Escolha um número : ");
		 num = ler.nextInt();
		 
		 for (i=1; i<=num; i++) {
			 System.out.println(i);
		 }
	}
}
