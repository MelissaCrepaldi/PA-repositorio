package forParai3;

public class SomaPar1ate100 {
	public static void main(String[] args) {
		int i, soma;
		soma = 0;
		
		for (i=1; i<=100; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
				
			}
		}
		System.out.println(soma);
	}
}
