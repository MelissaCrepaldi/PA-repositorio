package forParai3;

public class FatoriaLate10 {
	public static void main(String[] args) {
		int i, pro;
		pro = 1;
		
		for (i=1; i<=10; i++) {
			pro = pro * i;
		}
		
		System.out.println("O resultado do produto de 1 até 10 é: " +pro);
	}
}
